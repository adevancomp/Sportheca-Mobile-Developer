package dio.me.calculadoraequacao

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val botao = bOperacao
        val resultado = tvResultado

        botao?.setOnClickListener{
            var edA = etConstantA
            var edB = etConstantB
            var edC = etConstantC

            //verificar se todos os campos estão preenchidos para efetuar os cálculos
            if((edA.text.isEmpty()||edB.text.isEmpty()||edC.text.isEmpty())||(edA.text.isBlank()||edB.text.isBlank()||edC.text.isBlank())){
                resultado.setTextColor(Color.RED)
                resultado.setText("Desculpe ! Entrada invalida.")
            } else {
                // neste caso faço a operaçao
                val a=edA.text.toString().toFloat()
                val b=edB.text.toString().toFloat()
                val c=edC.text.toString().toFloat()

                if(Math.abs(a).toInt().equals(0)){
                    resultado.setTextColor(Color.RED)
                    resultado.setText("a não pode ser zero !")
                } else {
                    val delta = Math.pow(b.toDouble(),2.0) - 4*a*c
                    if(delta<0){
                        //significa que não existem raízes reais então devo informar
                        resultado.setTextColor(Color.RED)
                        resultado.setText("Não existem raízes reais!Delta: %.3f".format(delta))
                    } else{
                        val r1 = (-b+Math.sqrt(delta))/2*a
                        val r2 = (-b-Math.sqrt(delta))/2*a

                        resultado.setTextColor(Color.GREEN)
                        resultado.setText("As raizes reais sao r1:%.3f e r2:%.3f !".format(r1,r2))
                    }
                }
            }
        }
    }
}