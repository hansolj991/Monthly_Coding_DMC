package com.example.monthly_coding_dmc

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.monthly_coding_dmc.databinding.ActivityRestaurantRecommendBinding


class RestaurantRecommendActivity : AppCompatActivity() {

    private lateinit var binding: ActivityRestaurantRecommendBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityRestaurantRecommendBinding.inflate(layoutInflater)

        setContentView(binding.root) //바인딩

        val intent = intent //인텐트 받기

        //스피드
        val arraySpeed1 = resources.getStringArray(R.array.restaurant_array33) //리소스에서 string 가져오기
        binding.restaurantTextSpeed1.text = arraySpeed1[0] //서브웨이
        val arraySpeed2 = resources.getStringArray(R.array.restaurant_array33) //리소스에서 string 가져오기
        binding.restaurantTextSpeed2.text = arraySpeed2[0] //버거킹
        val arraySpeed3 = resources.getStringArray(R.array.restaurant_array33) //리소스에서 string 가져오기
        binding.restaurantTextSpeed3.text = arraySpeed3[0] //KFC

        //매운맛
        val array = resources.getStringArray(R.array.restaurant_array33) //리소스에서 string 가져오기
        binding.restaurantTextSpeed1.text = array[0]

        //맛집

        //달콤한맛
    }
}