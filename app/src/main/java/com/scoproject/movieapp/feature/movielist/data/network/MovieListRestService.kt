package com.scoproject.movieapp.feature.movielist.data.network

import com.scoproject.base.data.network.RestConstant
import com.scoproject.movieapp.feature.movielist.data.response.MovieList
import io.reactivex.Observable
import retrofit2.http.GET
import retrofit2.http.Query

/**
 * Created by ibnumuzzakkir on 20/07/18.
 * Mobile Engineer
 */
interface MovieListRestService {
    @GET(RestConstant.movieSearch)
    fun getMovieList(@Query("keyword") type: String) : Observable<MovieList>
}