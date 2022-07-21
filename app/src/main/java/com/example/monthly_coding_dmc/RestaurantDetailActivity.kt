package com.example.monthly_coding_dmc

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.viewpager2.widget.ViewPager2
import com.example.monthly_coding_dmc.databinding.ActivityRestaurantDetailBinding

class RestaurantDetailActivity : AppCompatActivity() {
    private lateinit var binding: ActivityRestaurantDetailBinding
    private var list = mutableListOf(R.drawable.activity_main_food_img, R.drawable.activity_main_map_img, R.drawable.activity_main_landom_img)
    private var numBanner = 3 // 배너 갯수

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRestaurantDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.bannerViewPager.adapter = RestaurantDetailAdapter(list)
        binding.bannerViewPager.orientation = ViewPager2.ORIENTATION_HORIZONTAL

        binding.textViewTotalBanner.text = numBanner.toString()

        // 현재 몇번째 배너인지 보여주는 숫자를 변경함
        binding.bannerViewPager.apply {
            registerOnPageChangeCallback(object: ViewPager2.OnPageChangeCallback(){
                override fun onPageSelected(position: Int) {
                    super.onPageSelected(position)
                    binding.textViewCurrentBanner.text = "${position+1}" // position이 0부터 시작해서 +1
                }
            })
        }

        binding.linearLayoutSeeAll.setOnClickListener {
            Toast.makeText(this, "모두 보기 클릭했음", Toast.LENGTH_SHORT).show()
        }
    }
}