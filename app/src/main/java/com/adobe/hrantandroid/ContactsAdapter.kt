package com.adobe.hrantandroid

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.widget.AppCompatImageView
import androidx.appcompat.widget.AppCompatTextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide

/**
 * Created by Levon Arzumanyan on 12/7/21.
 * Project Name: ARMED
 * NOORLOGIC
 */
class ContactsAdapter(val contacts: List<Contact>) :
    RecyclerView.Adapter<ContactsAdapter.ContactsViewHolder>() {


    //2 find views of the item
    class ContactsViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val contactImage = itemView.findViewById<AppCompatImageView>(R.id.image)
        val contactName = itemView.findViewById<AppCompatTextView>(R.id.name)
        val contactNumber = itemView.findViewById<AppCompatTextView>(R.id.number)
    }

    //1 returns viewHolder with inflated view
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ContactsViewHolder {
        val itemView =
            LayoutInflater.from(parent.context).inflate(R.layout.item_contact, parent, false)
        return ContactsViewHolder(itemView)
    }

    //3
    override fun onBindViewHolder(holder: ContactsViewHolder, position: Int) {
        Glide.with(holder.itemView.context).load(contacts[position].imageUrl).placeholder(R.drawable
            .ic_baseline_filter_2_24).centerCrop().into(holder.contactImage)
        holder.contactName.text = contacts[position].name
        holder.contactNumber.text = contacts[position].number

    }

    //4 set contacts list item count
    override fun getItemCount() = contacts.count()

}