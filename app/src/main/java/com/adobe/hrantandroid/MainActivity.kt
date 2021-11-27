package com.adobe.hrantandroid

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

}



//val text = findViewById<TextView>(R.id.hello_world)
//text.setOnClickListener {
//    val intent= Intent(this, SecondActivity::class.java)
//    intent.apply {
//        putExtra("key", (text as TextView).text.toString())
//    }
//    startActivity(intent)
//}
//val thread = Thread(object : Runnable {
//    override fun run() {
//    }
//})
//thread.start()