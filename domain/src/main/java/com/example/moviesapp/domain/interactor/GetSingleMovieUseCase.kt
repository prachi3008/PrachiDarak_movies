package com.example.moviesapp.domain.interactor

import com.example.moviesapp.domain.repository.MoviesRemoteRepository
import com.example.moviesapp.model.MovieDetail
import io.reactivex.Single

class GetSingleMovieUseCase(private val moviesRemoteRepository: MoviesRemoteRepository) {

    fun execute(id: String): Single<MovieDetail> {
        return moviesRemoteRepository.getSingleMovie(id)
    }

}