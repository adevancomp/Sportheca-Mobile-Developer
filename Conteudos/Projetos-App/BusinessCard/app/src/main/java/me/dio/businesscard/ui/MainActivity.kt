package me.dio.businesscard.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import me.dio.businesscard.App
import me.dio.businesscard.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding:ActivityMainBinding

    private val mainViewModel: MainViewModel by viewModels {
        MainViewModelFactory((application as App).repository)
    }

    private val adapter by lazy{BusinessCardAdapter()}

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.rvCards.adapter=adapter
        getAllBuninessCard()
        insertListeners()
    }
    private fun insertListeners(){
        binding.fab.setOnClickListener {
            val intent = Intent(this,AddBusinessCardActivity::class.java)
            startActivity(intent)
        }
        adapter.listenerShare={
            card ->
        }
    }

    private fun getAllBuninessCard(){
        mainViewModel.getAll().observe(this,{ businessCards->
            adapter.submitList(businessCards)
        })
    }

}