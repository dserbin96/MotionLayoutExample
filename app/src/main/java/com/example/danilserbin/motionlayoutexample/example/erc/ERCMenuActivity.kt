package com.example.danilserbin.motionlayoutexample.example.erc

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.example.danilserbin.motionlayoutexample.R

class ERCMenuActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ercmenu)

        supportActionBar?.title = getString(R.string.erc)
    }
}
