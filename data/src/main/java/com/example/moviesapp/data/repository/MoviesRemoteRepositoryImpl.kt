package com.example.moviesapp.data.repository

import com.example.moviesapp.domain.repository.MoviesRemoteRepository
import com.example.moviesapp.model.MovieDetail
import com.example.moviesapp.model.MoviesResponse
import com.example.moviesapp.data.sources.remote.api.ApiClient
import com.example.moviesapp.data.sources.remote.mapper.MoviesRemoteMapper
import io.reactivex.Single

class MoviesRemoteRepositoryImpl : MoviesRemoteRepository {

    private val moviesRemoteMapper = MoviesRemoteMapper()

    override fun getPopularMovies(page: Int): Single<MoviesResponse> {
        return ApiClient.movieService().getPopularMovies(page).map {
            moviesRemoteMapper.mapFromRemote(it)
        }
    }

    override fun getUpcomingMovies(page: Int): Single<MoviesResponse> {
        return ApiClient.movieService().getUpcomingMovies(page).map {
            moviesRemoteMapper.mapFromRemote(it)
        }
    }

    override fun getSingleMovie(id: String): Single<MovieDetail> {
        return ApiClient.movieService().getSingleMovie(id).map {
            moviesRemoteMapper.mapDetailFromRemote(it)
        }
    }

}