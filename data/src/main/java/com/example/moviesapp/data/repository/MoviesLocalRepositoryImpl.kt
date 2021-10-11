package com.example.moviesapp.data.repository

import android.content.Context
import com.example.moviesapp.domain.repository.MoviesLocalRepository
import com.example.moviesapp.model.Movie
import com.example.moviesapp.data.sources.local.db.MoviesDatabase
import com.example.moviesapp.data.sources.local.mapper.MoviesLocalMapper
import io.reactivex.Completable
import io.reactivex.Observable
import io.reactivex.Single

class MoviesLocalRepositoryImpl(val context: Context) : MoviesLocalRepository {

    private val moviesLocalMapper = MoviesLocalMapper()

    override fun getFavoriteMovies(): Observable<List<Movie>> {
        return MoviesDatabase.invoke(context).movieDao().getFavoriteMovies().map {
            it.map { movie ->
                moviesLocalMapper.mapFromLocal(movie)
            }
        }
    }

    override fun getFavoriteMovie(id: Int): Single<Movie> {
        return MoviesDatabase.invoke(context).movieDao().getFavoriteMovie(id).map {
            moviesLocalMapper.mapFromLocal(it)
        }
    }

    override fun addFavoriteMovie(movie: Movie): Completable {
        return MoviesDatabase.invoke(context).movieDao()
            .addFavoriteMovie(moviesLocalMapper.mapToLocal(movie))
    }

    override fun deleteFavoriteMovie(movie: Movie): Completable {
        return MoviesDatabase.invoke(context).movieDao()
            .deleteFavoriteMovie(moviesLocalMapper.mapToLocal(movie))
    }

    override fun updateFavoriteMovie(movie: Movie): Completable {
        return MoviesDatabase.invoke(context).movieDao()
            .updateFavoriteMovie(moviesLocalMapper.mapToLocal(movie))
    }

}