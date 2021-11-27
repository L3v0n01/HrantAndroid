package com.adobe.hrantandroid

import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController

/**
 * Created by Levon Arzumanyan on 11/27/21.
 * Project Name: ARMED
 * NOORLOGIC
 */

class FragmentThird: Fragment(R.layout.activity_fourth) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        view.findViewById<Button>(R.id.bar).apply {
            setOnClickListener {
                findNavController().navigate(R.id.action_fragmentThird_to_fragmentFourth)
            }
            setText(arguments?.getString("Aga"))
        }
    }
}