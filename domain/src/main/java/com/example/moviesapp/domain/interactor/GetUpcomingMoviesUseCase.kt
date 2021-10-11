package com.example.moviesapp.domain.interactor

import com.example.moviesapp.domain.repository.MoviesRemoteRepository
import com.example.moviesapp.model.MoviesResponse
import io.reactivex.Single

class GetUpcomingMoviesUseCase(private val moviesRemoteRepository: MoviesRemoteRepository) {

    fun execute(page: Int): Single<MoviesResponse> {
        return moviesRemoteRepository.getUpcomingMovies(page)
    }

}