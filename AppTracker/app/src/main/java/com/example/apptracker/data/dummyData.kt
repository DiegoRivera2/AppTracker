package com.example.apptracker.data

import com.example.apptracker.data.model.CarModel

// Car No.1 data
val carModel = "328i"
val brand = "bmw"
val carYear = 1997
val carColor = "Red"

// Car No.2 data
val carModel2 = "Lancer Evolution X"
val brand2 = "Mitsubishi"
val carYear2 = 2010
val carColor2 = "White"

// Car No.3 data
val carModel3 = "M5cs"
val brand3 = "bmw"
val carYear3 = 2020
val carColor3 = "Lime Green"

var cars = mutableListOf(
    CarModel(carModel, brand, carYear, carColor),
    CarModel(carModel2, brand2, carYear2, carColor2),
    CarModel(carModel3, brand3, carYear3, carColor3),
)