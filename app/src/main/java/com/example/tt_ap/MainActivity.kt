package com.example.tt_ap

import android.content.Intent
import kotlin.math.max
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var s : Double = 1.0
        var d : Double = 1.0
        var r : Double = 1.0
        var u : String = "a"
        var numl: String = "S"
        var str : String = "s"
        button4.setOnClickListener(){
            numl = editText2.text.toString()
            s = numl.toDouble()
            str = editText3.text.toString()
            d = str.toDouble()
            r = s + d
            u = r.toString()
            textView.setText(u)
        }
        button5.setOnClickListener(){
            numl = editText2.text.toString()
            s = numl.toDouble()
            str = editText3.text.toString()
            d = str.toDouble()
            r = s - d
            u = r.toString()
            textView.setText(u)
        }
        button6.setOnClickListener(){
            numl = editText2.text.toString()
            s = numl.toDouble()
            str = editText3.text.toString()
            d = str.toDouble()
            r = s * d
            u = r.toString()
            textView.setText(u)
        }
        button7.setOnClickListener(){
            numl = editText2.text.toString()
            s = numl.toDouble()
            str = editText3.text.toString()
            d = str.toDouble()
            r = s / d
            u = r.toString()
            textView.setText(u)
        }
        buttonintent.setOnClickListener {

                val buttonIntent = Intent(this, SecondActivity::class.java)
                startActivity(buttonIntent)
        }
    }
}
