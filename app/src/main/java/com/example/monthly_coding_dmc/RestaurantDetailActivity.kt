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


        val r11: Drawable? = ResourcesCompat.getDrawable(resources, R.drawable.restaurant1_menu1, null)
        val r12: Drawable? = ResourcesCompat.getDrawable(resources, R.drawable.restaurant1_menu2, null)
        val r13: Drawable? = ResourcesCompat.getDrawable(resources, R.drawable.restaurant1_menu3, null)
        val r21: Drawable? = ResourcesCompat.getDrawable(resources, R.drawable.restaurant2_menu1, null)
        val r22: Drawable? = ResourcesCompat.getDrawable(resources, R.drawable.restaurant_noimg, null)
        val r23: Drawable? = ResourcesCompat.getDrawable(resources, R.drawable.restaurant_noimg, null)
        val r31: Drawable? = ResourcesCompat.getDrawable(resources, R.drawable.restaurant3_menu1, null)
        val r32: Drawable? = ResourcesCompat.getDrawable(resources, R.drawable.restaurant3_menu2, null)
        val r33: Drawable? = ResourcesCompat.getDrawable(resources, R.drawable.restaurant3_menu3, null)
        val r41: Drawable? = ResourcesCompat.getDrawable(resources, R.drawable.restaurant_noimg, null)
        val r42: Drawable? = ResourcesCompat.getDrawable(resources, R.drawable.restaurant_noimg, null)
        val r43: Drawable? = ResourcesCompat.getDrawable(resources, R.drawable.restaurant_noimg, null)
        val r51: Drawable? = ResourcesCompat.getDrawable(resources, R.drawable.restaurant5_menu1, null)
        val r52: Drawable? = ResourcesCompat.getDrawable(resources, R.drawable.restaurant5_menu2, null)
        val r53: Drawable? = ResourcesCompat.getDrawable(resources, R.drawable.restaurant5_menu3, null)
        val r61: Drawable? = ResourcesCompat.getDrawable(resources, R.drawable.restaurant_noimg, null)
        val r62: Drawable? = ResourcesCompat.getDrawable(resources, R.drawable.restaurant_noimg, null)
        val r63: Drawable? = ResourcesCompat.getDrawable(resources, R.drawable.restaurant_noimg, null)
        val r71: Drawable? = ResourcesCompat.getDrawable(resources, R.drawable.restaurant7_menu1, null)
        val r72: Drawable? = ResourcesCompat.getDrawable(resources, R.drawable.restaurant7_menu2, null)
        val r73: Drawable? = ResourcesCompat.getDrawable(resources, R.drawable.restaurant7_menu3, null)
        val r81: Drawable? = ResourcesCompat.getDrawable(resources, R.drawable.restaurant8_menu1, null)
        val r82: Drawable? = ResourcesCompat.getDrawable(resources, R.drawable.restaurant8_menu2, null)
        val r83: Drawable? = ResourcesCompat.getDrawable(resources, R.drawable.restaurant8_menu3, null)
        val r91: Drawable? = ResourcesCompat.getDrawable(resources, R.drawable.restaurant_noimg, null)
        val r92: Drawable? = ResourcesCompat.getDrawable(resources, R.drawable.restaurant_noimg, null)
        val r93: Drawable? = ResourcesCompat.getDrawable(resources, R.drawable.restaurant_noimg, null)
        val r101: Drawable? = ResourcesCompat.getDrawable(resources, R.drawable.restaurant10_menu1, null)
        val r102: Drawable? = ResourcesCompat.getDrawable(resources, R.drawable.restaurant10_menu2, null)
        val r103: Drawable? = ResourcesCompat.getDrawable(resources, R.drawable.restaurant10_menu3, null)
        val r111: Drawable? = ResourcesCompat.getDrawable(resources, R.drawable.restaurant11_menu1, null)
        val r112: Drawable? = ResourcesCompat.getDrawable(resources, R.drawable.restaurant11_menu2, null)
        val r113: Drawable? = ResourcesCompat.getDrawable(resources, R.drawable.restaurant11_menu3, null)
        val r121: Drawable? = ResourcesCompat.getDrawable(resources, R.drawable.restaurant_noimg, null)
        val r122: Drawable? = ResourcesCompat.getDrawable(resources, R.drawable.restaurant_noimg, null)
        val r123: Drawable? = ResourcesCompat.getDrawable(resources, R.drawable.restaurant_noimg, null)
        val r131: Drawable? = ResourcesCompat.getDrawable(resources, R.drawable.restaurant13_menu1, null)
        val r132: Drawable? = ResourcesCompat.getDrawable(resources, R.drawable.restaurant13_menu2, null)
        val r133: Drawable? = ResourcesCompat.getDrawable(resources, R.drawable.restaurant13_menu3, null)
        val r141: Drawable? = ResourcesCompat.getDrawable(resources, R.drawable.restaurant_noimg, null)
        val r142: Drawable? = ResourcesCompat.getDrawable(resources, R.drawable.restaurant_noimg, null)
        val r143: Drawable? = ResourcesCompat.getDrawable(resources, R.drawable.restaurant_noimg, null)
        val r151: Drawable? = ResourcesCompat.getDrawable(resources, R.drawable.restaurant15_menu1, null)
        val r152: Drawable? = ResourcesCompat.getDrawable(resources, R.drawable.restaurant15_menu2, null)
        val r153: Drawable? = ResourcesCompat.getDrawable(resources, R.drawable.restaurant15_menu3, null)
        val r161: Drawable? = ResourcesCompat.getDrawable(resources, R.drawable.restaurant16_menu1, null)
        val r162: Drawable? = ResourcesCompat.getDrawable(resources, R.drawable.restaurant16_menu1, null)
        val r163: Drawable? = ResourcesCompat.getDrawable(resources, R.drawable.restaurant16_menu3, null)
        val r171: Drawable? = ResourcesCompat.getDrawable(resources, R.drawable.restaurant17_menu1, null)
        val r172: Drawable? = ResourcesCompat.getDrawable(resources, R.drawable.restaurant17_menu2, null)
        val r173: Drawable? = ResourcesCompat.getDrawable(resources, R.drawable.restaurant17_menu3, null)
        val r181: Drawable? = ResourcesCompat.getDrawable(resources, R.drawable.restaurant18_menu1, null)
        val r182: Drawable? = ResourcesCompat.getDrawable(resources, R.drawable.restaurant18_menu2, null)
        val r183: Drawable? = ResourcesCompat.getDrawable(resources, R.drawable.restaurant18_menu3, null)
        val r191: Drawable? = ResourcesCompat.getDrawable(resources, R.drawable.restaurant_noimg, null)
        val r192: Drawable? = ResourcesCompat.getDrawable(resources, R.drawable.restaurant19_menu2, null)
        val r193: Drawable? = ResourcesCompat.getDrawable(resources, R.drawable.restaurant_noimg, null)
        val r201: Drawable? = ResourcesCompat.getDrawable(resources, R.drawable.restaurant20_menu1, null)
        val r202: Drawable? = ResourcesCompat.getDrawable(resources, R.drawable.restaurant_noimg, null)
        val r203: Drawable? = ResourcesCompat.getDrawable(resources, R.drawable.restaurant20_menu3, null)
        val r211: Drawable? = ResourcesCompat.getDrawable(resources, R.drawable.restaurant21_menu1, null)
        val r212: Drawable? = ResourcesCompat.getDrawable(resources, R.drawable.restaurant21_menu2, null)
        val r213: Drawable? = ResourcesCompat.getDrawable(resources, R.drawable.restaurant21_menu3, null)
        val r221: Drawable? = ResourcesCompat.getDrawable(resources, R.drawable.restaurant22_menu1, null)
        val r222: Drawable? = ResourcesCompat.getDrawable(resources, R.drawable.restaurant22_menu2, null)
        val r223: Drawable? = ResourcesCompat.getDrawable(resources, R.drawable.restaurant22_menu3, null)
        val r231: Drawable? = ResourcesCompat.getDrawable(resources, R.drawable.restaurant23_menu1, null)
        val r232: Drawable? = ResourcesCompat.getDrawable(resources, R.drawable.restaurant23_menu2, null)
        val r233: Drawable? = ResourcesCompat.getDrawable(resources, R.drawable.restaurant23_menu3, null)
        val r241: Drawable? = ResourcesCompat.getDrawable(resources, R.drawable.restaurant24_menu1, null)
        val r242: Drawable? = ResourcesCompat.getDrawable(resources, R.drawable.restaurant24_menu2, null)
        val r243: Drawable? = ResourcesCompat.getDrawable(resources, R.drawable.restaurant24_menu3, null)
        val r251: Drawable? = ResourcesCompat.getDrawable(resources, R.drawable.restaurant_noimg, null)
        val r252: Drawable? = ResourcesCompat.getDrawable(resources, R.drawable.restaurant_noimg, null)
        val r253: Drawable? = ResourcesCompat.getDrawable(resources, R.drawable.restaurant_noimg, null)
        val r261: Drawable? = ResourcesCompat.getDrawable(resources, R.drawable.restaurant26_menu1, null)
        val r262: Drawable? = ResourcesCompat.getDrawable(resources, R.drawable.restaurant26_menu2, null)
        val r263: Drawable? = ResourcesCompat.getDrawable(resources, R.drawable.restaurant26_menu3, null)
        val r271: Drawable? = ResourcesCompat.getDrawable(resources, R.drawable.restaurant27_menu1, null)
        val r272: Drawable? = ResourcesCompat.getDrawable(resources, R.drawable.restaurant27_menu2, null)
        val r273: Drawable? = ResourcesCompat.getDrawable(resources, R.drawable.restaurant27_menu3, null)
        val r281: Drawable? = ResourcesCompat.getDrawable(resources, R.drawable.restaurant_noimg, null)
        val r282: Drawable? = ResourcesCompat.getDrawable(resources, R.drawable.restaurant_noimg, null)
        val r283: Drawable? = ResourcesCompat.getDrawable(resources, R.drawable.restaurant_noimg, null)
        val r291: Drawable? = ResourcesCompat.getDrawable(resources, R.drawable.restaurant29_menu1, null)
        val r292: Drawable? = ResourcesCompat.getDrawable(resources, R.drawable.restaurant29_menu2, null)
        val r293: Drawable? = ResourcesCompat.getDrawable(resources, R.drawable.restaurant29_menu3, null)
        val r301: Drawable? = ResourcesCompat.getDrawable(resources, R.drawable.restaurant_noimg, null)
        val r302: Drawable? = ResourcesCompat.getDrawable(resources, R.drawable.restaurant_noimg, null)
        val r303: Drawable? = ResourcesCompat.getDrawable(resources, R.drawable.restaurant_noimg, null)
        val r311: Drawable? = ResourcesCompat.getDrawable(resources, R.drawable.restaurant31_menu1, null)
        val r312: Drawable? = ResourcesCompat.getDrawable(resources, R.drawable.restaurant31_menu2, null)
        val r313: Drawable? = ResourcesCompat.getDrawable(resources, R.drawable.restaurant31_menu3, null)
        val r321: Drawable? = ResourcesCompat.getDrawable(resources, R.drawable.restaurant_noimg, null)
        val r322: Drawable? = ResourcesCompat.getDrawable(resources, R.drawable.restaurant_noimg, null)
        val r323: Drawable? = ResourcesCompat.getDrawable(resources, R.drawable.restaurant_noimg, null)
        val r331: Drawable? = ResourcesCompat.getDrawable(resources, R.drawable.restaurant33_menu1, null)
        val r332: Drawable? = ResourcesCompat.getDrawable(resources, R.drawable.restaurant33_menu2, null)
        val r333: Drawable? = ResourcesCompat.getDrawable(resources, R.drawable.restaurant33_menu3, null)
        val r341: Drawable? = ResourcesCompat.getDrawable(resources, R.drawable.restaurant34_menu1, null)
        val r342: Drawable? = ResourcesCompat.getDrawable(resources, R.drawable.restaurant34_menu2, null)
        val r343: Drawable? = ResourcesCompat.getDrawable(resources, R.drawable.restaurant34_menu3, null)
        val r351: Drawable? = ResourcesCompat.getDrawable(resources, R.drawable.restaurant_noimg, null)
        val r352: Drawable? = ResourcesCompat.getDrawable(resources, R.drawable.restaurant_noimg, null)
        val r353: Drawable? = ResourcesCompat.getDrawable(resources, R.drawable.restaurant_noimg, null)
        val r361: Drawable? = ResourcesCompat.getDrawable(resources, R.drawable.restaurant36_menu1, null)
        val r362: Drawable? = ResourcesCompat.getDrawable(resources, R.drawable.restaurant36_menu2, null)
        val r363: Drawable? = ResourcesCompat.getDrawable(resources, R.drawable.restaurant36_menu3, null)
        val r371: Drawable? = ResourcesCompat.getDrawable(resources, R.drawable.restaurant37_menu1, null)
        val r372: Drawable? = ResourcesCompat.getDrawable(resources, R.drawable.restaurant37_menu2, null)
        val r373: Drawable? = ResourcesCompat.getDrawable(resources, R.drawable.restaurant37_menu3, null)
        val r381: Drawable? = ResourcesCompat.getDrawable(resources, R.drawable.restaurant_noimg, null)
        val r382: Drawable? = ResourcesCompat.getDrawable(resources, R.drawable.restaurant_noimg, null)
        val r383: Drawable? = ResourcesCompat.getDrawable(resources, R.drawable.restaurant_noimg, null)
        val r391: Drawable? = ResourcesCompat.getDrawable(resources, R.drawable.restaurant39_menu1, null)
        val r392: Drawable? = ResourcesCompat.getDrawable(resources, R.drawable.restaurant39_menu2, null)
        val r393: Drawable? = ResourcesCompat.getDrawable(resources, R.drawable.restaurant39_menu3, null)
        val r401: Drawable? = ResourcesCompat.getDrawable(resources, R.drawable.restaurant40_menu1, null)
        val r402: Drawable? = ResourcesCompat.getDrawable(resources, R.drawable.restaurant40_menu2, null)
        val r403: Drawable? = ResourcesCompat.getDrawable(resources, R.drawable.restaurant40_menu3, null)
        val r411: Drawable? = ResourcesCompat.getDrawable(resources, R.drawable.restaurant_noimg, null)
        val r412: Drawable? = ResourcesCompat.getDrawable(resources, R.drawable.restaurant_noimg, null)
        val r413: Drawable? = ResourcesCompat.getDrawable(resources, R.drawable.restaurant_noimg, null)
        val r421: Drawable? = ResourcesCompat.getDrawable(resources, R.drawable.restaurant42_menu1, null)
        val r422: Drawable? = ResourcesCompat.getDrawable(resources, R.drawable.restaurant42_menu2, null)
        val r423: Drawable? = ResourcesCompat.getDrawable(resources, R.drawable.restaurant42_menu3, null)
        val r431: Drawable? = ResourcesCompat.getDrawable(resources, R.drawable.restaurant_noimg, null)
        val r432: Drawable? = ResourcesCompat.getDrawable(resources, R.drawable.restaurant_noimg, null)
        val r433: Drawable? = ResourcesCompat.getDrawable(resources, R.drawable.restaurant_noimg, null)
        val r441: Drawable? = ResourcesCompat.getDrawable(resources, R.drawable.restaurant44_menu1, null)
        val r442: Drawable? = ResourcesCompat.getDrawable(resources, R.drawable.restaurant44_menu2, null)
        val r443: Drawable? = ResourcesCompat.getDrawable(resources, R.drawable.restaurant44_menu3, null)
        val r451: Drawable? = ResourcesCompat.getDrawable(resources, R.drawable.restaurant45_menu1, null)
        val r452: Drawable? = ResourcesCompat.getDrawable(resources, R.drawable.restaurant_noimg, null)
        val r453: Drawable? = ResourcesCompat.getDrawable(resources, R.drawable.restaurant_noimg, null)
        val r461: Drawable? = ResourcesCompat.getDrawable(resources, R.drawable.restaurant46_menu1, null)
        val r462: Drawable? = ResourcesCompat.getDrawable(resources, R.drawable.restaurant46_menu2, null)
        val r463: Drawable? = ResourcesCompat.getDrawable(resources, R.drawable.restaurant46_menu3, null)
        val r471: Drawable? = ResourcesCompat.getDrawable(resources, R.drawable.restaurant47_menu1, null)
        val r472: Drawable? = ResourcesCompat.getDrawable(resources, R.drawable.restaurant47_menu2, null)
        val r473: Drawable? = ResourcesCompat.getDrawable(resources, R.drawable.restaurant47_menu3, null)
        val r481: Drawable? = ResourcesCompat.getDrawable(resources, R.drawable.restaurant48_menu1, null)
        val r482: Drawable? = ResourcesCompat.getDrawable(resources, R.drawable.restaurant48_menu2, null)
        val r483: Drawable? = ResourcesCompat.getDrawable(resources, R.drawable.restaurant48_menu3, null)
        val r491: Drawable? = ResourcesCompat.getDrawable(resources, R.drawable.restaurant_noimg, null)
        val r492: Drawable? = ResourcesCompat.getDrawable(resources, R.drawable.restaurant_noimg, null)
        val r493: Drawable? = ResourcesCompat.getDrawable(resources, R.drawable.restaurant_noimg, null)
        val r501: Drawable? = ResourcesCompat.getDrawable(resources, R.drawable.restaurant50_menu1, null)
        val r502: Drawable? = ResourcesCompat.getDrawable(resources, R.drawable.restaurant50_menu2, null)
        val r503: Drawable? = ResourcesCompat.getDrawable(resources, R.drawable.restaurant50_menu3, null)
        val r511: Drawable? = ResourcesCompat.getDrawable(resources, R.drawable.restaurant51_menu1, null)
        val r512: Drawable? = ResourcesCompat.getDrawable(resources, R.drawable.restaurant51_menu2, null)
        val r513: Drawable? = ResourcesCompat.getDrawable(resources, R.drawable.restaurant_noimg, null)
        val r521: Drawable? = ResourcesCompat.getDrawable(resources, R.drawable.restaurant52_menu1, null)
        val r522: Drawable? = ResourcesCompat.getDrawable(resources, R.drawable.restaurant_noimg, null)
        val r523: Drawable? = ResourcesCompat.getDrawable(resources, R.drawable.restaurant52_menu3, null)
        val r531: Drawable? = ResourcesCompat.getDrawable(resources, R.drawable.restaurant53_menu1, null)
        val r532: Drawable? = ResourcesCompat.getDrawable(resources, R.drawable.restaurant53_menu2, null)
        val r533: Drawable? = ResourcesCompat.getDrawable(resources, R.drawable.restaurant53_menu3, null)
        val r541: Drawable? = ResourcesCompat.getDrawable(resources, R.drawable.restaurant54_menu1, null)
        val r542: Drawable? = ResourcesCompat.getDrawable(resources, R.drawable.restaurant54_menu2, null)
        val r543: Drawable? = ResourcesCompat.getDrawable(resources, R.drawable.restaurant54_menu3, null)
        val r551: Drawable? = ResourcesCompat.getDrawable(resources, R.drawable.restaurant55_menu1, null)
        val r552: Drawable? = ResourcesCompat.getDrawable(resources, R.drawable.restaurant55_menu2, null)
        val r553: Drawable? = ResourcesCompat.getDrawable(resources, R.drawable.restaurant55_menu3, null)
        val r561: Drawable? = ResourcesCompat.getDrawable(resources, R.drawable.restaurant56_menu1, null)
        val r562: Drawable? = ResourcesCompat.getDrawable(resources, R.drawable.restaurant56_menu2, null)
        val r563: Drawable? = ResourcesCompat.getDrawable(resources, R.drawable.restaurant56_menu3, null)
        val r571: Drawable? = ResourcesCompat.getDrawable(resources, R.drawable.restaurant57_menu1, null)
        val r572: Drawable? = ResourcesCompat.getDrawable(resources, R.drawable.restaurant57_menu2, null)
        val r573: Drawable? = ResourcesCompat.getDrawable(resources, R.drawable.restaurant_noimg, null)
        val r581: Drawable? = ResourcesCompat.getDrawable(resources, R.drawable.restaurant58_menu1, null)
        val r582: Drawable? = ResourcesCompat.getDrawable(resources, R.drawable.restaurant58_menu2, null)
        val r583: Drawable? = ResourcesCompat.getDrawable(resources, R.drawable.restaurant58_menu3, null)
        val r591: Drawable? = ResourcesCompat.getDrawable(resources, R.drawable.restaurant59_menu1, null)
        val r592: Drawable? = ResourcesCompat.getDrawable(resources, R.drawable.restaurant59_menu2, null)
        val r593: Drawable? = ResourcesCompat.getDrawable(resources, R.drawable.restaurant59_menu3, null)
        val r601: Drawable? = ResourcesCompat.getDrawable(resources, R.drawable.restaurant60_menu1, null)
        val r602: Drawable? = ResourcesCompat.getDrawable(resources, R.drawable.restaurant60_menu2, null)
        val r603: Drawable? = ResourcesCompat.getDrawable(resources, R.drawable.restaurant60_menu3, null)
        val r611: Drawable? = ResourcesCompat.getDrawable(resources, R.drawable.restaurant61_menu1, null)
        val r612: Drawable? = ResourcesCompat.getDrawable(resources, R.drawable.restaurant61_menu2, null)
        val r613: Drawable? = ResourcesCompat.getDrawable(resources, R.drawable.restaurant61_menu3, null)
        val r621: Drawable? = ResourcesCompat.getDrawable(resources, R.drawable.restaurant62_menu1, null)
        val r622: Drawable? = ResourcesCompat.getDrawable(resources, R.drawable.restaurant62_menu2, null)
        val r623: Drawable? = ResourcesCompat.getDrawable(resources, R.drawable.restaurant62_menu3, null)
        val r631: Drawable? = ResourcesCompat.getDrawable(resources, R.drawable.restaurant63_menu1, null)
        val r632: Drawable? = ResourcesCompat.getDrawable(resources, R.drawable.restaurant63_menu2, null)
        val r633: Drawable? = ResourcesCompat.getDrawable(resources, R.drawable.restaurant63_menu3, null)
        val r641: Drawable? = ResourcesCompat.getDrawable(resources, R.drawable.restaurant64_menu1, null)
        val r642: Drawable? = ResourcesCompat.getDrawable(resources, R.drawable.restaurant64_menu2, null)
        val r643: Drawable? = ResourcesCompat.getDrawable(resources, R.drawable.restaurant64_menu3, null)
        val r651: Drawable? = ResourcesCompat.getDrawable(resources, R.drawable.restaurant65_menu1, null)
        val r652: Drawable? = ResourcesCompat.getDrawable(resources, R.drawable.restaurant65_menu2, null)
        val r653: Drawable? = ResourcesCompat.getDrawable(resources, R.drawable.restaurant65_menu3, null)
        val r661: Drawable? = ResourcesCompat.getDrawable(resources, R.drawable.restaurant66_menu1, null)
        val r662: Drawable? = ResourcesCompat.getDrawable(resources, R.drawable.restaurant66_menu2, null)
        val r663: Drawable? = ResourcesCompat.getDrawable(resources, R.drawable.restaurant66_menu3, null)
        val r671: Drawable? = ResourcesCompat.getDrawable(resources, R.drawable.restaurant67_menu1, null)
        val r672: Drawable? = ResourcesCompat.getDrawable(resources, R.drawable.restaurant67_menu2, null)
        val r673: Drawable? = ResourcesCompat.getDrawable(resources, R.drawable.restaurant67_menu3, null)
        val r681: Drawable? = ResourcesCompat.getDrawable(resources, R.drawable.restaurant68_menu1, null)
        val r682: Drawable? = ResourcesCompat.getDrawable(resources, R.drawable.restaurant68_menu2, null)
        val r683: Drawable? = ResourcesCompat.getDrawable(resources, R.drawable.restaurant68_menu3, null)
        val r691: Drawable? = ResourcesCompat.getDrawable(resources, R.drawable.restaurant69_menu1, null)
        val r692: Drawable? = ResourcesCompat.getDrawable(resources, R.drawable.restaurant69_menu2, null)
        val r693: Drawable? = ResourcesCompat.getDrawable(resources, R.drawable.restaurant69_menu3, null)
        val r701: Drawable? = ResourcesCompat.getDrawable(resources, R.drawable.restaurant_noimg, null)
        val r702: Drawable? = ResourcesCompat.getDrawable(resources, R.drawable.restaurant_noimg, null)
        val r703: Drawable? = ResourcesCompat.getDrawable(resources, R.drawable.restaurant_noimg, null)
        val r711: Drawable? = ResourcesCompat.getDrawable(resources, R.drawable.restaurant71_menu1, null)
        val r712: Drawable? = ResourcesCompat.getDrawable(resources, R.drawable.restaurant71_menu2, null)
        val r713: Drawable? = ResourcesCompat.getDrawable(resources, R.drawable.restaurant71_menu3, null)
        val r721: Drawable? = ResourcesCompat.getDrawable(resources, R.drawable.restaurant72_menu1, null)
        val r722: Drawable? = ResourcesCompat.getDrawable(resources, R.drawable.restaurant72_menu2, null)
        val r723: Drawable? = ResourcesCompat.getDrawable(resources, R.drawable.restaurant72_menu3, null)
        val r731: Drawable? = ResourcesCompat.getDrawable(resources, R.drawable.restaurant73_menu1, null)
        val r732: Drawable? = ResourcesCompat.getDrawable(resources, R.drawable.restaurant73_menu2, null)
        val r733: Drawable? = ResourcesCompat.getDrawable(resources, R.drawable.restaurant73_menu3, null)
        val r741: Drawable? = ResourcesCompat.getDrawable(resources, R.drawable.restaurant_noimg, null)
        val r742: Drawable? = ResourcesCompat.getDrawable(resources, R.drawable.restaurant_noimg, null)
        val r743: Drawable? = ResourcesCompat.getDrawable(resources, R.drawable.restaurant_noimg, null)


//        binding.menu1.setImageDrawable()

        val menuArray = arrayOf(
            arrayOf(r11,r12,r13),arrayOf(r21,r22,r23),arrayOf(r31,r32,r33),arrayOf(r41,r42,r43),arrayOf(r51,r52,r53),
            arrayOf(r61,r62,r63),arrayOf(r71,r72,r73),arrayOf(r81,r82,r83),arrayOf(r91,r92,r93),arrayOf(r101,r102,r103),
            arrayOf(r111,r112,r113),arrayOf(r121,r122,r123),arrayOf(r131,r132,r133),arrayOf(r141,r142,r143),arrayOf(r151,r152,r153),
            arrayOf(r161,r162,r163),arrayOf(r171,r172,r173),arrayOf(r181,r182,r183),arrayOf(r191,r192,r193),arrayOf(r201,r202,r203),
            arrayOf(r211,r212,r213),arrayOf(r221,r222,r223),arrayOf(r231,r232,r233),arrayOf(r241,r242,r243),arrayOf(r251,r252,r253),
            arrayOf(r261,r262,r263),arrayOf(r271,r272,r273),arrayOf(r281,r282,r283),arrayOf(r291,r292,r293),arrayOf(r301,r302,r303),
            arrayOf(r311,r312,r313),arrayOf(r321,r322,r323),arrayOf(r331,r332,r333),arrayOf(r341,r342,r343),arrayOf(r351,r352,r353),
            arrayOf(r361,r362,r363),arrayOf(r371,r372,r373),arrayOf(r381,r382,r383),arrayOf(r391,r392,r393),arrayOf(r401,r402,r403),
            arrayOf(r411,r412,r413),arrayOf(r421,r422,r423),arrayOf(r431,r432,r433),arrayOf(r441,r442,r443),arrayOf(r451,r452,r453),
            arrayOf(r461,r462,r463),arrayOf(r471,r472,r473),arrayOf(r481,r482,r483),arrayOf(r491,r492,r493),arrayOf(r501,r502,r503),
            arrayOf(r511,r512,r513),arrayOf(r521,r522,r523),arrayOf(r531,r532,r533),arrayOf(r541,r542,r543),arrayOf(r551,r552,r553),
            arrayOf(r561,r562,r563),arrayOf(r571,r572,r573),arrayOf(r581,r582,r583),arrayOf(r591,r592,r593),arrayOf(r601,r602,r603),
            arrayOf(r611,r612,r613),arrayOf(r621,r622,r623),arrayOf(r631,r632,r633),arrayOf(r641,r642,r643),arrayOf(r651,r652,r653),
            arrayOf(r661,r662,r663),arrayOf(r671,r672,r673),arrayOf(r681,r682,r683),arrayOf(r691,r692,r693),arrayOf(r701,r702,r703),
            arrayOf(r711,r712,r713),arrayOf(r721,r722,r723),arrayOf(r731,r732,r733),arrayOf(r741,r742,r743)
            )

        if(recommendLunch != null){
//            binding.tvTest.text = lunArray[0][0].toString()


        }

    }
}