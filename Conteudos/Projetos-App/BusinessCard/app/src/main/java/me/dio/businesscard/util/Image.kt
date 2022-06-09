package me.dio.businesscard.util

import android.content.ContentValues
import android.content.Context
import android.content.Intent
import android.graphics.Bitmap
import android.graphics.Canvas
import android.net.Uri
import android.os.Build
import android.os.Environment
import android.provider.MediaStore
import android.util.Log
import android.view.View
import android.widget.Toast
import java.io.File
import java.io.FileOutputStream
import java.io.OutputStream

class Image {
    fun share(context:Context,card:View){
        val bitmap = getScreenShotFromView(card)
        bitmap?.let{
            saveMediaToStorage(context,bitmap)
        }
    }

    private fun saveMediaToStorage(context: Context,bitmap: Bitmap) {
        val filename="${System.currentTimeMillis()}.jpg"
        var fos:OutputStream? = null
        if(Build.VERSION.SDK_INT>=Build.VERSION_CODES.Q){
            context.contentResolver?.also { resolver ->
                val contentValues = ContentValues().apply {
                    put(MediaStore.MediaColumns.DISPLAY_NAME,filename)
                    put(MediaStore.MediaColumns.MIME_TYPE,"image/jpg")
                    put(MediaStore.MediaColumns.RELATIVE_PATH,Environment.DIRECTORY_PICTURES)
                }

                val imageUri:Uri?=resolver.insert(MediaStore.Images.Media.EXTERNAL_CONTENT_URI,contentValues)
                fos=imageUri?.let { shareIntent(context,imageUri) }

            }
        } else {
            //Devices mentores que Q
            val imagesDir=context.getExternalFilesDir(Environment.DIRECTORY_PICTURES)
            val image = File(imagesDir,filename)
            shareIntent(context,Uri.fromFile(image))
            fos=FileOutputStream(image)
        }
        fos?.use {
            bitmap.compress(Bitmap.CompressFormat.JPEG,100,it)
            Toast.makeText(context,"Imagem capturada com sucesso!",Toast.LENGTH_SHORT).show()
        }
    }

    private fun shareIntent(context: Context, imageUri: Uri) {
        var shareIntent:Intent= Intent().apply{
            action=Intent.ACTION_SEND;
            putExtra(Intent.EXTRA_STREAM,imageUri)
            type="image/jpeg"
        }
        context.startActivity(
            Intent.createChooser(
                shareIntent,
                context.resources.getText("Compartilhar")
            )
        )
    }


    private fun getScreenShotFromView(card: View): Bitmap? {
        var screenshot:Bitmap? = null
        try{
            screenshot=Bitmap.createBitmap(
                card.measuredWidth,
                card.measuredHeight,
                Bitmap.Config.ARGB_8888
            )
            val canvas= Canvas(screenshot)
            card.draw(canvas)
        } catch (e:Exception){
            Log.e("Error ->","Falha ao captura imagem")
        }
        return screenshot
    }

}