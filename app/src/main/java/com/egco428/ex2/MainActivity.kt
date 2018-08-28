package com.egco428.ex2

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        nextBtn.setOnClickListener {
            val intent = Intent(this, DetailActivity::class.java)
            intent.putExtra("input1", editText.text.toString())
            startActivity(intent)
        }


    }
}
