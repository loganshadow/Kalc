package com.example.tt_ap

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_second.*
import java.text.SimpleDateFormat


class SecondActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        var t: String = "i"
        var form = SimpleDateFormat("hh:mm:ss")
        t = form.toString()
        textView2.setText(t)
    }
}
