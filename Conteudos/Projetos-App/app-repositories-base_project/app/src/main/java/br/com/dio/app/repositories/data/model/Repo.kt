package br.com.dio.app.repositories.data.model

data class Repo(
    val id:Long,
    val name:String,
    val owner:Owner,
    val stars:Int,
    val language:String,
    val description:String
)
