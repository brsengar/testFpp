package com.ford.testfpp.home.viewmodel

import android.arch.lifecycle.ViewModel
import android.databinding.ObservableField
import android.databinding.ObservableInt

class HomeItemVehicleAlertViewModel(title: String, desc: String, icon: Int) : ViewModel() {

    val alertIcon = ObservableInt(icon)
    val title = ObservableField<String>(title)
    val description = ObservableField<String>(desc)
}