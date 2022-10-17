package com.example.myapplication.screens.start

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.R


class StartFragment : Fragment() {
    lateinit var recyclerView: RecyclerView
    lateinit var adapter: StartAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val viewModel = ViewModelProvider(this)[StartViewModel::class.java]
        val view = inflater.inflate(R.layout.fragment_start, container, false)
        recyclerView = view.findViewById(R.id.rv_start)
        adapter = StartAdapter()
        recyclerView.adapter = adapter
        viewModel.getNalMoney()
        viewModel.myMoneyList.observe(viewLifecycleOwner) { list ->
            list.body()?.let { adapter.setList(it) }

        }


        return view
    }


}