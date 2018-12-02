package com.example.danilserbin.motionlayoutexample.test.three.viewpager

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.danilserbin.motionlayoutexample.R
import kotlinx.android.synthetic.main.fragment_page.view.*

class PageFragment : Fragment() {

    private lateinit var title: String

    companion object {
        val KEY_TITLE = "KEY_TITLE"

        fun getInstance(title: String): Fragment =
                PageFragment().apply {
                    arguments = Bundle().apply {
                        putString(KEY_TITLE, title)
                    }
                }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        title = arguments?.getString(KEY_TITLE).orEmpty()
    }

    override fun onCreateView(inflater: LayoutInflater,
                              container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.fragment_page, container, false)
        view.tvName.text = title
        return view
    }

}