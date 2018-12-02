package com.example.danilserbin.motionlayoutexample.example.beender


import android.content.Context
import android.graphics.Color
import android.graphics.RectF
import android.graphics.drawable.Drawable
import android.graphics.drawable.ShapeDrawable
import android.graphics.drawable.shapes.RoundRectShape
import android.support.v4.app.ActivityCompat
import android.util.AttributeSet
import com.example.danilserbin.motionlayoutexample.R

/**
 * Created by olegshelyakin on 21.08.17.
 */

class LinkedinButton : SocialButton {
    override val shape: Drawable by lazy {
        val radius = height/ 2.toFloat()
        val shape = ShapeDrawable(RoundRectShape(floatArrayOf(radius, radius, radius, radius, radius, radius, radius, radius
        ), RectF(), floatArrayOf(0F, 0f, 0f, 0f, 0f, 0f, 0f, 0f)))
        shape.paint.color = Color.argb(255, 2, 119, 181)
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
        setCompoundDrawablesRelativeWithIntrinsicBounds(ActivityCompat.getDrawable(context, R.drawable.ic_linkedin), compoundDrawables[1], compoundDrawables[2], compoundDrawables[3])
    }
}
