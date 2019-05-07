package com.ford.testfpp.health.ui

import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentPagerAdapter

class VehicleHealthAdapter(
    fragmentManager: FragmentManager?
) : FragmentPagerAdapter(fragmentManager) {

    companion object {
        private const val FRAGMENT_ITEM_COUNT = 2
    }

    override fun getItem(index: Int): Fragment {
        return if(index == 0) {
            VehicleHealthStatusFragment.newInstance()
        } else {
            VehicleHealthServicingFragment.newInstance()
        }
    }

    override fun getCount(): Int {
        return FRAGMENT_ITEM_COUNT
    }

}
