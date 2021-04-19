package com.example.ran.exo3serie3

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.content.res.Configuration
import android.widget.Button
import android.support.v4.content.ContextCompat

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

    override fun onConfigurationChanged(newConfig: Configuration) {
            var btn: Button? = null
            super.onConfigurationChanged(newConfig)
        // use your setcontentView here
        btn=findViewById<Button>(R.id.button5)
        btn.setBackgroundColor(ContextCompat.getColor(applicationContext, R.color.red))
        setContentView(R.layout.activity_main)

    }
}
