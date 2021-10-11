package com.example.moviesapp.domain.interactor

import com.example.moviesapp.domain.repository.MoviesLocalRepository
import com.example.moviesapp.model.Movie
import io.reactivex.Single

class GetFavoriteMovieUseCase(private val moviesLocalRepository: MoviesLocalRepository) {

    fun execute(id: Int): Single<Movie> {
        return moviesLocalRepository.getFavoriteMovie(id)
    }

}