package com.example.alchoholicbeverages

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import java.security.AccessController.getContext

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }


}




/* private fun initRecyclerView(list: ArrayList<String>) {
       val listRecyclerView = findViewById<RecyclerView>(R.id.alcohol_recyclerView)
       val adapter = AlcoAdapter(list, this)
       listRecyclerView.adapter = adapter
       listRecyclerView.layoutManager = LinearLayoutManager(this)
   }
   private fun addItems () {
     alcoName.add("Name 1")
     alcoImage.add(R.drawable.ic_smile.toString())

       initRecyclerView(4)*/



























/*class MainActivity : AppCompatActivity() {
    // private val alcoName: ArrayList<String> = ArrayList()
    //private val alcoImage : ArrayList<String> = ArrayList()
    val alcoItems : ArrayList<String> = ArrayList()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val listRecyclerView = findViewById<RecyclerView>(R.id.alcohol_recyclerView)
        listRecyclerView.layoutManager = LinearLayoutManager(this)
        listRecyclerView.adapter = AlcoAdapter(alcoItems,this)
        addItems()


    }
    fun addItems() {
        alcoItems.add("Item 1")
        alcoItems.add("Item 2")
        alcoItems.add("Item 3")
        alcoItems.add("Item 4")
        alcoItems.add("Item 5")
        alcoItems.add("Item 6")
        alcoItems.add("Item 7")
        alcoItems.add("Item 8")
        alcoItems.add("Item 9")
        alcoItems.add("Item 10")
        alcoItems.add("Item 11")
        alcoItems.add("Item 12")
        alcoItems.add("Item 13")

    }



}*/










