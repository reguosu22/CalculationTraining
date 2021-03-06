package com.example.calculationtraining

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


//        val arrayAdapter=ArrayAdapter<int>(this,android.R.layout.simple_spinner_item)
//        arrayAdapter.add(10)
//        arrayAdapter.add(20)
//        arrayAdapter.add(30)
//        button.setOnClickListener {  }
        val arrayAdapter=ArrayAdapter.createFromResource(this,R.array.number_of_question,android.R.layout.simple_spinner_item)

        spinner.adapter=arrayAdapter

        button.setOnClickListener {
            //選択したアイテムをゲット
            val numberOfQuestion:Int=spinner.selectedItem.toString().toInt()

            val intent= Intent(this@MainActivity,TestActivity::class.java)
            intent.putExtra("numberOfQuestion",numberOfQuestion)
            startActivity(intent)
        }

    }
}

