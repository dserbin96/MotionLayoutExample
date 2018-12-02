package com.example.danilserbin.motionlayoutexample.test.three.viewpager

import android.content.Context
import android.support.constraint.motion.MotionLayout
import android.support.v4.view.ViewPager
import android.util.AttributeSet

class ViewPagerHeader @JvmOverloads constructor(
        context: Context, attributeSet: AttributeSet? = null, defStyleAttr: Int = 0
) : MotionLayout(context, attributeSet, defStyleAttr), ViewPager.OnPageChangeListener {

    override fun onPageScrollStateChanged(state: Int) {

    }

    override fun onPageScrolled(position: Int, positionOffset: Float, positionOffsetPixels: Int) {
        val countEl = 3
        progress = (position + positionOffset) / (countEl - 1)
    }

    override fun onPageSelected(position: Int) {

    }
}