package com.hmmm.presentation


import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.hmmm.Dependencies.restaurantService
import com.hmmm.R


class RecommendationActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button: Button = findViewById(R.id.button)
        button.setOnClickListener(this::generateRecommendation)
    }

    @Suppress("UNUSED_PARAMETER")
    fun generateRecommendation(view: View) {
        val restaurantDetails: TextView = findViewById(R.id.restaurant_details)
        restaurantDetails.text = restaurantService.recommend().name
    }
}