package com.ford.testfpp.health.ui

import android.databinding.DataBindingUtil
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.ford.testfpp.R
import com.ford.testfpp.databinding.FragmentVehicleHealthBinding
import com.ford.testfpp.databinding.ViewCustomTabBinding
import com.ford.testfpp.health.viewmodel.HealthTabViewModel
import com.ford.testfpp.health.viewmodel.VehicleHealthViewModel

class VehicleHealthFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val binding : FragmentVehicleHealthBinding = DataBindingUtil.inflate(inflater, R.layout.fragment_vehicle_health, container, false)

        val testTab = binding.vehicleDetailsTabs
        testTab.setupWithViewPager(binding.viewPager)
        val adapter = VehicleHealthAdapter(this.fragmentManager)
        binding.viewPager.adapter = adapter

        val firstTabBinding: ViewCustomTabBinding = DataBindingUtil.inflate(inflater, R.layout.view_custom_tab, testTab, false)
        val secondTabBinding: ViewCustomTabBinding = DataBindingUtil.inflate(inflater, R.layout.view_custom_tab, testTab, false)

        firstTabBinding.viewModel = HealthTabViewModel("STATUS", 1, false)
        secondTabBinding.viewModel = HealthTabViewModel("SERVICING", 13, true)

        testTab.getTabAt(0)?.customView = firstTabBinding.root
        testTab.getTabAt(1)?.customView = secondTabBinding.root

        binding.viewModel = VehicleHealthViewModel()

        return binding.root
    }
}