package com.ford.testfpp.home.viewmodel

import android.arch.lifecycle.ViewModel
import android.databinding.ObservableField

class HomeVehicleLocationViewModel(addressLine1: String, addressLine2: String) : ViewModel() {
    val addressLine1 = ObservableField<String>(addressLine1)
    val addressLine2 = ObservableField<String>(addressLine2)
}