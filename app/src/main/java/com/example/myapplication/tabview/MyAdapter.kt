package com.example.myapplication.tabview

import android.content.Context
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.example.myapplication.fragments.AddDrawFragment
import com.example.myapplication.fragments.AddTextNoteFragment
import com.example.myapplication.fragments.AddVoiceFragment

@Suppress("DEPRECATION")
internal class MyAdapter(
    var context: Context,
    fm: FragmentManager,
    var totalTabs: Int
) :
    FragmentPagerAdapter(fm) {
    override fun getItem(position: Int): Fragment {
        return when (position) {
            0 -> {
                AddTextNoteFragment()
            }
            1 -> {
                AddVoiceFragment()
            }
            2 -> {
                AddDrawFragment()
            }
            else -> getItem(position)
        }
    }
    override fun getCount(): Int {
        return totalTabs
    }
}