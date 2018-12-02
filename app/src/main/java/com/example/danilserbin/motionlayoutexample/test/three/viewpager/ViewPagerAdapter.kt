package com.example.danilserbin.motionlayoutexample.test.three.viewpager

import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentPagerAdapter

class ViewPagerAdapter(fm: FragmentManager) : FragmentPagerAdapter(fm) {

    private val fragmentList = mutableListOf<Fragment>()
    private val fragmentTitleList = mutableListOf<String>()

    override fun getItem(position: Int) = fragmentList[position]

    override fun getCount() = fragmentList.size

    override fun getPageTitle(position: Int): CharSequence? = fragmentTitleList[position]

    fun addPage() {
        fragmentTitleList.add("Page ${fragmentList.size}")
        fragmentList.add(PageFragment.getInstance("Page ${fragmentList.size}"))
        notifyDataSetChanged()
    }

}