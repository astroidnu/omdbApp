package com.scoproject.movieapp.feature.movielist.di.module

import com.scoproject.base.di.scope.ActivityScope
import com.scoproject.movieapp.feature.movielist.data.network.MovieListRestService
import dagger.Module
import dagger.Provides
import retrofit2.Retrofit

/**
 * Created by ibnumuzzakkir on 20/07/18.
 * Mobile Engineer
 */
@Module
class MovieListNetworkModule {
    @Provides @ActivityScope
    fun provideMovieListRestService(retrofit: Retrofit): MovieListRestService =
            retrofit.create(MovieListRestService::class.java)
}