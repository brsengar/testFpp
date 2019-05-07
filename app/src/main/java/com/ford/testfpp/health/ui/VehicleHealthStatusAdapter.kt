package com.ford.testfpp.health.ui

import android.databinding.DataBindingUtil
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup
import com.ford.testfpp.R
import com.ford.testfpp.databinding.RowVehicleHealthStatusCommonBinding
import com.ford.testfpp.databinding.RowVehicleHealthStatusSummaryBinding
import com.ford.testfpp.health.viewholder.VehicleHealthCommonViewHolder
import com.ford.testfpp.health.viewholder.VehicleHealthStatusSummaryViewHolder
import com.ford.testfpp.health.viewmodel.VehicleHealthStatusCommonViewModel
import com.ford.testfpp.health.viewmodel.VehicleHealthStatusSummaryViewModel
import com.ford.testfpp.health.viewmodel.VehicleHealthStatusViewModel

class VehicleHealthStatusAdapter(private val rows: List<VehicleHealthStatusViewModel>) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {

//    class HeaderViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)
//
//    class CommonViewHolder(parent: ViewGroup) : RecyclerView.ViewHolder(itemView) {
//
//    }
//

    override fun getItemCount() = rows.count()

    override fun getItemViewType(position: Int): Int =
        when (rows[position]) {
            is VehicleHealthStatusSummaryViewModel -> TYPE_SUMMARY
            is VehicleHealthStatusCommonViewModel -> TYPE_COMMON
            else -> throw IllegalArgumentException()
        }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) =
        when (viewType) {
        TYPE_SUMMARY -> {
            val binding: RowVehicleHealthStatusSummaryBinding = DataBindingUtil.inflate(LayoutInflater.from(parent.context), R.layout.row_vehicle_health_status_summary, parent, false)
            VehicleHealthStatusSummaryViewHolder(binding)
        }
        TYPE_COMMON -> {
            val binding: RowVehicleHealthStatusCommonBinding = DataBindingUtil.inflate(LayoutInflater.from(parent.context), R.layout.row_vehicle_health_status_common, parent, false)
            VehicleHealthCommonViewHolder(binding)
        }
        else -> throw IllegalArgumentException()
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) =
        when (holder.itemViewType) {
            TYPE_SUMMARY -> onBindSummaryViewHolder(holder as VehicleHealthStatusSummaryViewHolder, rows[position] as VehicleHealthStatusSummaryViewModel)
            TYPE_COMMON -> onBindCommonViewHolder(holder as VehicleHealthCommonViewHolder, rows[position] as VehicleHealthStatusCommonViewModel)
            else -> throw IllegalArgumentException()
        }

    private fun onBindSummaryViewHolder(holder: VehicleHealthStatusSummaryViewHolder, viewModel: VehicleHealthStatusSummaryViewModel) {
        holder.binding.executePendingBindings()
        holder.binding.viewModel = viewModel
    }

    private fun onBindCommonViewHolder(
        holder: VehicleHealthCommonViewHolder,
        viewModel: VehicleHealthStatusCommonViewModel
    ) {
        holder.binding.executePendingBindings()
        holder.binding.viewModel = viewModel
    }

    companion object {
        private const val TYPE_SUMMARY = 0
        private const val TYPE_COMMON = 1
    }
}