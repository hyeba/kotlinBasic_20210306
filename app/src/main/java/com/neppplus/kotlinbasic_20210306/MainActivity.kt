package com.neppplus.kotlinbasic_20210306

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        toastBtn.setOnClickListener {
            Toast.makeText(this, "토스트 띄우기 연습", Toast.LENGTH_SHORT).show()

        }

        testBtn2.setOnClickListener {

            Log.e("메인화면로그", "테스트2 눌림")
        }

        testBtn1.setOnClickListener {

//            Ctrl + / : 코드에 메모 남기기(주석)

//            이 중괄호 안에 적는 코드가, testBtn1이 눌렸을 때 실행해줄 일

            Log.d("태그 종류", "테스트1 버튼 눌림")


        }
    }
}