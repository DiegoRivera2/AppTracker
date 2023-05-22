package com.example.apptracker.repositories

import com.example.apptracker.data.model.CarModel

class CarRepository(private val cars: MutableList<CarModel>) {

    fun getCars() = cars
}