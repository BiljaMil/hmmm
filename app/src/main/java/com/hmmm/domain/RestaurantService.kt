package com.hmmm.domain

import com.hmmm.data.RestaurantRepository
import kotlin.random.Random

class RestaurantService {
    fun recommend(): Restaurant {
        val restaurantRepository = RestaurantRepository()
        val maxIndex = restaurantRepository.findRestaurants().size
        val minIndex = 0
        val randomIndex = Random.nextInt(minIndex, maxIndex)
        return restaurantRepository.findRestaurants()[randomIndex]
    }
}