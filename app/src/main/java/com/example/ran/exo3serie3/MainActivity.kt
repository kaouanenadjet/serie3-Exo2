package com.example.ran.exo3serie3

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.content.res.Configuration
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

    override fun onConfigurationChanged(newConfig: Configuration) {
            super.onConfigurationChanged(newConfig)
        // use your setcontentView here
            setContentView(R.layout.activity_main_other)

    }
}
