package com.ford.testfpp.health.ui

import android.databinding.DataBindingUtil
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.ford.testfpp.R
import com.ford.testfpp.databinding.FragmentVehicleHealthServicingBinding

class VehicleHealthServicingFragment: Fragment() {

    companion object {
        fun newInstance() = VehicleHealthServicingFragment().apply {

        }
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val binding : FragmentVehicleHealthServicingBinding = DataBindingUtil.inflate(inflater, R.layout.fragment_vehicle_health_servicing, container, false)

        return binding.root
    }
}