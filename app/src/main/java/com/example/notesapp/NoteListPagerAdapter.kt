package com.example.notesapp

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter

class NoteListPagerAdapter(val fa: FragmentActivity): FragmentStateAdapter(fa) {

    private val NUM_PAGES: Int = 2

    var items = ArrayList<Fragment>()

    override fun getItemCount(): Int = NUM_PAGES

    override fun createFragment(position: Int): Fragment = items[position]

    // 페이지 1개 추가
    fun addItem(item: Fragment) {
        items.add(item)
    }

    // 페이지 list 로 추가
    fun addItems(items: ArrayList<Fragment>){
        this.items =  items
    }


}