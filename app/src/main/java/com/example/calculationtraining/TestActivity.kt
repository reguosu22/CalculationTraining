package com.example.calculationtraining

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_test.*
import kotlin.random.Random


//Todo こたえあわせ処理（answerCheckメソッド）

//Todo 戻るボタンが押されたら

class TestActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_test)

        //Todo テスト画面が開いたら
        val bundle =intent.extras
        val numberOfQuestion: Int=bundle.getInt("numberOfQuestion")
        textViewRemaining.text=numberOfQuestion.toString()

        //Todo 「こたえ合わせ」ボタンが押されたら
        buttonAnswerCheck.setOnClickListener {
            //Todo こたえあわせ処理（answerCheckメソッド）
            answerCheck()
        }

        //Todo 戻るボタンが押されたら
        buttonBack.setOnClickListener {  }

        //Todo 電卓ボタンが押されたら
        button0.setOnClickListener(this)
        button1.setOnClickListener(this)
        button2.setOnClickListener(this)
        button3.setOnClickListener (this)
        button4.setOnClickListener(this)
        button5.setOnClickListener(this)
        button6.setOnClickListener(this)
        button7.setOnClickListener(this)
        button8.setOnClickListener(this)
        button9.setOnClickListener(this)
        buttonMinus.setOnClickListener(this)
        buttonClear.setOnClickListener(this)
        question()
    }

    //Todo 問題が出されたら（questionメソッド
    private fun question() {
        //戻るボタン使用不可
        buttonBack.isEnabled=false
        //電卓ボタン使用可能
        buttonAnswerCheck.isEnabled=true
        button0.isEnabled=true
        button1.isEnabled=true
        button2.isEnabled=true
        button3.isEnabled=true
        button4.isEnabled=true
        button5.isEnabled=true
        button6.isEnabled=true
        button7.isEnabled=true
        button8.isEnabled=true
        button9.isEnabled=true
        buttonMinus.isEnabled=true
        buttonClear.isEnabled=true

        //2つの数字からランダムに設定して表示
        val random= Random()
        val intQuestionLeft=random.nextInt(100)+1
        val intQuestionRight=random.nextInt(100)+1
        textViewLeft.text=intQuestionLeft.toString()
        textViewRight.text=intQuestionRight.toString()
        //計算法方法を＋－からランダムで設定して表示
        when(random.nextInt(2)+1){
            1->textViewOperator.text="+"
            2->textViewOperator.text="-"
        }
        //前の問題で入力した自分の答えを消す
        textViewAnswer.text=""

        imageView.visibility=View.INVISIBLE

    }

    //Todo 「こたえ合わせ」ボタンが押されたら
    private fun answerCheck() {
        TODO("Not yet implemented")
    }

    //Todo 電卓ボタンが押されたら
    override fun onClick(v: View?) {
        TODO("Not yet implemented")
    }

}