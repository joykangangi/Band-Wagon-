package com.example.bandwagon

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_third.*

class thirdActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_third)

           val actionBar=supportActionBar
            actionBar!!.setDisplayHomeAsUpEnabled(true)
            actionBar.setDisplayShowHomeEnabled(true)
            //get data from putExtra content

            var intent=intent
            val gTitle:String=intent.getStringExtra("gTitle")
            val gdescription=intent.getStringExtra("gDescription")
            val gImage=intent.getIntExtra("gImage",0)
            val gprice=intent.getStringExtra("gPrice")

            //set Title in another activity
            actionBar.setTitle(gTitle)
            a_title.text=gTitle
            a_description.text=gdescription
            imageView.setImageResource(gImage)
            a_price.text=gprice

        }}


