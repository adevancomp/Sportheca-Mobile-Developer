package me.dio.businesscard.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.activity.viewModels
import me.dio.businesscard.App
import me.dio.businesscard.data.BusinessCard
import me.dio.businesscard.databinding.ActivityAddBusinessCardBinding

class AddBusinessCardActivity : AppCompatActivity() {
    private lateinit var binding:ActivityAddBusinessCardBinding
    private val mainViewModel: MainViewModel by viewModels {
        MainViewModelFactory((application as App).repository)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityAddBusinessCardBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
    private fun insertListerners(){
        binding.btnClose.setOnClickListener{
            finish() // close one activity
        }
        binding.btnConfirm.setOnClickListener {
            val businessCard=BusinessCard(
                nome=binding.tilNome.editText?.text.toString(),
                empresa=binding.tilEmpresa.editText?.text.toString(),
                telefone = binding.tilTelefone.editText?.text.toString(),
                email=binding.tilEmail.editText?.text.toString(),
                fundoPersonalizado = binding.tilCor.editText?.text.toString()
            )
            mainViewModel.insert(businessCard)//persistir os dados
            Toast.makeText(this, "Cartão Cadastrado com sucesso",Toast.LENGTH_SHORT).show()
            finish()
        }
    }
}