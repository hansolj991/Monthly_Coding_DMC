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
        binding.restaurantTextSpeed1.text = arraySpeed1[0]
        val arraySpeed2 = resources.getStringArray(R.array.restaurant_array33)
        binding.restaurantTextSpeed2.text = arraySpeed2[0]
        val arraySpeed3 = resources.getStringArray(R.array.restaurant_array33)
        binding.restaurantTextSpeed3.text = arraySpeed3[0]

        //매운맛
        val arraySpicy1 = resources.getStringArray(R.array.restaurant_array33)
        binding.restaurantTextSpicy1.text = arraySpicy1[0] //죠스 떡볶이
        val arraySpicy2 = resources.getStringArray(R.array.restaurant_array33)
        binding.restaurantTextSpicy2.text = arraySpicy2[0]
        val arraySpicy3 = resources.getStringArray(R.array.restaurant_array33)
        binding.restaurantTextSpicy3.text = arraySpicy3[0]

        //맛집
        val arrayRecommend1 = resources.getStringArray(R.array.restaurant_array33)
        binding.restaurantTextRecommend1.text = arrayRecommend1[0] //닥터로빈
        val arrayRecommend2 = resources.getStringArray(R.array.restaurant_array3)
        binding.restaurantTextRecommend2.text = arrayRecommend2[0] //동명
        val arrayRecommend3 = resources.getStringArray(R.array.restaurant_array8)
        binding.restaurantTextRecommend3.text = arrayRecommend3[0] //지지고

        //달콤한맛
        val arraySweet1 = resources.getStringArray(R.array.restaurant_array33)
        binding.restaurantTextSweet1.text = arraySweet1[0]
        val arraySweet2 = resources.getStringArray(R.array.restaurant_array33)
        binding.restaurantTextSweet2.text = arraySweet2[0]
        val arraySweet3 = resources.getStringArray(R.array.restaurant_array33)
        binding.restaurantTextSweet3.text = arraySweet3[0]
    }
}