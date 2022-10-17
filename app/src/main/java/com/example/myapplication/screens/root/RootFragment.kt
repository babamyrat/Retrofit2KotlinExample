package com.example.myapplication.screens.root

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.widget.ViewPager2
import com.example.myapplication.R
import com.example.myapplication.ViewPagerAdapter
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator

class RootFragment : Fragment() {

    private var ctx: Context ?= null

    override fun onAttach(context: Context) {
        super.onAttach(context)
        ctx = context
    }
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_root, container, false)
        val viewPager2 = view.findViewById<ViewPager2>(R.id.view_pager)
        val tabLayout = view.findViewById<TabLayout>(R.id.tab_layout)

         viewPager2.adapter = ViewPagerAdapter(ctx as FragmentActivity)
         tabLayout.tabIconTint = null
         TabLayoutMediator(tabLayout,viewPager2){
             tab, pos ->
             when(pos) {
                 0 -> {
                    tab.setIcon(R.drawable.ic_money_24)
                 }
                 1 -> {
                     tab.setIcon(R.drawable.ic_baseline_24)
                 }
             }
         }.attach()

        return view
    }




}