package com.example.alchoholicbeverages.fragments

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.alchoholicbeverages.AlcoAdapter
import com.example.alchoholicbeverages.ItemAlcohol
import com.example.alchoholicbeverages.R


class BeerFragment : Fragment(R.layout.fragment_beer) {
    private val alcoList: ArrayList<ItemAlcohol> = ArrayList()
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val listRecyclerView = view.findViewById<RecyclerView>(R.id.alcohol_recyclerView)
        listRecyclerView.layoutManager = LinearLayoutManager(requireContext())
        listRecyclerView.adapter = AlcoAdapter(alcoList, requireContext())
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