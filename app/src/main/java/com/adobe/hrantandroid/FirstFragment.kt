package com.adobe.hrantandroid

import android.os.Bundle
import android.view.View
import android.view.inputmethod.EditorInfo
import androidx.appcompat.widget.AppCompatEditText
import androidx.appcompat.widget.AppCompatImageView
import androidx.appcompat.widget.AppCompatTextView
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController

/**
 * Created by Levon Arzumanyan on 11/27/21.
 * Project Name: ARMED
 * NOORLOGIC
 */

class FirstFragment:Fragment(R.layout.activity_second) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val textView: AppCompatTextView = view.findViewById(R.id.barev_tv)
        val imageView: AppCompatImageView = view.findViewById(R.id.appCompatImageView)
        val input: AppCompatEditText = view.findViewById(R.id.input_et)
        imageView.setOnClickListener {
            requireActivity().shareText(input.text.toString())
        }
        input.imeOptions= EditorInfo.IME_ACTION_DONE
        input.setOnEditorActionListener { _, p1, _ ->
            if (p1 == EditorInfo.IME_ACTION_DONE) {
                textView.text = input.text
                true
            } else false
        }
        textView.setOnClickListener {
            findNavController().navigate(R.id.action_firstFragment_to_secondFragment)
        }


//        textView.text = intent.getStringExtra("key")

    }
}