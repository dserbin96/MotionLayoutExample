package com.example.danilserbin.motionlayoutexample.example.beender

import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.drawable.Drawable
import android.util.AttributeSet
import android.view.Gravity
import android.widget.Button
import com.example.danilserbin.motionlayoutexample.R

/**
 * Created by olegshelyakin on 21.08.17.
 */

abstract class SocialButton : Button {

    private var padding: Int = 0
    abstract val shape: Drawable

    constructor(context: Context) : super(context)

    constructor(context: Context, attrs: AttributeSet) : super(context, attrs) {
        initialize(attrs)
    }

    constructor(context: Context, attrs: AttributeSet, defStyleAttr: Int) : super(context, attrs, defStyleAttr) {
        initialize(attrs)
    }

    private fun initialize(attrs: AttributeSet) {
        if (attrs.getAttributeValue("http://schemas.android.com/apk/res/android", "padding") == null) {
            padding = resources.getDimensionPixelSize(R.dimen.padding_social)
            setPadding(padding, 0, padding, 0)
        }

        if (attrs.getAttributeValue("http://schemas.android.com/apk/res/android", "gravity") == null) {
            gravity = Gravity.START or Gravity.CENTER_VERTICAL
        }

        if (attrs.getAttributeValue("http://schemas.android.com/apk/res/android", "drawablePadding") == null || attrs.getAttributeValue("http://schemas.android.com/apk/res/android", "drawablePadding").isEmpty()) {
            compoundDrawablePadding = resources.getDimensionPixelSize(R.dimen.padding_social)
        }

        setAllCaps(false)
        setTextColor(Color.WHITE)
    }

    override fun draw(canvas: Canvas?) {
        super.draw(canvas)
        background = shape
    }
}
