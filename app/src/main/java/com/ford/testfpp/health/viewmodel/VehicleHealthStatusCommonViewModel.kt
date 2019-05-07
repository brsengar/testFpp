package com.ford.testfpp.health.viewmodel

import android.databinding.ObservableField
import android.databinding.ObservableInt
import android.support.annotation.DrawableRes

class VehicleHealthStatusCommonViewModel(
    @DrawableRes varImgDrawable: Int,
    varTitle: String,
    varDescription: String,
    varStatusText: String,
    varStatusImgDrawable: Int
) : VehicleHealthStatusViewModel() {

    val imageDrawable = ObservableInt(varImgDrawable)
    val title = ObservableField<String>(varTitle)
    val description = ObservableField<String>(varDescription)
    val statusText = ObservableField<String>(varStatusText)
    var statusImgDrawable = ObservableInt(varStatusImgDrawable)

}
