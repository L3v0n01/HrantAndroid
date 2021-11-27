package com.adobe.hrantandroid

import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.core.os.bundleOf
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController

/**
 * Created by Levon Arzumanyan on 11/27/21.
 * Project Name: ARMED
 * NOORLOGIC
 */

class SecondFragment:Fragment(R.layout.activity_third) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        view.findViewById<Button>(R.id.bar).setOnClickListener {
            findNavController().navigate(R.id.action_secondFragment_to_fragmentThird, bundleOf("Aga" to "Hrantig", "Aba" to "Turuzig"))
        }
    }
}