package com.adobe.hrantandroid

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        val inflater: MenuInflater = menuInflater
        inflater.inflate(R.menu.main_menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem) =
        when (item.itemId) {
            R.id.secondpage -> {
                findNavController(R.id.fragment_container_view).navigate(R.id.action_firstFragment_to_secondFragment)
                true
            }
            R.id.thirddpage -> {
                true
            }
            R.id.fourthdpage -> {
                true
            }
            else -> super.onOptionsItemSelected(item)
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