package com.egco428.ex2

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_third.*

class ThirdActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_third)

        val bundle = intent.extras
        var total: Int = 0
        if(bundle != null){
            total = bundle.getString("input2").toInt()
            editText2.setText(total.toString())
        }

        button.setOnClickListener {
            finish()
        }

    }
}
