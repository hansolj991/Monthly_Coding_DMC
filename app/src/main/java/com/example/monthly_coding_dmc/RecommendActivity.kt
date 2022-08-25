package com.example.monthly_coding_dmc

import android.animation.*
import android.os.Build
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.NumberPicker
import android.widget.TextView
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AppCompatActivity
import androidx.interpolator.view.animation.FastOutLinearInInterpolator
import kotlin.random.Random


class RecommendActivity : AppCompatActivity() {

    private val np: NumberPicker by lazy { findViewById(R.id.np) }
    private val dataList: MutableList<String> by lazy { mutableListOf() }
    private val tvResult: TextView by lazy { findViewById<TextView>(R.id.tvResult) }
    private val btnRetry: Button by lazy { findViewById(R.id.btnRetry) }
    private val btnDetail: Button by lazy { findViewById(R.id.btnDetail) }
    private val btnRandomPick: Button by lazy { findViewById(R.id.btnRandomPick) }
    private val tvTitle: TextView by lazy { findViewById(R.id.tvTitle) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recommand)

        setData()
        onRandomPick()

    }


    private fun initListener() {
        findViewById<Button>(R.id.btnRandomPick).setOnClickListener {
            onRandomPick()

        }

    }

    private fun randomEndFinish(){
        findViewById<Button>(R.id.btnDetail).setOnClickListener {

        }
        findViewById<Button>(R.id.btnRetry).setOnClickListener {


        }
    }

    private fun randomPickEndAnimationSet(){

        val tvResultFadeOut = ObjectAnimator.ofFloat(tvResult, "alpha", 1f, 0f)
        val btnRetryFadeOut = ObjectAnimator.ofFloat(btnRetry, "alpha", 1f, 0f)
        val btnDetailFadeOut = ObjectAnimator.ofFloat(btnDetail, "alpha", 1f, 0f)
        val btnRandomPickFadeIn = ObjectAnimator.ofFloat(btnRandomPick, "alpha", 0f, 1f)
        val npFadeIn = ObjectAnimator.ofFloat(np, "alpha", 0f, 1f)
        val tvTitleFadeIn = ObjectAnimator.ofFloat(tvTitle, "alpha", 0f, 1f)

        val randomPickReStartAnimation = AnimatorSet().apply {
            play(tvResultFadeOut).before(btnRetryFadeOut)
            play(btnRetryFadeOut).with(btnDetailFadeOut)
            play(btnDetailFadeOut).with(btnRandomPickFadeIn)
            play(btnRandomPickFadeIn).with(npFadeIn)
            play(npFadeIn).with(tvTitleFadeIn)
        }
        AnimatorSet().apply {
            play(randomPickReStartAnimation)
            start()
            if (AnimatorSet().isRunning == false){
                AnimatorSet().end()
                overridePendingTransition(0,0)
            }
        }
    }


    private fun setData() {

        val values = mutableSetOf("맘스터치", "서브웨이", "전주식당", "롯데리아", "홍콩반점", "토마토", "두부집", "시골집", "천향마라탕", "최고당돈까스")
        dataList.addAll(values)

        np.wrapSelectorWheel = true
        np.minValue = 0
        np.maxValue = dataList.size.minus(1)
        np.displayedValues = dataList.toTypedArray()

    }



    private fun onRandomPick() {
        val ran = Random.nextInt(0, dataList.size)

        val randomPickAnimation =
            ObjectAnimator.ofInt(np.value, np.value.plus(ran)).apply {
                interpolator = CustomInterpolator() //빠르기 설정
                duration = 1000 //1000 = 1초

                addUpdateListener {
                    np.value = it.animatedValue as Int
                    Log.d("MainActivity", dataList[np.value])


                }

            }//np.ObjectAnimator
        val npFadeOut = ObjectAnimator.ofFloat(np,"alpha", 1f, 0f ).apply { duration = 2500 }
        val tvResultCenterMove = ObjectAnimator.ofFloat(tvResult, "translationY", 200f).apply { duration = 300 }
        val tvResultFadeIn = ObjectAnimator.ofFloat(tvResult, "alpha", 0f, 1f).apply {
            duration = 100
            addUpdateListener {
                tvResult.text = dataList[np.value]
            }
        }
        val btnRetryFadein = ObjectAnimator.ofFloat(btnRetry, "alpha", 0f, 1f).apply { duration = 100 }
        val btnDetailFadeIn = ObjectAnimator.ofFloat(btnDetail, "alpha", 0f, 1f).apply { duration = 100 }
        val tvTitleFadeOut = ObjectAnimator.ofFloat(tvTitle,"alpha", 1f, 0f ).apply { duration = 100 }
        val btnRandomPickFadeOut = ObjectAnimator.ofFloat(btnRandomPick,"alpha", 1f, 0f ).apply { duration = 100 }

        val randomPickEndAnimation = AnimatorSet().apply {
            play(npFadeOut).before(tvResultCenterMove)
            play(tvResultCenterMove).with(tvResultFadeIn)
            play(tvResultFadeIn).with(btnRetryFadein)
            play(btnRetryFadein).with(btnDetailFadeIn)
            play(btnDetailFadeIn).with(tvTitleFadeOut)
            play(tvTitleFadeOut).with(btnRandomPickFadeOut)

        } // NumberPicker가 끝나고 결과 보여주는 애니메이션 집합

        btnRetry.setOnClickListener {
            //tvResult.setText(null)
            randomPickAnimation.end()
            //tvResult.visibility = View.INVISIBLE
            randomPickEndAnimation.cancel()
            randomPickEndAnimation.reverse()
            onRandomPick()
        } // 다시뽑기를 눌렀을 때 다시 진행해야 하는데 진행이 안됨 이유는 애니메이션 진행결과 값이 누적됨

        btnRandomPick.setOnClickListener {
            randomPickAnimation.start()
            AnimatorSet().apply {
                playSequentially(randomPickAnimation, randomPickEndAnimation)
                start()
            }
        } // 랜덤추천을 눌렀을 시 애니메이션 진행

    }//randomPick()





    inner class CustomInterpolator : FastOutLinearInInterpolator() {
        override fun getInterpolation(input: Float): Float =
            (Math.cos((input + 1) * Math.PI) / 1.5f).toFloat() + 0.5f

    }
}



