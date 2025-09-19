package com.example.lab_week_04

import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter

class ViewPagerAdapter(fragment: Fragment) : FragmentStateAdapter(fragment) {
    override fun getItemCount(): Int = 3

    override fun createFragment(position: Int): Fragment {
        return when (position) {
            0 -> StarbucksFragment()
            1 -> JanjiJiwaFragment()
            2 -> KopiKenanganFragment()
            else -> StarbucksFragment()
        }
    }
}
