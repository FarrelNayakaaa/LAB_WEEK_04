package com.example.lab_week_04

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter

class ViewPagerAdapter(fragmentActivity: FragmentActivity) : FragmentStateAdapter(fragmentActivity) {
    override fun getItemCount(): Int = 3  // ada 3 tab

    override fun createFragment(position: Int): Fragment {
        return when (position) {
            0 -> StarbucksFragment()
            1 -> JanjiJiwaFragment()
            2 -> KopiKenanganFragment()
            else -> StarbucksFragment()
        }
    }
}