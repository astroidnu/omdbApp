package com.scoproject.movieapp.feature.movielist.presentation.presenter

import com.scoproject.base.external.scheduler.SchedulerProvider
import com.scoproject.base.presentation.ui.presenter.BasePresenter
import com.scoproject.movieapp.feature.movielist.presentation.contract.MovieListContract
import javax.inject.Inject

/**
 * Created by ibnumuzzakkir on 20/07/18.
 * Mobile Engineer
 */
class MovieListPresenter @Inject constructor(schedulerProvider: SchedulerProvider):
        BasePresenter<MovieListContract.View>(schedulerProvider), MovieListContract.UserActionListener{

}