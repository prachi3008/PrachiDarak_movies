package com.example.moviesapp.common.navigation

import android.app.Activity
import android.content.Intent
import com.example.moviesapp.ui.home.HomeActivity

fun Activity.navigateToHome() {
    this.startActivity(Intent(this, HomeActivity::class.java))
    this.finish()
}