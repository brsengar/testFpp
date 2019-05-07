package com.ford.testfpp.health.viewmodel

import android.databinding.ObservableField
import android.databinding.ObservableInt

class VehicleHealthStatusSummaryViewModel(
    varStatusIcon: Int,
    varSummaryText: String,
    varUpdatedTime: String
) : VehicleHealthStatusViewModel() {
    val statusIcon = ObservableInt(varStatusIcon)
    val summaryText = ObservableField<String>(varSummaryText)
    val updatedTime = ObservableField<String>(varUpdatedTime)
}