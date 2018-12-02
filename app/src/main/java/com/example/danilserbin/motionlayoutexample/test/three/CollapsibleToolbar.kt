package com.example.danilserbin.motionlayoutexample.test.three

import android.content.Context
import android.support.constraint.motion.MotionLayout
import android.support.design.widget.AppBarLayout
import android.util.AttributeSet

class CollapsibleToolbar @JvmOverloads internal constructor(context: Context, attr: AttributeSet? = null, defeStyleAttr: Int = 0) :
        MotionLayout(context, attr, defeStyleAttr), AppBarLayout.OnOffsetChangedListener {

    override fun onOffsetChanged(appBarLayout: AppBarLayout?, verticalOffset: Int) {
        progress = -verticalOffset / appBarLayout?.totalScrollRange?.toFloat()!!
    }

    override fun onAttachedToWindow() {
        super.onAttachedToWindow()
        (parent as? AppBarLayout)?.addOnOffsetChangedListener(this)
    }

}
