package com.example.monthly_coding_dmc

import android.graphics.drawable.Drawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView
import android.widget.Toast
import androidx.core.content.res.ResourcesCompat
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


        getValueIntent()
    }
    private fun getValueIntent(){
        Log.d("Detail", intent.getStringExtra("result").toString())
        val recommendLunch: Int = intent.getStringExtra("result")!!.toInt()
        val lunArray = arrayOf(
            resources.getStringArray(R.array.restaurant_array1), resources.getStringArray(R.array.restaurant_array2), resources.getStringArray(R.array.restaurant_array3),
            resources.getStringArray(R.array.restaurant_array4), resources.getStringArray(R.array.restaurant_array5), resources.getStringArray(R.array.restaurant_array6),
            resources.getStringArray(R.array.restaurant_array7), resources.getStringArray(R.array.restaurant_array8), resources.getStringArray(R.array.restaurant_array9),
            resources.getStringArray(R.array.restaurant_array10), resources.getStringArray(R.array.restaurant_array11), resources.getStringArray(R.array.restaurant_array12),
            resources.getStringArray(R.array.restaurant_array13), resources.getStringArray(R.array.restaurant_array14), resources.getStringArray(R.array.restaurant_array15),
            resources.getStringArray(R.array.restaurant_array16), resources.getStringArray(R.array.restaurant_array17), resources.getStringArray(R.array.restaurant_array18),
            resources.getStringArray(R.array.restaurant_array19), resources.getStringArray(R.array.restaurant_array20), resources.getStringArray(R.array.restaurant_array21),
            resources.getStringArray(R.array.restaurant_array22), resources.getStringArray(R.array.restaurant_array23), resources.getStringArray(R.array.restaurant_array24),
            resources.getStringArray(R.array.restaurant_array25), resources.getStringArray(R.array.restaurant_array26), resources.getStringArray(R.array.restaurant_array27),
            resources.getStringArray(R.array.restaurant_array28), resources.getStringArray(R.array.restaurant_array29), resources.getStringArray(R.array.restaurant_array30),
            resources.getStringArray(R.array.restaurant_array31), resources.getStringArray(R.array.restaurant_array32), resources.getStringArray(R.array.restaurant_array33),
            resources.getStringArray(R.array.restaurant_array34), resources.getStringArray(R.array.restaurant_array35), resources.getStringArray(R.array.restaurant_array36),
            resources.getStringArray(R.array.restaurant_array37), resources.getStringArray(R.array.restaurant_array38), resources.getStringArray(R.array.restaurant_array39),
            resources.getStringArray(R.array.restaurant_array40), resources.getStringArray(R.array.restaurant_array41), resources.getStringArray(R.array.restaurant_array42),
            resources.getStringArray(R.array.restaurant_array43), resources.getStringArray(R.array.restaurant_array44), resources.getStringArray(R.array.restaurant_array45),
            resources.getStringArray(R.array.restaurant_array46), resources.getStringArray(R.array.restaurant_array47), resources.getStringArray(R.array.restaurant_array48),
            resources.getStringArray(R.array.restaurant_array49), resources.getStringArray(R.array.restaurant_array50), resources.getStringArray(R.array.restaurant_array51),
            resources.getStringArray(R.array.restaurant_array52), resources.getStringArray(R.array.restaurant_array53), resources.getStringArray(R.array.restaurant_array54),
            resources.getStringArray(R.array.restaurant_array55), resources.getStringArray(R.array.restaurant_array56), resources.getStringArray(R.array.restaurant_array57),
            resources.getStringArray(R.array.restaurant_array58), resources.getStringArray(R.array.restaurant_array59), resources.getStringArray(R.array.restaurant_array60),
            resources.getStringArray(R.array.restaurant_array61), resources.getStringArray(R.array.restaurant_array62), resources.getStringArray(R.array.restaurant_array63),
            resources.getStringArray(R.array.restaurant_array64), resources.getStringArray(R.array.restaurant_array65), resources.getStringArray(R.array.restaurant_array66),
            resources.getStringArray(R.array.restaurant_array67), resources.getStringArray(R.array.restaurant_array68), resources.getStringArray(R.array.restaurant_array69),
            resources.getStringArray(R.array.restaurant_array70), resources.getStringArray(R.array.restaurant_array71), resources.getStringArray(R.array.restaurant_array72),
            resources.getStringArray(R.array.restaurant_array73)
        )


        val r10: Drawable? = ResourcesCompat.getDrawable(resources, R.drawable.restaurant1_banner, null)
        val r11: Drawable? = ResourcesCompat.getDrawable(resources, R.drawable.restaurant1_menu1, null)
        val r12: Drawable? = ResourcesCompat.getDrawable(resources, R.drawable.restaurant1_menu2, null)
        val r13: Drawable? = ResourcesCompat.getDrawable(resources, R.drawable.restaurant1_menu3, null)
        val r20: Drawable? = ResourcesCompat.getDrawable(resources, R.drawable.restaurant2_banner, null)
        val r21: Drawable? = ResourcesCompat.getDrawable(resources, R.drawable.restaurant2_menu1, null)
        val r22: Drawable? = ResourcesCompat.getDrawable(resources, R.drawable.restaurant_noimg, null)
        val r23: Drawable? = ResourcesCompat.getDrawable(resources, R.drawable.restaurant_noimg, null)
        val r30: Drawable? = ResourcesCompat.getDrawable(resources, R.drawable.restaurant3_banner, null)
        val r31: Drawable? = ResourcesCompat.getDrawable(resources, R.drawable.restaurant3_menu1, null)
        val r32: Drawable? = ResourcesCompat.getDrawable(resources, R.drawable.restaurant3_menu2, null)
        val r33: Drawable? = ResourcesCompat.getDrawable(resources, R.drawable.restaurant3_menu3, null)
        val r40: Drawable? = ResourcesCompat.getDrawable(resources, R.drawable.restaurant4_banner, null)
        val r41: Drawable? = ResourcesCompat.getDrawable(resources, R.drawable.restaurant_noimg, null)
        val r42: Drawable? = ResourcesCompat.getDrawable(resources, R.drawable.restaurant_noimg, null)
        val r43: Drawable? = ResourcesCompat.getDrawable(resources, R.drawable.restaurant_noimg, null)
        val r50: Drawable? = ResourcesCompat.getDrawable(resources, R.drawable.restaurant5_banner, null)
        val r51: Drawable? = ResourcesCompat.getDrawable(resources, R.drawable.restaurant5_menu1, null)
        val r52: Drawable? = ResourcesCompat.getDrawable(resources, R.drawable.restaurant5_menu2, null)
        val r53: Drawable? = ResourcesCompat.getDrawable(resources, R.drawable.restaurant5_menu3, null)
        val r60: Drawable? = ResourcesCompat.getDrawable(resources, R.drawable.restaurant_noimg, null)
        val r61: Drawable? = ResourcesCompat.getDrawable(resources, R.drawable.restaurant_noimg, null)
        val r62: Drawable? = ResourcesCompat.getDrawable(resources, R.drawable.restaurant_noimg, null)
        val r63: Drawable? = ResourcesCompat.getDrawable(resources, R.drawable.restaurant_noimg, null)
        val r70: Drawable? = ResourcesCompat.getDrawable(resources, R.drawable.restaurant7_banner, null)
        val r71: Drawable? = ResourcesCompat.getDrawable(resources, R.drawable.restaurant7_menu1, null)
        val r72: Drawable? = ResourcesCompat.getDrawable(resources, R.drawable.restaurant7_menu2, null)
        val r73: Drawable? = ResourcesCompat.getDrawable(resources, R.drawable.restaurant7_menu3, null)
        val r80: Drawable? = ResourcesCompat.getDrawable(resources, R.drawable.restaurant8_banner, null)
        val r81: Drawable? = ResourcesCompat.getDrawable(resources, R.drawable.restaurant8_menu1, null)
        val r82: Drawable? = ResourcesCompat.getDrawable(resources, R.drawable.restaurant8_menu2, null)
        val r83: Drawable? = ResourcesCompat.getDrawable(resources, R.drawable.restaurant8_menu3, null)
        val r90: Drawable? = ResourcesCompat.getDrawable(resources, R.drawable.restaurant9_banner, null)
        val r91: Drawable? = ResourcesCompat.getDrawable(resources, R.drawable.restaurant_noimg, null)
        val r92: Drawable? = ResourcesCompat.getDrawable(resources, R.drawable.restaurant_noimg, null)
        val r93: Drawable? = ResourcesCompat.getDrawable(resources, R.drawable.restaurant_noimg, null)
        val r100: Drawable? = ResourcesCompat.getDrawable(resources, R.drawable.restaurant10_banner, null)
        val r101: Drawable? = ResourcesCompat.getDrawable(resources, R.drawable.restaurant10_menu1, null)
        val r102: Drawable? = ResourcesCompat.getDrawable(resources, R.drawable.restaurant10_menu2, null)
        val r103: Drawable? = ResourcesCompat.getDrawable(resources, R.drawable.restaurant10_menu3, null)
        val r110: Drawable? = ResourcesCompat.getDrawable(resources, R.drawable.restaurant11_banner, null)
        val r111: Drawable? = ResourcesCompat.getDrawable(resources, R.drawable.restaurant11_menu1, null)
        val r112: Drawable? = ResourcesCompat.getDrawable(resources, R.drawable.restaurant11_menu2, null)
        val r113: Drawable? = ResourcesCompat.getDrawable(resources, R.drawable.restaurant11_menu3, null)
        val r120: Drawable? = ResourcesCompat.getDrawable(resources, R.drawable.restaurant12_banner, null)
        val r121: Drawable? = ResourcesCompat.getDrawable(resources, R.drawable.restaurant_noimg, null)
        val r122: Drawable? = ResourcesCompat.getDrawable(resources, R.drawable.restaurant_noimg, null)
        val r123: Drawable? = ResourcesCompat.getDrawable(resources, R.drawable.restaurant_noimg, null)
        val r130: Drawable? = ResourcesCompat.getDrawable(resources, R.drawable.restaurant13_banner, null)
        val r131: Drawable? = ResourcesCompat.getDrawable(resources, R.drawable.restaurant13_menu1, null)
        val r132: Drawable? = ResourcesCompat.getDrawable(resources, R.drawable.restaurant13_menu2, null)
        val r133: Drawable? = ResourcesCompat.getDrawable(resources, R.drawable.restaurant13_menu3, null)
        val r140: Drawable? = ResourcesCompat.getDrawable(resources, R.drawable.restaurant14_banner, null)
        val r141: Drawable? = ResourcesCompat.getDrawable(resources, R.drawable.restaurant_noimg, null)
        val r142: Drawable? = ResourcesCompat.getDrawable(resources, R.drawable.restaurant_noimg, null)
        val r143: Drawable? = ResourcesCompat.getDrawable(resources, R.drawable.restaurant_noimg, null)
        val r150: Drawable? = ResourcesCompat.getDrawable(resources, R.drawable.restaurant15_banner, null)
        val r151: Drawable? = ResourcesCompat.getDrawable(resources, R.drawable.restaurant15_menu1, null)
        val r152: Drawable? = ResourcesCompat.getDrawable(resources, R.drawable.restaurant15_menu2, null)
        val r153: Drawable? = ResourcesCompat.getDrawable(resources, R.drawable.restaurant15_menu3, null)
        val r160: Drawable? = ResourcesCompat.getDrawable(resources, R.drawable.restaurant16_banner, null)
        val r161: Drawable? = ResourcesCompat.getDrawable(resources, R.drawable.restaurant16_menu1, null)
        val r162: Drawable? = ResourcesCompat.getDrawable(resources, R.drawable.restaurant16_menu1, null)
        val r163: Drawable? = ResourcesCompat.getDrawable(resources, R.drawable.restaurant16_menu3, null)
        val r170: Drawable? = ResourcesCompat.getDrawable(resources, R.drawable.restaurant17_banner, null)
        val r171: Drawable? = ResourcesCompat.getDrawable(resources, R.drawable.restaurant17_menu1, null)
        val r172: Drawable? = ResourcesCompat.getDrawable(resources, R.drawable.restaurant17_menu2, null)
        val r173: Drawable? = ResourcesCompat.getDrawable(resources, R.drawable.restaurant17_menu3, null)
        val r180: Drawable? = ResourcesCompat.getDrawable(resources, R.drawable.restaurant18_banner, null)
        val r181: Drawable? = ResourcesCompat.getDrawable(resources, R.drawable.restaurant18_menu1, null)
        val r182: Drawable? = ResourcesCompat.getDrawable(resources, R.drawable.restaurant18_menu2, null)
        val r183: Drawable? = ResourcesCompat.getDrawable(resources, R.drawable.restaurant18_menu3, null)
        val r190: Drawable? = ResourcesCompat.getDrawable(resources, R.drawable.restaurant19_banner, null)
        val r191: Drawable? = ResourcesCompat.getDrawable(resources, R.drawable.restaurant_noimg, null)
        val r192: Drawable? = ResourcesCompat.getDrawable(resources, R.drawable.restaurant19_menu2, null)
        val r193: Drawable? = ResourcesCompat.getDrawable(resources, R.drawable.restaurant_noimg, null)
        val r200: Drawable? = ResourcesCompat.getDrawable(resources, R.drawable.restaurant20_banner, null)
        val r201: Drawable? = ResourcesCompat.getDrawable(resources, R.drawable.restaurant20_menu1, null)
        val r202: Drawable? = ResourcesCompat.getDrawable(resources, R.drawable.restaurant_noimg, null)
        val r203: Drawable? = ResourcesCompat.getDrawable(resources, R.drawable.restaurant20_menu3, null)
        val r210: Drawable? = ResourcesCompat.getDrawable(resources, R.drawable.restaurant21_banner, null)
        val r211: Drawable? = ResourcesCompat.getDrawable(resources, R.drawable.restaurant21_menu1, null)
        val r212: Drawable? = ResourcesCompat.getDrawable(resources, R.drawable.restaurant21_menu2, null)
        val r213: Drawable? = ResourcesCompat.getDrawable(resources, R.drawable.restaurant21_menu3, null)
        val r220: Drawable? = ResourcesCompat.getDrawable(resources, R.drawable.restaurant22_banner, null)
        val r221: Drawable? = ResourcesCompat.getDrawable(resources, R.drawable.restaurant22_menu1, null)
        val r222: Drawable? = ResourcesCompat.getDrawable(resources, R.drawable.restaurant22_menu2, null)
        val r223: Drawable? = ResourcesCompat.getDrawable(resources, R.drawable.restaurant22_menu3, null)
        val r230: Drawable? = ResourcesCompat.getDrawable(resources, R.drawable.restaurant23_banner, null)
        val r231: Drawable? = ResourcesCompat.getDrawable(resources, R.drawable.restaurant23_menu1, null)
        val r232: Drawable? = ResourcesCompat.getDrawable(resources, R.drawable.restaurant23_menu2, null)
        val r233: Drawable? = ResourcesCompat.getDrawable(resources, R.drawable.restaurant23_menu3, null)
        val r240: Drawable? = ResourcesCompat.getDrawable(resources, R.drawable.restaurant24_banner, null)
        val r241: Drawable? = ResourcesCompat.getDrawable(resources, R.drawable.restaurant24_menu1, null)
        val r242: Drawable? = ResourcesCompat.getDrawable(resources, R.drawable.restaurant24_menu2, null)
        val r243: Drawable? = ResourcesCompat.getDrawable(resources, R.drawable.restaurant24_menu3, null)
        val r250: Drawable? = ResourcesCompat.getDrawable(resources, R.drawable.restaurant25_banner, null)
        val r251: Drawable? = ResourcesCompat.getDrawable(resources, R.drawable.restaurant_noimg, null)
        val r252: Drawable? = ResourcesCompat.getDrawable(resources, R.drawable.restaurant_noimg, null)
        val r253: Drawable? = ResourcesCompat.getDrawable(resources, R.drawable.restaurant_noimg, null)
        val r260: Drawable? = ResourcesCompat.getDrawable(resources, R.drawable.restaurant26_banner, null)
        val r261: Drawable? = ResourcesCompat.getDrawable(resources, R.drawable.restaurant26_menu1, null)
        val r262: Drawable? = ResourcesCompat.getDrawable(resources, R.drawable.restaurant26_menu2, null)
        val r263: Drawable? = ResourcesCompat.getDrawable(resources, R.drawable.restaurant26_menu3, null)
        val r270: Drawable? = ResourcesCompat.getDrawable(resources, R.drawable.restaurant27_banner, null)
        val r271: Drawable? = ResourcesCompat.getDrawable(resources, R.drawable.restaurant27_menu1, null)
        val r272: Drawable? = ResourcesCompat.getDrawable(resources, R.drawable.restaurant27_menu2, null)
        val r273: Drawable? = ResourcesCompat.getDrawable(resources, R.drawable.restaurant27_menu3, null)
        val r280: Drawable? = ResourcesCompat.getDrawable(resources, R.drawable.restaurant28_banner, null)
        val r281: Drawable? = ResourcesCompat.getDrawable(resources, R.drawable.restaurant_noimg, null)
        val r282: Drawable? = ResourcesCompat.getDrawable(resources, R.drawable.restaurant_noimg, null)
        val r283: Drawable? = ResourcesCompat.getDrawable(resources, R.drawable.restaurant_noimg, null)
        val r290: Drawable? = ResourcesCompat.getDrawable(resources, R.drawable.restaurant29_banner, null)
        val r291: Drawable? = ResourcesCompat.getDrawable(resources, R.drawable.restaurant29_menu1, null)
        val r292: Drawable? = ResourcesCompat.getDrawable(resources, R.drawable.restaurant29_menu2, null)
        val r293: Drawable? = ResourcesCompat.getDrawable(resources, R.drawable.restaurant29_menu3, null)
        val r300: Drawable? = ResourcesCompat.getDrawable(resources, R.drawable.restaurant30_banner, null)
        val r301: Drawable? = ResourcesCompat.getDrawable(resources, R.drawable.restaurant_noimg, null)
        val r302: Drawable? = ResourcesCompat.getDrawable(resources, R.drawable.restaurant_noimg, null)
        val r303: Drawable? = ResourcesCompat.getDrawable(resources, R.drawable.restaurant_noimg, null)
        val r310: Drawable? = ResourcesCompat.getDrawable(resources, R.drawable.restaurant31_banner, null)
        val r311: Drawable? = ResourcesCompat.getDrawable(resources, R.drawable.restaurant31_menu1, null)
        val r312: Drawable? = ResourcesCompat.getDrawable(resources, R.drawable.restaurant31_menu2, null)
        val r313: Drawable? = ResourcesCompat.getDrawable(resources, R.drawable.restaurant31_menu3, null)
        val r320: Drawable? = ResourcesCompat.getDrawable(resources, R.drawable.restaurant32_banner, null)
        val r321: Drawable? = ResourcesCompat.getDrawable(resources, R.drawable.restaurant_noimg, null)
        val r322: Drawable? = ResourcesCompat.getDrawable(resources, R.drawable.restaurant_noimg, null)
        val r323: Drawable? = ResourcesCompat.getDrawable(resources, R.drawable.restaurant_noimg, null)
        val r330: Drawable? = ResourcesCompat.getDrawable(resources, R.drawable.restaurant33_banner, null)
        val r331: Drawable? = ResourcesCompat.getDrawable(resources, R.drawable.restaurant33_menu1, null)
        val r332: Drawable? = ResourcesCompat.getDrawable(resources, R.drawable.restaurant33_menu2, null)
        val r333: Drawable? = ResourcesCompat.getDrawable(resources, R.drawable.restaurant33_menu3, null)
        val r340: Drawable? = ResourcesCompat.getDrawable(resources, R.drawable.restaurant34_banner, null)
        val r341: Drawable? = ResourcesCompat.getDrawable(resources, R.drawable.restaurant34_menu1, null)
        val r342: Drawable? = ResourcesCompat.getDrawable(resources, R.drawable.restaurant34_menu2, null)
        val r343: Drawable? = ResourcesCompat.getDrawable(resources, R.drawable.restaurant34_menu3, null)
        val r350: Drawable? = ResourcesCompat.getDrawable(resources, R.drawable.restaurant35_banner, null)
        val r351: Drawable? = ResourcesCompat.getDrawable(resources, R.drawable.restaurant_noimg, null)
        val r352: Drawable? = ResourcesCompat.getDrawable(resources, R.drawable.restaurant_noimg, null)
        val r353: Drawable? = ResourcesCompat.getDrawable(resources, R.drawable.restaurant_noimg, null)
        val r360: Drawable? = ResourcesCompat.getDrawable(resources, R.drawable.restaurant36_banner, null)
        val r361: Drawable? = ResourcesCompat.getDrawable(resources, R.drawable.restaurant36_menu1, null)
        val r362: Drawable? = ResourcesCompat.getDrawable(resources, R.drawable.restaurant36_menu2, null)
        val r363: Drawable? = ResourcesCompat.getDrawable(resources, R.drawable.restaurant36_menu3, null)
        val r370: Drawable? = ResourcesCompat.getDrawable(resources, R.drawable.restaurant37_banner, null)
        val r371: Drawable? = ResourcesCompat.getDrawable(resources, R.drawable.restaurant37_menu1, null)
        val r372: Drawable? = ResourcesCompat.getDrawable(resources, R.drawable.restaurant37_menu2, null)
        val r373: Drawable? = ResourcesCompat.getDrawable(resources, R.drawable.restaurant37_menu3, null)
        val r380: Drawable? = ResourcesCompat.getDrawable(resources, R.drawable.restaurant38_banner, null)
        val r381: Drawable? = ResourcesCompat.getDrawable(resources, R.drawable.restaurant_noimg, null)
        val r382: Drawable? = ResourcesCompat.getDrawable(resources, R.drawable.restaurant_noimg, null)
        val r383: Drawable? = ResourcesCompat.getDrawable(resources, R.drawable.restaurant_noimg, null)
        val r390: Drawable? = ResourcesCompat.getDrawable(resources, R.drawable.restaurant39_banner, null)
        val r391: Drawable? = ResourcesCompat.getDrawable(resources, R.drawable.restaurant39_menu1, null)
        val r392: Drawable? = ResourcesCompat.getDrawable(resources, R.drawable.restaurant39_menu2, null)
        val r393: Drawable? = ResourcesCompat.getDrawable(resources, R.drawable.restaurant39_menu3, null)
        val r400: Drawable? = ResourcesCompat.getDrawable(resources, R.drawable.restaurant40_banner, null)
        val r401: Drawable? = ResourcesCompat.getDrawable(resources, R.drawable.restaurant40_menu1, null)
        val r402: Drawable? = ResourcesCompat.getDrawable(resources, R.drawable.restaurant40_menu2, null)
        val r403: Drawable? = ResourcesCompat.getDrawable(resources, R.drawable.restaurant40_menu3, null)
        val r410: Drawable? = ResourcesCompat.getDrawable(resources, R.drawable.restaurant41_banner, null)
        val r411: Drawable? = ResourcesCompat.getDrawable(resources, R.drawable.restaurant_noimg, null)
        val r412: Drawable? = ResourcesCompat.getDrawable(resources, R.drawable.restaurant_noimg, null)
        val r413: Drawable? = ResourcesCompat.getDrawable(resources, R.drawable.restaurant_noimg, null)
        val r420: Drawable? = ResourcesCompat.getDrawable(resources, R.drawable.restaurant42_banner, null)
        val r421: Drawable? = ResourcesCompat.getDrawable(resources, R.drawable.restaurant42_menu1, null)
        val r422: Drawable? = ResourcesCompat.getDrawable(resources, R.drawable.restaurant42_menu2, null)
        val r423: Drawable? = ResourcesCompat.getDrawable(resources, R.drawable.restaurant42_menu3, null)
        val r430: Drawable? = ResourcesCompat.getDrawable(resources, R.drawable.restaurant43_banner, null)
        val r431: Drawable? = ResourcesCompat.getDrawable(resources, R.drawable.restaurant_noimg, null)
        val r432: Drawable? = ResourcesCompat.getDrawable(resources, R.drawable.restaurant_noimg, null)
        val r433: Drawable? = ResourcesCompat.getDrawable(resources, R.drawable.restaurant_noimg, null)
        val r440: Drawable? = ResourcesCompat.getDrawable(resources, R.drawable.restaurant44_banner, null)
        val r441: Drawable? = ResourcesCompat.getDrawable(resources, R.drawable.restaurant44_menu1, null)
        val r442: Drawable? = ResourcesCompat.getDrawable(resources, R.drawable.restaurant44_menu2, null)
        val r443: Drawable? = ResourcesCompat.getDrawable(resources, R.drawable.restaurant44_menu3, null)
        val r450: Drawable? = ResourcesCompat.getDrawable(resources, R.drawable.restaurant45_banner, null)
        val r451: Drawable? = ResourcesCompat.getDrawable(resources, R.drawable.restaurant45_menu1, null)
        val r452: Drawable? = ResourcesCompat.getDrawable(resources, R.drawable.restaurant_noimg, null)
        val r453: Drawable? = ResourcesCompat.getDrawable(resources, R.drawable.restaurant_noimg, null)
        val r460: Drawable? = ResourcesCompat.getDrawable(resources, R.drawable.restaurant46_banner, null)
        val r461: Drawable? = ResourcesCompat.getDrawable(resources, R.drawable.restaurant46_menu1, null)
        val r462: Drawable? = ResourcesCompat.getDrawable(resources, R.drawable.restaurant46_menu2, null)
        val r463: Drawable? = ResourcesCompat.getDrawable(resources, R.drawable.restaurant46_menu3, null)
        val r470: Drawable? = ResourcesCompat.getDrawable(resources, R.drawable.restaurant47_banner, null)
        val r471: Drawable? = ResourcesCompat.getDrawable(resources, R.drawable.restaurant47_menu1, null)
        val r472: Drawable? = ResourcesCompat.getDrawable(resources, R.drawable.restaurant47_menu2, null)
        val r473: Drawable? = ResourcesCompat.getDrawable(resources, R.drawable.restaurant47_menu3, null)
        val r480: Drawable? = ResourcesCompat.getDrawable(resources, R.drawable.restaurant48_banner, null)
        val r481: Drawable? = ResourcesCompat.getDrawable(resources, R.drawable.restaurant48_menu1, null)
        val r482: Drawable? = ResourcesCompat.getDrawable(resources, R.drawable.restaurant48_menu2, null)
        val r483: Drawable? = ResourcesCompat.getDrawable(resources, R.drawable.restaurant48_menu3, null)
        val r490: Drawable? = ResourcesCompat.getDrawable(resources, R.drawable.restaurant49_banner, null)
        val r491: Drawable? = ResourcesCompat.getDrawable(resources, R.drawable.restaurant_noimg, null)
        val r492: Drawable? = ResourcesCompat.getDrawable(resources, R.drawable.restaurant_noimg, null)
        val r493: Drawable? = ResourcesCompat.getDrawable(resources, R.drawable.restaurant_noimg, null)
        val r500: Drawable? = ResourcesCompat.getDrawable(resources, R.drawable.restaurant50_banner, null)
        val r501: Drawable? = ResourcesCompat.getDrawable(resources, R.drawable.restaurant50_menu1, null)
        val r502: Drawable? = ResourcesCompat.getDrawable(resources, R.drawable.restaurant50_menu2, null)
        val r503: Drawable? = ResourcesCompat.getDrawable(resources, R.drawable.restaurant50_menu3, null)
        val r510: Drawable? = ResourcesCompat.getDrawable(resources, R.drawable.restaurant51_banner, null)
        val r511: Drawable? = ResourcesCompat.getDrawable(resources, R.drawable.restaurant51_menu1, null)
        val r512: Drawable? = ResourcesCompat.getDrawable(resources, R.drawable.restaurant51_menu2, null)
        val r513: Drawable? = ResourcesCompat.getDrawable(resources, R.drawable.restaurant_noimg, null)
        val r520: Drawable? = ResourcesCompat.getDrawable(resources, R.drawable.restaurant52_banner, null)
        val r521: Drawable? = ResourcesCompat.getDrawable(resources, R.drawable.restaurant52_menu1, null)
        val r522: Drawable? = ResourcesCompat.getDrawable(resources, R.drawable.restaurant_noimg, null)
        val r523: Drawable? = ResourcesCompat.getDrawable(resources, R.drawable.restaurant52_menu3, null)
        val r530: Drawable? = ResourcesCompat.getDrawable(resources, R.drawable.restaurant53_banner, null)
        val r531: Drawable? = ResourcesCompat.getDrawable(resources, R.drawable.restaurant53_menu1, null)
        val r532: Drawable? = ResourcesCompat.getDrawable(resources, R.drawable.restaurant53_menu2, null)
        val r533: Drawable? = ResourcesCompat.getDrawable(resources, R.drawable.restaurant53_menu3, null)
        val r540: Drawable? = ResourcesCompat.getDrawable(resources, R.drawable.restaurant54_banner, null)
        val r541: Drawable? = ResourcesCompat.getDrawable(resources, R.drawable.restaurant54_menu1, null)
        val r542: Drawable? = ResourcesCompat.getDrawable(resources, R.drawable.restaurant54_menu2, null)
        val r543: Drawable? = ResourcesCompat.getDrawable(resources, R.drawable.restaurant54_menu3, null)
        val r550: Drawable? = ResourcesCompat.getDrawable(resources, R.drawable.restaurant55_banner, null)
        val r551: Drawable? = ResourcesCompat.getDrawable(resources, R.drawable.restaurant55_menu1, null)
        val r552: Drawable? = ResourcesCompat.getDrawable(resources, R.drawable.restaurant55_menu2, null)
        val r553: Drawable? = ResourcesCompat.getDrawable(resources, R.drawable.restaurant55_menu3, null)
        val r560: Drawable? = ResourcesCompat.getDrawable(resources, R.drawable.restaurant56_banner, null)
        val r561: Drawable? = ResourcesCompat.getDrawable(resources, R.drawable.restaurant56_menu1, null)
        val r562: Drawable? = ResourcesCompat.getDrawable(resources, R.drawable.restaurant56_menu2, null)
        val r563: Drawable? = ResourcesCompat.getDrawable(resources, R.drawable.restaurant56_menu3, null)
        val r570: Drawable? = ResourcesCompat.getDrawable(resources, R.drawable.restaurant57_banner, null)
        val r571: Drawable? = ResourcesCompat.getDrawable(resources, R.drawable.restaurant57_menu1, null)
        val r572: Drawable? = ResourcesCompat.getDrawable(resources, R.drawable.restaurant57_menu2, null)
        val r573: Drawable? = ResourcesCompat.getDrawable(resources, R.drawable.restaurant_noimg, null)
        val r580: Drawable? = ResourcesCompat.getDrawable(resources, R.drawable.restaurant58_banner, null)
        val r581: Drawable? = ResourcesCompat.getDrawable(resources, R.drawable.restaurant58_menu1, null)
        val r582: Drawable? = ResourcesCompat.getDrawable(resources, R.drawable.restaurant58_menu2, null)
        val r583: Drawable? = ResourcesCompat.getDrawable(resources, R.drawable.restaurant58_menu3, null)
        val r590: Drawable? = ResourcesCompat.getDrawable(resources, R.drawable.restaurant59_banner, null)
        val r591: Drawable? = ResourcesCompat.getDrawable(resources, R.drawable.restaurant59_menu1, null)
        val r592: Drawable? = ResourcesCompat.getDrawable(resources, R.drawable.restaurant59_menu2, null)
        val r593: Drawable? = ResourcesCompat.getDrawable(resources, R.drawable.restaurant59_menu3, null)
        val r600: Drawable? = ResourcesCompat.getDrawable(resources, R.drawable.restaurant60_banner, null)
        val r601: Drawable? = ResourcesCompat.getDrawable(resources, R.drawable.restaurant60_menu1, null)
        val r602: Drawable? = ResourcesCompat.getDrawable(resources, R.drawable.restaurant60_menu2, null)
        val r603: Drawable? = ResourcesCompat.getDrawable(resources, R.drawable.restaurant60_menu3, null)
        val r610: Drawable? = ResourcesCompat.getDrawable(resources, R.drawable.restaurant61_banner, null)
        val r611: Drawable? = ResourcesCompat.getDrawable(resources, R.drawable.restaurant61_menu1, null)
        val r612: Drawable? = ResourcesCompat.getDrawable(resources, R.drawable.restaurant61_menu2, null)
        val r613: Drawable? = ResourcesCompat.getDrawable(resources, R.drawable.restaurant61_menu3, null)
        val r620: Drawable? = ResourcesCompat.getDrawable(resources, R.drawable.restaurant62_banner, null)
        val r621: Drawable? = ResourcesCompat.getDrawable(resources, R.drawable.restaurant62_menu1, null)
        val r622: Drawable? = ResourcesCompat.getDrawable(resources, R.drawable.restaurant62_menu2, null)
        val r623: Drawable? = ResourcesCompat.getDrawable(resources, R.drawable.restaurant62_menu3, null)
        val r630: Drawable? = ResourcesCompat.getDrawable(resources, R.drawable.restaurant63_banner, null)
        val r631: Drawable? = ResourcesCompat.getDrawable(resources, R.drawable.restaurant63_menu1, null)
        val r632: Drawable? = ResourcesCompat.getDrawable(resources, R.drawable.restaurant63_menu2, null)
        val r633: Drawable? = ResourcesCompat.getDrawable(resources, R.drawable.restaurant63_menu3, null)
        val r640: Drawable? = ResourcesCompat.getDrawable(resources, R.drawable.restaurant64_banner, null)
        val r641: Drawable? = ResourcesCompat.getDrawable(resources, R.drawable.restaurant64_menu1, null)
        val r642: Drawable? = ResourcesCompat.getDrawable(resources, R.drawable.restaurant64_menu2, null)
        val r643: Drawable? = ResourcesCompat.getDrawable(resources, R.drawable.restaurant64_menu3, null)
        val r650: Drawable? = ResourcesCompat.getDrawable(resources, R.drawable.restaurant65_banner, null)
        val r651: Drawable? = ResourcesCompat.getDrawable(resources, R.drawable.restaurant65_menu1, null)
        val r652: Drawable? = ResourcesCompat.getDrawable(resources, R.drawable.restaurant65_menu2, null)
        val r653: Drawable? = ResourcesCompat.getDrawable(resources, R.drawable.restaurant65_menu3, null)
        val r660: Drawable? = ResourcesCompat.getDrawable(resources, R.drawable.restaurant66_banner, null)
        val r661: Drawable? = ResourcesCompat.getDrawable(resources, R.drawable.restaurant66_menu1, null)
        val r662: Drawable? = ResourcesCompat.getDrawable(resources, R.drawable.restaurant66_menu2, null)
        val r663: Drawable? = ResourcesCompat.getDrawable(resources, R.drawable.restaurant66_menu3, null)
        val r670: Drawable? = ResourcesCompat.getDrawable(resources, R.drawable.restaurant67_banner, null)
        val r671: Drawable? = ResourcesCompat.getDrawable(resources, R.drawable.restaurant67_menu1, null)
        val r672: Drawable? = ResourcesCompat.getDrawable(resources, R.drawable.restaurant67_menu2, null)
        val r673: Drawable? = ResourcesCompat.getDrawable(resources, R.drawable.restaurant67_menu3, null)
        val r680: Drawable? = ResourcesCompat.getDrawable(resources, R.drawable.restaurant68_banner, null)
        val r681: Drawable? = ResourcesCompat.getDrawable(resources, R.drawable.restaurant68_menu1, null)
        val r682: Drawable? = ResourcesCompat.getDrawable(resources, R.drawable.restaurant68_menu2, null)
        val r683: Drawable? = ResourcesCompat.getDrawable(resources, R.drawable.restaurant68_menu3, null)
        val r690: Drawable? = ResourcesCompat.getDrawable(resources, R.drawable.restaurant69_banner, null)
        val r691: Drawable? = ResourcesCompat.getDrawable(resources, R.drawable.restaurant69_menu1, null)
        val r692: Drawable? = ResourcesCompat.getDrawable(resources, R.drawable.restaurant69_menu2, null)
        val r693: Drawable? = ResourcesCompat.getDrawable(resources, R.drawable.restaurant69_menu3, null)
        val r700: Drawable? = ResourcesCompat.getDrawable(resources, R.drawable.restaurant70_banner, null)
        val r701: Drawable? = ResourcesCompat.getDrawable(resources, R.drawable.restaurant_noimg, null)
        val r702: Drawable? = ResourcesCompat.getDrawable(resources, R.drawable.restaurant_noimg, null)
        val r703: Drawable? = ResourcesCompat.getDrawable(resources, R.drawable.restaurant_noimg, null)
        val r710: Drawable? = ResourcesCompat.getDrawable(resources, R.drawable.restaurant71_banner, null)
        val r711: Drawable? = ResourcesCompat.getDrawable(resources, R.drawable.restaurant71_menu1, null)
        val r712: Drawable? = ResourcesCompat.getDrawable(resources, R.drawable.restaurant71_menu2, null)
        val r713: Drawable? = ResourcesCompat.getDrawable(resources, R.drawable.restaurant71_menu3, null)
        val r720: Drawable? = ResourcesCompat.getDrawable(resources, R.drawable.restaurant72_banner, null)
        val r721: Drawable? = ResourcesCompat.getDrawable(resources, R.drawable.restaurant72_menu1, null)
        val r722: Drawable? = ResourcesCompat.getDrawable(resources, R.drawable.restaurant72_menu2, null)
        val r723: Drawable? = ResourcesCompat.getDrawable(resources, R.drawable.restaurant72_menu3, null)
        val r730: Drawable? = ResourcesCompat.getDrawable(resources, R.drawable.restaurant73_banner, null)
        val r731: Drawable? = ResourcesCompat.getDrawable(resources, R.drawable.restaurant73_menu1, null)
        val r732: Drawable? = ResourcesCompat.getDrawable(resources, R.drawable.restaurant73_menu2, null)
        val r733: Drawable? = ResourcesCompat.getDrawable(resources, R.drawable.restaurant73_menu3, null)
        val r740: Drawable? = ResourcesCompat.getDrawable(resources, R.drawable.restaurant_noimg, null)
        val r741: Drawable? = ResourcesCompat.getDrawable(resources, R.drawable.restaurant_noimg, null)
        val r742: Drawable? = ResourcesCompat.getDrawable(resources, R.drawable.restaurant_noimg, null)
        val r743: Drawable? = ResourcesCompat.getDrawable(resources, R.drawable.restaurant_noimg, null)


//        binding.menu1.setImageDrawable()

        val menuArray = arrayOf(
            arrayOf(r10,r11,r12,r13),arrayOf(r20,r21,r22,r23),arrayOf(r30,r31,r32,r33),arrayOf(r40,r41,r42,r43),arrayOf(r50,r51,r52,r53),
            arrayOf(r60,r61,r62,r63),arrayOf(r70,r71,r72,r73),arrayOf(r80,r81,r82,r83),arrayOf(r90,r91,r92,r93),arrayOf(r100,r101,r102,r103),
            arrayOf(r110,r111,r112,r113),arrayOf(r120,r121,r122,r123),arrayOf(r130,r131,r132,r133),arrayOf(r140,r141,r142,r143),arrayOf(r150,r151,r152,r153),
            arrayOf(r160,r161,r162,r163),arrayOf(r170,r171,r172,r173),arrayOf(r180,r181,r182,r183),arrayOf(r190,r191,r192,r193),arrayOf(r200,r201,r202,r203),
            arrayOf(r210,r211,r212,r213),arrayOf(r220,r221,r222,r223),arrayOf(r230,r231,r232,r233),arrayOf(r240,r241,r242,r243),arrayOf(r250,r251,r252,r253),
            arrayOf(r260,r261,r262,r263),arrayOf(r270,r271,r272,r273),arrayOf(r280,r281,r282,r283),arrayOf(r290,r291,r292,r293),arrayOf(r300,r301,r302,r303),
            arrayOf(r310,r311,r312,r313),arrayOf(r320,r321,r322,r323),arrayOf(r330,r331,r332,r333),arrayOf(r340,r341,r342,r343),arrayOf(r350,r351,r352,r353),
            arrayOf(r360,r361,r362,r363),arrayOf(r370,r371,r372,r373),arrayOf(r380,r381,r382,r383),arrayOf(r390,r391,r392,r393),arrayOf(r400,r401,r402,r403),
            arrayOf(r410,r411,r412,r413),arrayOf(r420,r421,r422,r423),arrayOf(r430,r431,r432,r433),arrayOf(r440,r441,r442,r443),arrayOf(r450,r451,r452,r453),
            arrayOf(r460,r461,r462,r463),arrayOf(r470,r471,r472,r473),arrayOf(r480,r481,r482,r483),arrayOf(r490,r491,r492,r493),arrayOf(r500,r501,r502,r503),
            arrayOf(r510,r511,r512,r513),arrayOf(r520,r521,r522,r523),arrayOf(r530,r531,r532,r533),arrayOf(r540,r541,r542,r543),arrayOf(r550,r551,r552,r553),
            arrayOf(r560,r561,r562,r563),arrayOf(r570,r571,r572,r573),arrayOf(r580,r581,r582,r583),arrayOf(r590,r591,r592,r593),arrayOf(r600,r601,r602,r603),
            arrayOf(r610,r611,r612,r613),arrayOf(r620,r621,r622,r623),arrayOf(r630,r631,r632,r633),arrayOf(r640,r641,r642,r643),arrayOf(r650,r651,r652,r653),
            arrayOf(r660,r661,r662,r663),arrayOf(r670,r671,r672,r673),arrayOf(r680,r681,r682,r683),arrayOf(r690,r691,r692,r693),arrayOf(r700,r701,r702,r703),
            arrayOf(r710,r711,r712,r713),arrayOf(r720,r721,r722,r723),arrayOf(r730,r731,r732,r733),arrayOf(r740,r741,r742,r743)
        )

        //val restaurantBanner = "R.drawable.restaurant$recommendLunch" + "_banner"  //배너이미지
        //val restaurantMenu1 = R.drawable.restaurant$recommendLunch_menu1         //메뉴1이미지
        //val restaurantMenu2 = "R.drawable.restaurant$recommendLunch" + "_menu2"  //메뉴2이미지
        //val restaurantMenu3 = "R.drawable.restaurant$recommendLunch" + "_menu3"  //메뉴3이미지

        binding.banner.setImageDrawable(menuArray[recommendLunch][0]) //배너
        binding.restaurantName.text = lunArray[recommendLunch][1]    //식당명
        binding.restaurantAddress.text = lunArray[recommendLunch][5] //주소
        binding.restaurantTime.text = lunArray[recommendLunch][3]  //영업시간
        binding.restaurantPhone.text = lunArray[recommendLunch][4]  //전화번호
        binding.menu1.setImageDrawable(menuArray[recommendLunch][1]) //메뉴1이미지
        binding.menuText1.text = lunArray[recommendLunch][11]       //메뉴1 이름
        binding.menuAccount1.text = lunArray[recommendLunch][12]    //메뉴1 가격
        binding.menu2.setImageDrawable(menuArray[recommendLunch][2]) //메뉴2이미지
        binding.menuText2.text = lunArray[recommendLunch][13]       //메뉴2 이름
        binding.menuAccount2.text = lunArray[recommendLunch][14]    //메뉴2 가격
        binding.menu3.setImageDrawable(menuArray[recommendLunch][3]) //메뉴3이미지
        binding.menuText3.text = lunArray[recommendLunch][15]       //메뉴3 이름
        binding.menuAccount3.text = lunArray[recommendLunch][16]    //메뉴3 가격

    }
}