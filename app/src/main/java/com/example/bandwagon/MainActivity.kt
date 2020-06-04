package com.example.bandwagon

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val arrayList=ArrayList<model>()
        arrayList.add(model("Sauti Sol","Afro-pop--Kenya",R.drawable.sautisol,"$30"))
        arrayList.add(model("Elani","Contemporary Soul--Kenya",R.drawable.elani,"$20"))
        arrayList.add(model("Mi Casa","House music--South Africa",R.drawable.micasa,"$22"))
        arrayList.add(model("Mafikizolo","Kwaito,Afro-soul--South Africa",R.drawable.mafikizolo,"$25"))
        arrayList.add(model("21 Pilots","Electro-pop--Ohio",R.drawable.pilots21,"$26"))
        arrayList.add(model("Goodlyfe Crew","Afrobeat--Uganda",R.drawable.goodlyfe,"$19"))
        arrayList.add(model("Hillsong Worship","Praise&Worship--Australia",R.drawable.hillsong,"$23"))
        arrayList.add(model("The 1975","Pop-rock--Manchester",R.drawable.the1975,"$24"))
        arrayList.add(model("Casting Crowns","Christian Rock--Georgia",R.drawable.castingcrowns,"$22"))
        arrayList.add(model("Imagine Dragons","Pop-rock--Nevada",R.drawable.imaginedragons,"$27"))
        val myAdapter=myadapter(arrayList,this)
        recyclerView.layoutManager= LinearLayoutManager(this)
        recyclerView.adapter=myAdapter

    }
}
