package com.example.monthly_coding_dmc

import android.content.Intent
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
        val arraySpeed1 = resources.getStringArray(R.array.restaurant_array5) //리소스에서 string 가져오기
        binding.restaurantTextSpeed1.text = arraySpeed1[1] //서브웨이
        val arraySpeed2 = resources.getStringArray(R.array.restaurant_array13)
        binding.restaurantTextSpeed2.text = arraySpeed2[1] //맘스터치
        val arraySpeed3 = resources.getStringArray(R.array.restaurant_array26)
        binding.restaurantTextSpeed3.text = arraySpeed3[1] //한솥 도시락

        //매운맛
        val arraySpicy1 = resources.getStringArray(R.array.restaurant_array33)
        binding.restaurantTextSpicy1.text = arraySpicy1[1] //죠스 떡볶이
        val arraySpicy2 = resources.getStringArray(R.array.restaurant_array50)
        binding.restaurantTextSpicy2.text = arraySpicy2[1] //하우 마라
        val arraySpicy3 = resources.getStringArray(R.array.restaurant_array34)
        binding.restaurantTextSpicy3.text = arraySpicy3[1] //엽기 떡볶이

        //맛집
        val arrayRecommend1 = resources.getStringArray(R.array.restaurant_array30)
        binding.restaurantTextRecommend1.text = arrayRecommend1[1] //빨봉분식
        val arrayRecommend2 = resources.getStringArray(R.array.restaurant_array3)
        binding.restaurantTextRecommend2.text = arrayRecommend2[1] //동명
        val arrayRecommend3 = resources.getStringArray(R.array.restaurant_array8)
        binding.restaurantTextRecommend3.text = arrayRecommend3[1] //지지고

        //디저트
        val arraySweet1 = resources.getStringArray(R.array.restaurant_array17)
        binding.restaurantTextSweet1.text = arraySweet1[1] //홈루이젠
        val arraySweet2 = resources.getStringArray(R.array.restaurant_array28)
        binding.restaurantTextSweet2.text = arraySweet2[1] //타코비&치즈볼
        val arraySweet3 = resources.getStringArray(R.array.restaurant_array4)
        binding.restaurantTextSweet3.text = arraySweet3[1] //YumYum

        //사진 모서리 둥글게
        binding.restaurantImgSpeed1.clipToOutline = true
        binding.restaurantImgSpeed2.clipToOutline = true
        binding.restaurantImgSpeed3.clipToOutline = true
        binding.restaurantImgSpicy1.clipToOutline = true
        binding.restaurantImgSpicy2.clipToOutline = true
        binding.restaurantImgSpicy3.clipToOutline = true
        binding.restaurantImgRecommend1.clipToOutline = true
        binding.restaurantImgRecommend2.clipToOutline = true
        binding.restaurantImgRecommend3.clipToOutline = true
        binding.restaurantImgSweet1.clipToOutline = true
        binding.restaurantImgSweet2.clipToOutline = true
        binding.restaurantImgSweet3.clipToOutline = true

        //이미지 클릭 시 상세보기로 이동
        binding.speed1.setOnClickListener { buttonClick("4") }
        binding.speed2.setOnClickListener { buttonClick("12") }
        binding.speed3.setOnClickListener { buttonClick("25") }
        binding.spicy1.setOnClickListener { buttonClick("32") }
        binding.spicy2.setOnClickListener { buttonClick("49") }
        binding.spicy3.setOnClickListener { buttonClick("33") }
        binding.recommend1.setOnClickListener { buttonClick("29") }
        binding.recommend2.setOnClickListener { buttonClick("2") }
        binding.recommend3.setOnClickListener { buttonClick("7") }
        binding.sweet1.setOnClickListener { buttonClick("16") }
        binding.sweet2.setOnClickListener { buttonClick("27") }
        binding.sweet3.setOnClickListener { buttonClick("3") }
    }

    private fun buttonClick(v : String) {
        val intent = Intent(this, RestaurantDetailActivity::class.java)
        intent.putExtra("result", v)
        startActivity(intent)
    }
}