package com.ford.testfpp.home.ui

import android.content.Context
import android.databinding.DataBindingUtil
import android.util.AttributeSet
import android.view.LayoutInflater
import android.widget.LinearLayout
import com.ford.testfpp.R
import com.ford.testfpp.databinding.FppRowHomeVehicleAlertBinding
import com.ford.testfpp.home.viewmodel.HomeItemVehicleAlertViewModel

class HomeAlertView @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyle: Int = 0,
    defStyleRes: Int = 0
) : LinearLayout(context, attrs, defStyle, defStyleRes) {

    val binding: FppRowHomeVehicleAlertBinding =
        DataBindingUtil.inflate(LayoutInflater.from(context), R.layout.fpp_row_home_vehicle_alert, this, true)

    fun setData(title: String, description: String, resourceId: Int) {
        binding.viewModel = HomeItemVehicleAlertViewModel(title, description, resourceId)
    }
}
