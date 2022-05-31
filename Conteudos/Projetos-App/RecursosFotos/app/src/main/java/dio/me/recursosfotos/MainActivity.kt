package dio.me.recursosfotos

import android.Manifest
import android.content.pm.PackageManager
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        bt_pick.setOnClickListener {
            if(Build.VERSION.SDK_INT>=Build.VERSION_CODES.M){
                if(checkSelfPermission(Manifest.permission.READ_EXTERNAL_STORAGE)
                ==PackageManager.PERMISSION_DENIED) {
                    val permission = arrayOf(Manifest.permission.READ_EXTERNAL_STORAGE)
                    requestPermissions(permission,PERMISSION_CODE)
                } else {
                    pickImageFromGallery()
                }
            } else {
                pickImageFromGallery()
            }
        }
    }

    override fun onRequestPermissionsResult(
        requestCode: Int,
        permissions: Array<out String>,
        grantResults: IntArray
    ) {
        when(requestCode){
            PERMISSION_CODE -> {
                if(grantResults.isNotEmpty() && grantResults[0]==PackageManager.PERMISSION_GRANTED){
                    pickImageFromGallery()
                } else {
                    Toast.makeText(this,"Permissão Negada !",Toast.LENGTH_SHORT)
                }
            }
        }
        super.onRequestPermissionsResult(requestCode, permissions, grantResults)
    }

    private fun pickImageFromGallery() {
        TODO("Not yet implemented")
    }

    companion object{
        private val PERMISSION_CODE = 1000
        private val IMAGE_PICK_CODE = 1001
    }
}