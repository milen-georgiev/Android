package com.example.androidapi

import retrofit2.Call

class CoutryRepository constructor(
    private val countryService: CountryService
) {

    fun getCountries(): Call<List<Country>>? {
        return try {
            countryService.getCountries()
        } catch (e: Exception) {
            // log error
            // show message to user
            null
        }
    }
}