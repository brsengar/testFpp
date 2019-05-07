package com.ford.testfpp.health.viewmodel

import android.arch.lifecycle.ViewModel
import android.databinding.ObservableBoolean
import android.databinding.ObservableField

class HealthTabViewModel(title: String, count: Int, isAlert: Boolean) : ViewModel() {
    val title = ObservableField<String>(title)
    val count = ObservableField<String>(count.toString())
    var isSelected = ObservableBoolean(isAlert)

}