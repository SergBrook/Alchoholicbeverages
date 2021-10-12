package com.example.alchoholicbeverages

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import java.security.AccessController.getContext

class MainActivity : AppCompatActivity() {
    private val alcoList: ArrayList<ItemAlcohol> = ArrayList()



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val listRecyclerView = findViewById<RecyclerView>(R.id.alcohol_recyclerView)
        listRecyclerView.layoutManager = LinearLayoutManager(this)
        listRecyclerView.adapter = AlcoAdapter(alcoList, this)
        addItems()

    }





    private fun addItems() {
        alcoList.add(ItemAlcohol(R.drawable.ic_smile, "Item 1"))
        alcoList.add(ItemAlcohol(R.drawable.ic_android, "Item 2"))
        alcoList.add(ItemAlcohol(R.drawable.ic_smile, "Item 3"))
        alcoList.add(ItemAlcohol(R.drawable.ic_smile, "Item 4"))
        alcoList.add(ItemAlcohol(R.drawable.ic_android, "Item 5"))
        alcoList.add(ItemAlcohol(R.drawable.ic_launcher_background, "Item 6"))
        alcoList.add(ItemAlcohol(R.drawable.ic_android, "Item 7"))
        alcoList.add(ItemAlcohol(R.drawable.ic_launcher_background, "Item 8"))
        alcoList.add(ItemAlcohol(R.drawable.ic_launcher_background, "Item 9"))
        alcoList.add(ItemAlcohol(R.drawable.ic_launcher_background, "Item 10"))
        alcoList.add(ItemAlcohol(R.drawable.ic_launcher_background, "Item 11"))
        alcoList.add(ItemAlcohol(R.drawable.ic_launcher_background, "Item 12"))
        alcoList.add(ItemAlcohol(R.drawable.ic_launcher_background, "Item 13"))
        alcoList.add(ItemAlcohol(R.drawable.ic_launcher_background, "Item 14"))
        alcoList.add(ItemAlcohol(R.drawable.ic_smile, "Item 15"))


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










