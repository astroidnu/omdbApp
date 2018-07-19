package com.scoproject.movieapp.feature.movielist.presentation.view

import android.os.Bundle
import com.scoproject.base.presentation.ui.activity.BaseActivity
import com.scoproject.movieapp.R
import com.scoproject.movieapp.feature.movielist.presentation.contract.MovieListContract
import com.scoproject.movieapp.feature.movielist.presentation.presenter.MovieListPresenter
import dagger.android.AndroidInjection
import javax.inject.Inject

/**
 * Created by ibnumuzzakkir on 20/07/18.
 * Mobile Engineer
 */
class MovieListActivity : BaseActivity(), MovieListContract.View {
    @Inject
    lateinit var mPresenter : MovieListPresenter

    override fun onActivityReady(savedInstanceState: Bundle?) {

    }

    override fun onAutoAndroidInjector() {
        AndroidInjection.inject(this)
    }

    override fun getLayoutId(): Int {
        return R.layout.activity_list_movie
    }

}