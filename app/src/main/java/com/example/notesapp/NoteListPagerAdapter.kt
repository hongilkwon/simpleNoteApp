package com.example.notesapp

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter

class NoteListPagerAdapter(val fm: FragmentManager): FragmentPagerAdapter(fm) {

    var items = ArrayList<Fragment>()

    // 페이지 개수
    override fun getCount(): Int = 2

    // 데이터 설정 및 페이지 반환
    override fun getItem(position: Int): Fragment = items[position]

    // 페이지 이름
    override fun getPageTitle(position: Int): CharSequence {
        return "Page${(position + 1)}"
    }

    // 페이지 1개 추가
    fun addItem(item: Fragment) {
        items.add(item)
    }

    // 페이지 list로 추가
    fun addItems(items: ArrayList<Fragment>){
        this.items =  items
    }
}