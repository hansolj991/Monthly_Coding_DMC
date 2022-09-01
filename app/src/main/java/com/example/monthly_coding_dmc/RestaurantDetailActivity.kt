package com.example.monthly_coding_dmc

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView
import android.widget.Toast
import androidx.viewpager2.widget.ViewPager2
import com.example.monthly_coding_dmc.databinding.ActivityRestaurantDetailBinding
import java.lang.reflect.Array

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

        getValueIntent()
    }
    private fun getValueIntent(){
        Log.d("Detail", intent.getStringExtra("result").toString())
        val recommendLunch = intent.getStringExtra("result")
        val lunArray = arrayOf(
            arrayOf(R.array.restaurant_array1),arrayOf(R.array.restaurant_array2),arrayOf(R.array.restaurant_array3),arrayOf(R.array.restaurant_array4),
            arrayOf(R.array.restaurant_array5),arrayOf(R.array.restaurant_array6),arrayOf(R.array.restaurant_array7),arrayOf(R.array.restaurant_array8),
            arrayOf(R.array.restaurant_array9),arrayOf(R.array.restaurant_array10),arrayOf(R.array.restaurant_array11),arrayOf(R.array.restaurant_array12),
            arrayOf(R.array.restaurant_array13),arrayOf(R.array.restaurant_array14),arrayOf(R.array.restaurant_array15),arrayOf(R.array.restaurant_array16),
            arrayOf(R.array.restaurant_array17),arrayOf(R.array.restaurant_array18),arrayOf(R.array.restaurant_array19),arrayOf(R.array.restaurant_array20),
            arrayOf(R.array.restaurant_array21),arrayOf(R.array.restaurant_array22),arrayOf(R.array.restaurant_array23),arrayOf(R.array.restaurant_array24),
            arrayOf(R.array.restaurant_array25),arrayOf(R.array.restaurant_array26),arrayOf(R.array.restaurant_array27),arrayOf(R.array.restaurant_array28),
            arrayOf(R.array.restaurant_array29),arrayOf(R.array.restaurant_array30),arrayOf(R.array.restaurant_array31),arrayOf(R.array.restaurant_array32),
            arrayOf(R.array.restaurant_array33),arrayOf(R.array.restaurant_array34),arrayOf(R.array.restaurant_array35),arrayOf(R.array.restaurant_array36),
            arrayOf(R.array.restaurant_array37),arrayOf(R.array.restaurant_array38),arrayOf(R.array.restaurant_array39),arrayOf(R.array.restaurant_array40),
            arrayOf(R.array.restaurant_array41),arrayOf(R.array.restaurant_array42),arrayOf(R.array.restaurant_array43),arrayOf(R.array.restaurant_array44),
            arrayOf(R.array.restaurant_array45),arrayOf(R.array.restaurant_array46),arrayOf(R.array.restaurant_array47),arrayOf(R.array.restaurant_array48),
            arrayOf(R.array.restaurant_array49),arrayOf(R.array.restaurant_array50),arrayOf(R.array.restaurant_array51),arrayOf(R.array.restaurant_array52),
            arrayOf(R.array.restaurant_array53),arrayOf(R.array.restaurant_array54),arrayOf(R.array.restaurant_array55),arrayOf(R.array.restaurant_array56),
            arrayOf(R.array.restaurant_array57),arrayOf(R.array.restaurant_array58),arrayOf(R.array.restaurant_array59),arrayOf(R.array.restaurant_array60),
            arrayOf(R.array.restaurant_array61),arrayOf(R.array.restaurant_array62),arrayOf(R.array.restaurant_array63),arrayOf(R.array.restaurant_array64),
            arrayOf(R.array.restaurant_array65),arrayOf(R.array.restaurant_array66),arrayOf(R.array.restaurant_array67),arrayOf(R.array.restaurant_array68),
            arrayOf(R.array.restaurant_array69),arrayOf(R.array.restaurant_array70),arrayOf(R.array.restaurant_array71),arrayOf(R.array.restaurant_array72),
            arrayOf(R.array.restaurant_array73)

        )


        if(recommendLunch != null){
//            binding.tvTest.text = lunArray[0][0].toString()
            Log.d("Detail", lunArray[recommendLunch.toInt()].toString())
            
        }

    }
}