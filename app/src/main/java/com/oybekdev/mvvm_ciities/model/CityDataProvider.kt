package com.oybekdev.mvvm_ciities.model

import com.oybekdev.mvvm_ciities.R

class CityDataProvider {
    private val cities = arrayListOf<City>()

    init {
        cities.add(City("Bangkok", R.drawable.img,10_000_000))
        cities.add(City("Korea", R.drawable.img_1,10_000_000))
        cities.add(City("Japan", R.drawable.img_2,10_000_000))
        cities.add(City("America", R.drawable.img_3,10_000_000))
        cities.add(City("China", R.drawable.img_4,10_000_000))
        cities.add(City("Dubay", R.drawable.img_5,10_000_000))
    }
    fun getCities() = cities
}