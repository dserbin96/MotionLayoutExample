package com.example.danilserbin.motionlayoutexample

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Toast
import com.example.danilserbin.motionlayoutexample.example.beender.BeenderSignInActivity
import com.example.danilserbin.motionlayoutexample.example.beender.BeenderSignInTwoActivity
import com.example.danilserbin.motionlayoutexample.example.erc.ERCMenuActivity
import com.example.danilserbin.motionlayoutexample.example.erc.ERCSignInActivity
import com.example.danilserbin.motionlayoutexample.test.two.ColorTwoActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnSimpleExample.setOnClickListener { showSimpleExample() }

        btnERCSignIn.setOnClickListener { showERCSignIn() }

        btnERCMenu.setOnClickListener { showERCMenu() }

        btnBeenderSignIn.setOnClickListener { showBeenderSignIn() }

        btnBeenderSignInTwo.setOnClickListener { showBeenderSignInTwo() }

        btnStart.setOnClickListener { showStart() }
    }

    private fun showERCSignIn() {
        startActivity(Intent(this, ERCSignInActivity::class.java))
    }

    private fun showERCMenu() {
        startActivity(Intent(this, ERCMenuActivity::class.java))
    }

    private fun showBeenderSignIn() {
        startActivity(Intent(this, BeenderSignInActivity::class.java))
    }

    private fun showBeenderSignInTwo() {
        startActivity(Intent(this, BeenderSignInTwoActivity::class.java))
    }

    private fun showSimpleExample() {
        startActivity((Intent(this, ColorTwoActivity::class.java)))
    }

    private fun showStart() {
        Toast.makeText(this, "Start", Toast.LENGTH_LONG).show()
    }

}