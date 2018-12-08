package com.egco428.ex2

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_detail.*

class DetailActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        val bundle = intent.extras
        var inp1: Int
        var inp2: Int
        var total: Int = 0
        if(bundle != null){
            showText.setText(bundle.getString("input1")) //for plainText
        }
        nextBtn.setOnClickListener {
            val intent = Intent(this@DetailActivity, ThirdActivity::class.java)
            if(bundle != null) {
                inp1 = bundle.getString("input1").toInt()
                inp2 = textView3.text.toString().toInt()
                total = inp1 + inp2
                intent.putExtra("input2", total.toString())
            }
            startActivity(intent)
        }
        button.setOnClickListener {
            finish()
        }
    }
}
