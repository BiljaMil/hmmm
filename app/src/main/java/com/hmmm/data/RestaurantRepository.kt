package com.hmmm.data

import com.hmmm.domain.Restaurant

class RestaurantRepository {
    private val restaurants = listOf(
        Restaurant("Chutnify"),
        Restaurant("Billys bruzzelhütte")
    )

    fun findRestaurants(): List<Restaurant> {
        return this.restaurants
    }
}