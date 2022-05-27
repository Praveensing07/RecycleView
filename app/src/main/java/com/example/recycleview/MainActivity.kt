package com.example.recycleview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val countries = arrayOf(Country("in", "India", "New Delhi", R.drawable.india),
            Country("am", "America", "Washington", R.drawable.americaflag),
            Country("ca", "Canada", "Ottawa", R.drawable.canada),
            Country("ch", "China", "Beijing", R.drawable.china),
            Country("ja", "Japan", "Tokyo", R.drawable.japan),
            Country("sk", "SouthKorea", "Seoul", R.drawable.southkorea),
            Country("br", "Brazil", "Brasilia", R.drawable.brazil),
            Country("bh","Bhutan","Thimpu",R.drawable.bhutan),
            Country("sr","Srilanka","Kathmandu",R.drawable.srilankaflag))
            val countrylist = findViewById<RecyclerView>(R.id.country)
            countrylist.adapter = MyAdapter(countries)
            countrylist.layoutManager = LinearLayoutManager(this)
    }
}