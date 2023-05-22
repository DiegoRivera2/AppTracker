package com.example.apptracker.ui.car.cars.recyclerview

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.apptracker.data.model.CarModel
import com.example.apptracker.databinding.CarItemBinding

class CarRecyclerViewAdapter(
    private val ClickListener: (CarModel) -> Unit
) : RecyclerView.Adapter<CarRecyclerViewHolder>() {

    private val cars = ArrayList<CarModel>()
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CarRecyclerViewHolder {
        val binding = CarItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return CarRecyclerViewHolder(binding)

    }

    override fun getItemCount(): Int {
        return cars.size
    }

    override fun onBindViewHolder(holder: CarRecyclerViewHolder, position: Int) {
        val car = cars[position]
        holder.bind(car, ClickListener)

    }

    fun setData(carsList: List<CarModel>){
        cars.clear()
        cars.addAll(carsList)

    }


}