package com.example.moviesapp.domain.repository

import com.example.moviesapp.model.Movie
import io.reactivex.Completable
import io.reactivex.Observable
import io.reactivex.Single

interface MoviesLocalRepository {

    fun getFavoriteMovies(): Observable<List<Movie>>

    fun getFavoriteMovie(id: Int): Single<Movie>

    fun addFavoriteMovie(movie: Movie): Completable

    fun deleteFavoriteMovie(movie: Movie): Completable

    fun updateFavoriteMovie(movie: Movie): Completable

}