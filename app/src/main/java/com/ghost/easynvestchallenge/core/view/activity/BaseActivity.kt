package com.ghost.easynvestchallenge.core.view.activity

import android.annotation.SuppressLint
import android.support.v7.app.AppCompatActivity
import android.view.MenuItem

@SuppressLint("Registered")
open class BaseActivity : AppCompatActivity() {

    protected fun setupHomeButton() = supportActionBar?.setDisplayHomeAsUpEnabled(true)

    override fun onOptionsItemSelected(item: MenuItem) = when (item.itemId) {
        android.R.id.home -> { onBackPressed(); true }
        else -> super.onOptionsItemSelected(item)
    }

}