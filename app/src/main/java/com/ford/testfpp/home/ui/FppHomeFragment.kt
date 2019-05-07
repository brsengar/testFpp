package com.ford.testfpp.home.ui

import android.app.ActionBar
import android.databinding.DataBindingUtil
import android.os.Bundle
import android.support.constraint.ConstraintLayout
import android.support.v4.app.Fragment
import android.support.v7.widget.LinearLayoutCompat
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import com.ford.testfpp.R
import com.ford.testfpp.databinding.FppFragmentHomeBinding
import com.ford.testfpp.databinding.FppLayoutHomeVehicleLocationBinding
import com.ford.testfpp.databinding.FppRowHomeVehicleAlertBinding
import com.ford.testfpp.home.viewmodel.HomeItemStatusViewModel
import com.ford.testfpp.home.viewmodel.HomeItemVehicleAlertViewModel
import com.ford.testfpp.home.viewmodel.HomeVehicleLocationViewModel
import kotlinx.android.synthetic.main.fpp_fragment_home.*
import kotlinx.android.synthetic.main.fpp_fragment_home.view.*

class FppHomeFragment: Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val binding : FppFragmentHomeBinding = DataBindingUtil.inflate(inflater, R.layout.fpp_fragment_home, container, false)

        val alert1Binding : FppRowHomeVehicleAlertBinding =
            DataBindingUtil.inflate(LayoutInflater.from(context), R.layout.fpp_row_home_vehicle_alert, binding.homeUpperContainer.vehicleDetailsLayoutAlerts, true)
        alert1Binding.viewModel = HomeItemVehicleAlertViewModel("Service due in 2 weeks", "2019 Transit: dolor sit amet, consectetur adipiscing elit. Mauris ornare luctus nisl, sit amet hendrerit lacus facilisis sed.", R.drawable.fpp_ic_warning_red)

        val alert2Binding : FppRowHomeVehicleAlertBinding =
            DataBindingUtil.inflate(LayoutInflater.from(context), R.layout.fpp_row_home_vehicle_alert, binding.homeUpperContainer.vehicleDetailsLayoutAlerts, true)

        var layoutParams = LinearLayoutCompat.LayoutParams(LinearLayoutCompat.LayoutParams.MATCH_PARENT, LinearLayoutCompat.LayoutParams.WRAP_CONTENT)
        layoutParams.topMargin = 50
        alert2Binding.root.layoutParams = layoutParams
        alert2Binding.viewModel = HomeItemVehicleAlertViewModel("Oil level low", "2019 Transit: dolor sit amet, consectetur adipiscing elit. Mauris ornare luctus nisl, sit amet hendrerit lacus facilisis sed.", R.drawable.fpp_ic_warning_amber)

        val vehicleLocationViewModel = HomeVehicleLocationViewModel("Queen Elizebeth Park,", "Here East, London")
        binding.homeVehicleLocation.viewModel = vehicleLocationViewModel

        binding.homeRowStatus1.viewModel = HomeItemStatusViewModel(R.drawable.fpp_ic_vehicle_health_row_fuel, "Fuel", "22 miles left", R.drawable.fpp_ic_vehicle_health_indicator_amber)
        binding.homeRowStatus2.viewModel = HomeItemStatusViewModel(R.drawable.fpp_ic_vehicle_health_row_tyre_pressure, "Tyre pressure", "Pressure loss in front", R.drawable.fpp_ic_vehicle_health_indicator_red)

//        var alert1 = HomeAlertView(this.context!!)
//        var layoutParams = ViewGroup.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT)
//        alert1.layoutParams = layoutParams
//        alert1.setData("Service due in 2 weeks", "2019 Transit: dolor sit amet, consectetur adipiscing elit. Mauris ornare luctus nisl, sit amet hendrerit lacus facilisis sed.", R.drawable.fpp_ic_warning_blue)
//
//        var alert2 = HomeAlertView(this.context!!)
//        alert2.setData("Oil level low", "2019 Transit: dolor sit amet, consectetur adipiscing elit. Mauris ornare luctus nisl, sit amet hendrerit lacus facilisis sed.", R.drawable.fpp_ic_warning_blue)

//        binding.homeUpperContainer.vehicleDetailsLayoutAlerts.addView(alert1Binding.root)
//        binding.homeUpperContainer.vehicleDetailsLayoutAlerts.addView(alert2Binding.root)

        return binding.root
    }
}