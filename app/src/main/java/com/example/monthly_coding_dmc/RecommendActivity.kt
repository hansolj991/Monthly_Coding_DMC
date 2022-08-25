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

        val values = mutableSetOf("싸움의 고수", "본죽", "동명", "YumYum", "서브웨이", "곱분이곱창", "맛닭꼬", "지지고", "통큰갈비", "이삭토스트", "롯데리아", "구이가", "맘스터치",
            "돈발해", "토마토김밥", "큰맘 할매 순대국", "홍루이젠", "최고당돈까스", "고척돈가스", "백채 김치찌개", "아부찌부대찌개", "만포 돼지국밥/순대국", "피자스쿨", "홍춘천 치즈닭갈비",
            "제주몰빵", "한솥도시락", "걸작 떡볶이 치킨", "타코비/치즈볼", "일품마라탕", "빨봉분식", "홍콩반점", "놀부 부대찌개/철판구이", "죠스떡볶이", "엽기떡볶이", "김밥왕국", "뒤뜰",
            "노랑통닭", "메가커피", "투썸플레이스", "보드람치킨", "삼삼치킨", "테니스 피자 펍", "마포주먹고기", "언스틸", "고척칼국수", "진스시", "꼭지식당", "멕시카나 치킨", "내고향왕만두",
            "하우마라", "고척동이태리", "두부이야기", "bhc", "전주맛집", "마니식당", "동산닭요리", "명가함흥냉면", "대박고깃집", "소문난 순대국 왕 족발", "곱창마을", "취화원", "아마스빈 버블티",
            "경성꽈배기", "컴포즈커피", "전주식당", "advendutch", "303place", "전가복", "향촌숯불돈갈비", "은성이네 식당", "생각나는 울 엄마찌개", "양꼬치 훠궈", "꿀꿀이 생고기 맛집", "와플대학",
            "뜸들이다", "난연스시"
            )
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



