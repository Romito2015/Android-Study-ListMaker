package com.rchopovenko.listmaker

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView

class ListDetailActivity : AppCompatActivity() {

    lateinit var list: TaskList
    lateinit var listItemSRecyclerView: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_detail)
        list = intent.getParcelableExtra(MainActivity.INTENT_LIST_KEY)
        title = list.name

        listItemSRecyclerView = findViewById<RecyclerView>(R.id.list_items_recycler_view)
        listItemSRecyclerView.layoutManager = LinearLayoutManager(this)
        listItemSRecyclerView.adapter = ListItemsRecyclerViewAdapter(list)
    }
}
