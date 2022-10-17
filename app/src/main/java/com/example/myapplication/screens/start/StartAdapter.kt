package com.example.myapplication.screens.start

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.R
import com.example.myapplication.models.nal.NalModel
import com.example.myapplication.models.nal.NalModelItem

class StartAdapter: RecyclerView.Adapter<StartAdapter.StartViewHolder>() {

    private var listStart = emptyList<NalModelItem>()

    class StartViewHolder(view: View):RecyclerView.ViewHolder(view) {
        var txtName: TextView = itemView.findViewById(R.id.item_name)
        var txtbuy:TextView = itemView.findViewById(R.id.item_buy)
        var txtSale:TextView = itemView.findViewById(R.id.item_sale)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): StartViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_money_layout, parent, false)
        return StartViewHolder(view)

    }

    override fun onBindViewHolder(holder: StartViewHolder, position: Int) {
        holder.txtName.text = listStart[position].noney
        holder.txtbuy.text = listStart[position].buy
        holder.txtSale.text = listStart[position].sale

    }

    override fun getItemCount(): Int {
        return listStart.size

    }

    @SuppressLint("NotifyDataSetChanged")
    fun setList(list: List<NalModelItem>){
        listStart = list
        notifyDataSetChanged()
    }


}