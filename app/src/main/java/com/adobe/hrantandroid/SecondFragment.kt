package com.adobe.hrantandroid

import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.core.os.bundleOf
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

/**
 * Created by Levon Arzumanyan on 11/27/21.
 * Project Name: ARMED
 * NOORLOGIC
 */

class SecondFragment : Fragment(R.layout.activity_third) {

    val adapter = ContactsAdapter(createContacts())

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        view.findViewById<Button>(R.id.bar).setOnClickListener {
            findNavController().navigate(
                R.id.action_secondFragment_to_fragmentThird,
                bundleOf("Aga" to "Hrantig", "Aba" to "Turuzig")
            )
        }

        val contactsRv = view.findViewById<RecyclerView>(R.id.contacts_rv)
        contactsRv.layoutManager = LinearLayoutManager(requireContext())
        contactsRv.adapter=adapter

    }

    private fun createContacts(): List<Contact> = listOf(
        Contact("https://image.shutterstock.com/image-photo/closeup-photo-amazing-short-hairdo-260nw-1617540484.jpg", "Ano", "099967373"),
        Contact("", "Vaxo", "099967373"),
        Contact("", "Saqo", "099967373"),
        Contact("https://image.shutterstock.com/image-photo/closeup-photo-amazing-short-hairdo-260nw-1617540484.jpg", "Jane", "099967373"),
        Contact("", "Nikol", "099967373"),
        Contact("", "Hrant", "099967373"),
        Contact("https://image.shutterstock.com/image-photo/closeup-photo-amazing-short-hairdo-260nw-1617540484.jpg", "Ani", "099967373"),
        Contact("", "Anna", "099967373"),
    )


}