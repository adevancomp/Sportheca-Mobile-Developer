package dio.me.imc

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setListernes()
    }

    private fun setListernes(){
        val botao=btCalcular
        botao.setOnClickListener {
            val altura = etAltura
            val peso = etPeso

            if(!altura.text.isNullOrEmpty()||!peso.text.isNullOrEmpty()){
                val imc = peso.text.toString().toFloat() / Math.pow(altura.text.toString().toDouble(),2.0)
                var resultado = tvResultado
                resultado.setText("imc: {:.2f}".format(imc))
            }

        }
    }

}