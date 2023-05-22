package com.example.apptracker

import android.app.Application
import com.example.apptracker.data.cars
import com.example.apptracker.repositories.CarRepository

class CarReviewerApplication: Application() {
    val carRepository: CarRepository by lazy {
        CarRepository(cars)
    }
}