package com.example.escapeone

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.viewpager2.widget.ViewPager2
import kotlinx.android.synthetic.main.activity_one.*

class OneActivity : AppCompatActivity(){

    private val ctnts01: MutableList<String> = mutableListOf(
        "1지원 기간이 3일 남은 회사의 자기소개서를\n쓰다가 잠시 휴대전화를 보았다.\n\n익숙한 죄책감은\n웃긴 사진 3장 정도에 사라졌다.",
        "알림이 떴다. \n내가 다운로드하지 않았던 어플의 알림이다.",
        "알림을 누를까 말까 하다가 \n일단 무시하고 계속 보기로 했다.",
        "두 번째 알람이 떴다. \n내가 알림을 보길 기다리는 걸까?",
        "badending휴대전화가 뜨거워지고 내 눈도 뜨겁다."
    ) // 0 - 4

    private val noti01: MutableList<String> = mutableListOf(
        "",
        "새로운 어플을 맞이해봐요!",
        "",
        "이 어플이 궁금하지 않으세요?",
        ""
    ) // ctnts 배열의 인덱스를 앞에 적어둠

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_one)

        viewpager01.adapter = ViewPager2Adapter(applicationContext,ctnts01,noti01)
        viewpager01.orientation = ViewPager2.ORIENTATION_VERTICAL
    }
}