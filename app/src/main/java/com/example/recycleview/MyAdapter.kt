package com.example.recycleview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class MyAdapter(val countries: Array<Country>) : RecyclerView.Adapter<MyAdapter.MyViewHolder>() {
    class MyViewHolder(view:View) :RecyclerView.ViewHolder(view){
        val countryName=view.findViewById<TextView>(R.id.country_name)
        val countryCapital=view.findViewById<TextView>(R.id.country_capital)
        val flag=view.findViewById<ImageView>(R.id.country_flag)
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val inflater=LayoutInflater.from(parent.context)
        val view=inflater.inflate(R.layout.country_list,parent,false)
        return MyViewHolder(view)
    }
    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
       holder.countryName.text=countries[position].name
       holder.countryCapital.text=countries[position].capital
        holder.flag.setImageResource(countries[position].flagId)
    }
    override fun getItemCount(): Int {
       return countries.size
    }

}
