package com.example.danilserbin.motionlayoutexample.test.three.viewpager

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.view.ViewPager
import com.example.danilserbin.motionlayoutexample.R
import kotlinx.android.synthetic.main.activity_view_pager.*
import kotlinx.android.synthetic.main.layout_view_pager.*

class ViewPagerActivity : AppCompatActivity() {

    private lateinit var adapter: ViewPagerAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_view_pager)
        initial()
    }

    private fun initial() {
        adapter = ViewPagerAdapter(supportFragmentManager).apply {
            addPage()
            addPage()
            addPage()
            vpExample.adapter = this
        }
        tlExample.setupWithViewPager(vpExample)
        vpExample.addOnPageChangeListener(vphExample as ViewPager.OnPageChangeListener)
    }
}
