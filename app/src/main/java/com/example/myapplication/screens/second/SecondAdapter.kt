package com.example.myapplication.screens.second

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.R
import com.example.myapplication.models.nonal.NoNalModelItem

class SecondAdapter: RecyclerView.Adapter<SecondAdapter.SecondViewHolder>() {

    private var listSecond = emptyList<NoNalModelItem>()

    class SecondViewHolder(view: View):RecyclerView.ViewHolder(view) {
     var txtName:TextView = itemView.findViewById(R.id.item_name)
     var txtBuy:TextView = itemView.findViewById(R.id.item_buy)
     var txtSale:TextView = itemView.findViewById(R.id.item_sale)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SecondViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_money_layout, parent, false)
        return SecondViewHolder(view)
    }

    override fun onBindViewHolder(holder: SecondViewHolder, position: Int) {
        holder.txtName.text = listSecond[position].noney
        holder.txtBuy.text = listSecond[position].buy
        holder.txtSale.text = listSecond[position].sale
    }

    override fun getItemCount(): Int {
        return listSecond.size
    }

    @SuppressLint("NotifyDataSetChanged")
    fun setList(list: List<NoNalModelItem>){
        listSecond = list
        notifyDataSetChanged()
    }


}