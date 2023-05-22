package com.example.apptracker.ui.car.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelProvider.AndroidViewModelFactory.Companion.APPLICATION_KEY
import androidx.lifecycle.viewmodel.initializer
import androidx.lifecycle.viewmodel.viewModelFactory
import com.example.apptracker.CarReviewerApplication
import com.example.apptracker.data.model.CarModel
import com.example.apptracker.repositories.CarRepository

class CarViewModel(private val repository: CarRepository): ViewModel() {
    var carModel = MutableLiveData("")
    var brand = MutableLiveData("")
    var carYear = MutableLiveData("")
    var carColor = MutableLiveData("")

    fun getCars() = repository.getCars()



    fun setSelectedMovie(car: CarModel) {
        carModel.value = car.carModel
        brand.value = car.brand
        carYear.value = car.carYear.toString()
        carColor.value = car.carColor
    }

    companion object {
        val Factory = viewModelFactory {
            initializer {
                val app = this[APPLICATION_KEY] as CarReviewerApplication
                CarViewModel(app.carRepository)
            }
        }


    }
}