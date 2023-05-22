package com.example.apptracker.ui.car.cars.recyclerview

import android.widget.ExpandableListView.OnChildClickListener
import androidx.recyclerview.widget.RecyclerView
import com.example.apptracker.data.model.CarModel
import com.example.apptracker.databinding.CarItemBinding

class CarRecyclerViewHolder(private val binding: CarItemBinding) : RecyclerView.ViewHolder(binding.root) {
    fun bind(car: CarModel, clickListener: (CarModel) -> Unit){
        binding.carBrand.text = car.brand

        binding.carItemCardView.setOnClickListener {
            clickListener(car)
        }

    }

}