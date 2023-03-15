package com.example.customlistview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var listView= findViewById<ListView>(R.id.listView)
        var list= mutableListOf<model>()


        list.add(model("Banana fruit","Banana",R.drawable.banana))
        list.add(model("Grape fruit","Grape",R.drawable.grape))
        list.add(model("Apple fruit","Apple",R.drawable.apple))
        list.add(model("Passion fruit","Passion",R.drawable.passion))
        list.add(model("Tomato fruit","Tomato",R.drawable.tomato))

        listView.adapter=MyAdapter(this,R.layout.row,list)



    }
}