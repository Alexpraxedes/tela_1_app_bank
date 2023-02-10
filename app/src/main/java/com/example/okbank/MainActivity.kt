package com.example.okbank

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private lateinit var rvList: RecyclerView
    private var adapter = MenuItemAdapter()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initViews()
        setItemsList()
    }

    private fun initViews(){
        rvList = findViewById(R.id.rv_list)
        rvList.adapter = adapter
        rvList.layoutManager = GridLayoutManager(this, 2)
    }

    private fun setItemsList() {
        adapter.setItemsListAdapter(
            arrayListOf(
                MenuItemModel(
                    title = "cartões"
                ),
                MenuItemModel(
                    title ="meus comporvantes"
                ),
                MenuItemModel(
                    title ="investimentos"
                ),
                MenuItemModel(
                    title = "portabilidade de salário"
                )
            )
        )
    }
}