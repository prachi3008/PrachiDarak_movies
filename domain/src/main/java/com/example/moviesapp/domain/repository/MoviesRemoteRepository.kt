package com.example.moviesapp.domain.repository

import com.example.moviesapp.model.MovieDetail
import com.example.moviesapp.model.MoviesResponse
import io.reactivex.Single

interface MoviesRemoteRepository {

    fun getPopularMovies(page: Int): Single<MoviesResponse>

    fun getUpcomingMovies(page: Int): Single<MoviesResponse>

    fun getSingleMovie(id: String): Single<MovieDetail>

}