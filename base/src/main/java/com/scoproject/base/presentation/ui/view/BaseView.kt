package com.scoproject.base.presentation.ui.view

import com.scoproject.base.presentation.ui.presenter.BasePresenter


/**
 * Created by ibnumuzzakkir on 08/05/18.
 * Android Engineer
 * SCO Project
 */

interface BaseView{
    fun setPresenter(presenter: BasePresenter<*>)
}