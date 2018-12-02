package com.example.danilserbin.motionlayoutexample.example.beender


import android.content.Context
import android.graphics.Color
import android.graphics.drawable.Drawable
import android.graphics.drawable.GradientDrawable
import android.support.v4.app.ActivityCompat
import android.util.AttributeSet
import com.example.danilserbin.motionlayoutexample.R

/**
 * Created by olegshelyakin on 21.08.17.
 */

class InstagrammButton : SocialButton {
    override val shape: Drawable by lazy {
        val shape = GradientDrawable()
        shape.shape = GradientDrawable.RECTANGLE
        shape.orientation = GradientDrawable.Orientation.LEFT_RIGHT
        shape.cornerRadius = (height / 2).toFloat()
        shape.colors = intArrayOf(
                Color.argb(255, 72, 119, 227),
                Color.argb(255, 222, 53, 136),
                Color.argb(255, 251, 138, 50),
                Color.argb(255, 253, 221, 136))
        return@lazy shape
    }

    constructor(context: Context) : super(context) {
        initialize()
    }

    constructor(context: Context, attrs: AttributeSet) : super(context, attrs) {
        initialize()
    }

    constructor(context: Context, attrs: AttributeSet, defStyleAttr: Int) : super(context, attrs, defStyleAttr) {
        initialize()
    }

    private fun initialize() {
        setCompoundDrawablesRelativeWithIntrinsicBounds(ActivityCompat.getDrawable(context, R.drawable.ic_instagram), compoundDrawables[1], compoundDrawables[2], compoundDrawables[3])
    }

}
