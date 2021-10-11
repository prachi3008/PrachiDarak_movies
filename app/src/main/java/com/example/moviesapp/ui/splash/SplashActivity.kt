package com.example.moviesapp.ui.splash

import android.os.Bundle
import com.example.moviesapp.base.BaseActivity
import com.example.moviesapp.common.navigation.navigateToHome

class SplashActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        navigateToHome()
    }

}