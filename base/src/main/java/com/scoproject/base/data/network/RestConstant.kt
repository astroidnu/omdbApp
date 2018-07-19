package com.scoproject.base.data.network

import com.scoproject.base.BuildConfig

/**
 * Created by ibnumuzzakkir on 07/05/18.
 * Android Engineer
 * SCO Project
 */
object RestConstant {
    const val api_key = "apikey=${BuildConfig.API_KEY}"


    /**
     * List of end point Rest API
     * */

    const val movieSearch = "${BuildConfig.BASE_URL}?s={keyword}&$api_key"

}