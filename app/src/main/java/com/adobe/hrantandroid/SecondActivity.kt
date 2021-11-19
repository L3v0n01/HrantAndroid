package com.adobe.hrantandroid

import android.os.Bundle
import android.view.KeyEvent
import android.view.View
import android.view.inputmethod.EditorInfo
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.AppCompatEditText
import androidx.appcompat.widget.AppCompatImageView
import androidx.appcompat.widget.AppCompatTextView

/**
 * Created by Levon Arzumanyan on 11/9/21.
 * Project Name: ARMED
 * NOORLOGIC
 */


class SecondActivity : AppCompatActivity(R.layout.activity_second) {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val textView: AppCompatTextView = findViewById(R.id.barev_tv)
        val imageView: AppCompatImageView = findViewById(R.id.appCompatImageView)
        val input: AppCompatEditText = findViewById(R.id.input_et)
        imageView.setOnClickListener {
            textView.text = input.text
        }
        input.imeOptions=EditorInfo.IME_ACTION_DONE
        input.setOnEditorActionListener { _, p1, _ ->
            if (p1 == EditorInfo.IME_ACTION_DONE) {
                textView.text = input.text
                true
            } else false
        }
    }
}