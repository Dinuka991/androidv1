package com.darshana.swoosh

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import android.content.Intent;


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        bttn.setOnClickListener{
            val leafueIntent = Intent(this , league::class.java)
            startActivity(leafueIntent)
        }
    }
}
