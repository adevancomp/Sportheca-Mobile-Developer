package br.com.dio.app.repositories.data.repositories

import br.com.dio.app.repositories.data.model.Repo
import br.com.dio.app.repositories.data.services.GithubService
import kotlinx.coroutines.flow.flow

class RepoRepositoryImpl(private val service:GithubService):RepoRepository {
    override suspend fun listRepositories(user: String) = flow {
        val repoList = service.listRepositories(user)
        emit(repoList)
    }
}