package com.oybekdev.mvvm_ciities.viewmodel

import android.os.Handler
import android.os.Looper
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.oybekdev.mvvm_ciities.model.City
import com.oybekdev.mvvm_ciities.model.CityDataProvider

class CityViewModel:ViewModel() {

    private val cityData = MutableLiveData<City>()
    private val cities = CityDataProvider().getCities()
    private var currentIndex = 0
    private val delay = 2000L

    init {
        loop()
    }

    fun getCityData():LiveData<City> = cityData

    private fun loop(){
        Handler(Looper.getMainLooper()).postDelayed({ updateCity()},delay)
    }
    private fun updateCity(){
        currentIndex++  //bittaga oshirib quyaveradi
        currentIndex %= cities.size //ketma ketlikda chiqishi uchun

        cityData.value = cities[currentIndex]

        loop()
    }
}