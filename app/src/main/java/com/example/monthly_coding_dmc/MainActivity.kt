package com.example.monthly_coding_dmc

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    //랜덤 추천 액티비티로 이동
    fun random(view: View) {
        view.setOnClickListener {
            val intent = Intent(this, RecommendActivity::class.java)
            startActivity(intent)
        }
    }

    //음식점 추천 액티비티로 이동
    fun recommend(view: View) {
        view.setOnClickListener {
            val intent = Intent(this, RestaurantRecommendActivity::class.java)
            startActivity(intent)
        }
    }

    //학교 점심 지도 액티비티로 이동
    fun map(view: View) {
        view.setOnClickListener {
            Toast.makeText(this, "해당 서비스는 준비중입니다!", Toast.LENGTH_LONG).show()
        }
    }

    //음식점 정보 액티비티로 이동
    fun data(view: View) {
        view.setOnClickListener {
            Toast.makeText(this, "해당 서비스는 준비중입니다!", Toast.LENGTH_LONG).show()
        }
    }
}