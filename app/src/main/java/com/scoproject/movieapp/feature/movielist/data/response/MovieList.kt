package com.scoproject.movieapp.feature.movielist.data.response

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

/**
 * Created by ibnumuzzakkir on 20/07/18.
 * Mobile Engineer
 */
sealed class MovieList {
    data class Response (
            @SerializedName("Search")
            @Expose
            var movieList: List<Movie>? = null
    )

    data class Movie (
           val Title : String,
           val Year : String,
           val imdbID : String,
           val type : String,
           val Poster : String
    )
}