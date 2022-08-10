package com.example.monthly_coding_dmc

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.monthly_coding_dmc.databinding.ActivityRestaurantRecommendBinding

class RestaurantRecommendActivity : AppCompatActivity() {

    private lateinit var binding: ActivityRestaurantRecommendBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root) //바인딩

        val fragmentList = listOf(FragmentA(), FragmentB(), FragmentC(), FragmentD()) //프래그먼트 목록 생성

        val adapter = FragmentAdapter(this) //adapter 생성
        adapter.fragmentList = fragmentList  //앞에서 생선한 프래그먼트 목록을 저장.
        binding.fragment1.adapter = adapter //레이아웃의 viewPager를 import하고 어댑터를 적용
    }
}