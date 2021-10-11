package com.example.moviesapp.domain.interactor

import com.example.moviesapp.domain.repository.MoviesLocalRepository
import com.example.moviesapp.model.Movie
import io.reactivex.Completable

class AddFavoriteMovieUseCase(private val moviesLocalRepository: MoviesLocalRepository) {

    fun execute(movie: Movie): Completable {
        return moviesLocalRepository.addFavoriteMovie(movie)
    }

}