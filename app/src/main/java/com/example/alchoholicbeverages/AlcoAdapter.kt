package com.example.alchoholicbeverages

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class AlcoAdapter(private val listAlco: ArrayList<ItemAlcohol>,val context: Context) : RecyclerView.Adapter<AlcoAdapter.AlcoViewHolder>() {

    class AlcoViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
     val alcoName : TextView = itemView.findViewById(R.id.alco_name)
     val alcoImage : ImageView = itemView.findViewById(R.id.alco_image)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AlcoViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.alcohol_items, parent, false)
        return AlcoViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: AlcoViewHolder, position: Int) {
        val currentItem = listAlco[position]
        holder.alcoImage.setImageResource(currentItem.imageItem)
        holder.alcoName.text = currentItem.nameItem
    }

    override fun getItemCount(): Int {
        return listAlco.size
    }



}







