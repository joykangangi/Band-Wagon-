package com.example.bandwagon

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.Window
import android.view.WindowManager

class firstActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
            //hide title bar of this activity
        window.requestFeature(Window.FEATURE_NO_TITLE)
        //making thie activity full screen
        window.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN)
        setContentView(R.layout.activity_first)

        //2second splash time
        Handler().postDelayed({
            //start main activity
            startActivity(Intent(this@firstActivity, MainActivity::class.java))
            //finish activity
            finish()
        },2000)
    }
}
