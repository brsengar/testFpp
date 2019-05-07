package com.ford.testfpp.health.ui

import android.databinding.BindingAdapter
import android.databinding.DataBindingUtil
import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.DividerItemDecoration
import android.support.v7.widget.LinearLayoutManager
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import com.ford.testfpp.R
import com.ford.testfpp.databinding.FragmentVehicleHealthStatusBinding
import com.ford.testfpp.health.viewmodel.VehicleHealthStatusCommonViewModel
import com.ford.testfpp.health.viewmodel.VehicleHealthStatusSummaryViewModel
import com.ford.testfpp.health.viewmodel.VehicleHealthStatusViewModel
import kotlinx.android.synthetic.main.fragment_vehicle_health_status.*

class VehicleHealthStatusFragment : Fragment() {

    companion object {
        fun newInstance() = VehicleHealthStatusFragment().apply {
        }

        @BindingAdapter("customSrc")
        @JvmStatic
        fun bindCustomSrc(img: ImageView, resource: Int) {
            if (resource != 0) {
                img.setImageResource(resource)
            }
        }
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val binding: FragmentVehicleHealthStatusBinding =
            DataBindingUtil.inflate(inflater, R.layout.fragment_vehicle_health_status, container, false)

        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        vehicle_health_status_recycler_view.apply {
            adapter = VehicleHealthStatusAdapter(getSampleRows())
            layoutManager = LinearLayoutManager(this.context)

            val decoration = DividerItemDecoration(context, LinearLayoutManager.VERTICAL)
            decoration.setDrawable(resources.getDrawable(R.drawable.fpp_vehicle_status_divider))
            addItemDecoration(decoration)
        }
    }

    private fun getSampleRows(): List<VehicleHealthStatusViewModel> {
        val rows = mutableListOf<VehicleHealthStatusViewModel>()
        rows.add(VehicleHealthStatusSummaryViewModel(R.drawable.fpp_ic_warning_blue, "vehicle health good", "Checked today at 07:32"))
        rows.add(VehicleHealthStatusCommonViewModel(R.drawable.fpp_ic_vehicle_health_row_fuel, "Fuel", "22 miles left", "10%", R.drawable.fpp_ic_vehicle_health_indicator_amber))
        rows.add(VehicleHealthStatusCommonViewModel(R.drawable.fpp_ic_vehicle_health_row_oil, "Oil Level", "Below Minimum level", "0%", R.drawable.fpp_ic_vehicle_health_indicator_amber))
        rows.add(VehicleHealthStatusCommonViewModel(R.drawable.fpp_ic_vehicle_health_row_tyre_pressure, "Tyre pressure", "Pressure loss in front", "Check", R.drawable.fpp_ic_vehicle_health_indicator_red))
        rows.add(VehicleHealthStatusCommonViewModel(R.drawable.fpp_ic_vehicle_health_row_diesel_filter, "Diesel Particular Filter", "Service After 20,000 miles", "ok", R.drawable.fpp_ic_vehicle_health_indicator_green))
        rows.add(VehicleHealthStatusCommonViewModel(R.drawable.fpp_ic_vehicle_health_row_adblue, "Ad Blue", "Approximately 2212 Remaining", "Check", R.drawable.fpp_ic_vehicle_health_indicator_amber))
        rows.add(VehicleHealthStatusCommonViewModel(R.drawable.fpp_ic_vehicle_health_row_battery, "Battery", "Service after 20,000 miles", "ok", R.drawable.fpp_ic_vehicle_health_indicator_green))
        rows.add(VehicleHealthStatusCommonViewModel(R.drawable.fpp_ic_vehicle_health_row_odometer, "Odometer", "Total Miles", "12,241", 0))

        return rows
    }

}