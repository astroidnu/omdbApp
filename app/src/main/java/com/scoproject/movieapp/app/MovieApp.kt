package com.scoproject.movieapp.app

import android.app.Activity
import android.content.Context
import android.support.multidex.MultiDex
import android.support.multidex.MultiDexApplication
import com.scoproject.movieapp.app.di.component.AppComponent
import com.scoproject.movieapp.app.di.component.DaggerAppComponent
import dagger.android.AndroidInjector
import dagger.android.DispatchingAndroidInjector
import dagger.android.HasActivityInjector
import javax.inject.Inject

/**
 * Created by ibnumuzzakkir on 20/07/18.
 * Mobile Engineer
 */
class MovieApp : MultiDexApplication(), HasActivityInjector {
    companion object {
        @JvmStatic
        lateinit var instance: MovieApp
        @JvmStatic
        lateinit var appComponent: AppComponent
    }


    @Inject
    lateinit var mActivityDispatchingAndroidInjector: DispatchingAndroidInjector<Activity>



    override fun attachBaseContext(base: Context?) {
        super.attachBaseContext(base)
        //Initialize Multidex for prevent limit over 80k method
        MultiDex.install(this)
    }


    override fun onCreate() {
        super.onCreate()
        //Set Instance
        instance = this
        //Create App Component
        appComponent = createComponent()
        appComponent.inject(this)
    }



    override fun activityInjector(): AndroidInjector<Activity> {
        return mActivityDispatchingAndroidInjector
    }

    /**
     * Initialize Dependency Injection With Dagger
     * Level DI Application
     * */


    fun createComponent(): AppComponent {
        return DaggerAppComponent.builder()
                .application(this)
                .build()
    }


}