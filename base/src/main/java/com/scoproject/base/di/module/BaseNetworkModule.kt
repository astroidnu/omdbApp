package com.scoproject.base.di.module

import android.app.Application
import dagger.Module
import dagger.Provides
import okhttp3.Cache
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import java.util.concurrent.TimeUnit

/**
 * Created by ibnumuzzakkir on 19/07/18.
 * Mobile Engineer
 */
@Module
class BaseNetworkModule {

    @Provides
    fun provideOkhttpClient(application: Application): OkHttpClient {
        val cache = Cache(application.cacheDir, 10 * 1024 * 1024)

        val loggingInterceptor = HttpLoggingInterceptor()
        loggingInterceptor.level = HttpLoggingInterceptor.Level.BODY

        return  OkHttpClient.Builder()
                .addInterceptor(loggingInterceptor)
                .cache(cache)
                .writeTimeout(60, TimeUnit.SECONDS)
                .readTimeout(60, TimeUnit.SECONDS)
                .connectTimeout(60, TimeUnit.SECONDS)
                .build()
    }
//
//    @Provides
//    fun provideRestClient(okHttpClient: OkHttpClient): Retrofit {
//        val builder = Retrofit.Builder()
//        builder.client(okHttpClient)
//                .baseUrl(BuildConfig.URL_BASE)
//                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
//                .addConverterFactory(GsonConverterFactory.create())
//        return builder.build()
//    }
}