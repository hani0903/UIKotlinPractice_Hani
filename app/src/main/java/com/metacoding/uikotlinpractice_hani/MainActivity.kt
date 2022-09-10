package com.metacoding.uikotlinpractice_hani

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //버튼이 눌린 경우 이벤트 달아주기
        okBtn.setOnClickListener {

            //실행할 이벤트
            //1. 입력된 내용을 변수에 저장하기(get)
            val inputContent = contentEdt.text.toString()//string으로 변환 후 저장

            //2. 저장해둔 입력값을 => 텍스트뷰의 내용으로 반영(set)
            resultTxt.text = inputContent

        }


    }
