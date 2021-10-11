package com.example.moviesapp.domain.interactor

import com.example.moviesapp.domain.repository.MoviesLocalRepository
import com.example.moviesapp.model.Movie
import io.reactivex.Observable

class GetFavoriteMoviesUseCase(private val moviesLocalRepository: MoviesLocalRepository) {

    fun execute(): Observable<List<Movie>> {
        return moviesLocalRepository.getFavoriteMovies()
    }

}