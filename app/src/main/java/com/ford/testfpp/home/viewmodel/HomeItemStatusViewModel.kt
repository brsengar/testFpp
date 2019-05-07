package com.ford.testfpp.home.viewmodel

import android.arch.lifecycle.ViewModel
import android.databinding.ObservableField
import android.databinding.ObservableInt

class HomeItemStatusViewModel(icon: Int, title: String, desc: String, statusIcon: Int) : ViewModel() {

    val imageDrawable = ObservableInt(icon)
    val title = ObservableField<String>(title)
    val description = ObservableField<String>(desc)
    val statusIcon = ObservableInt(statusIcon)
}