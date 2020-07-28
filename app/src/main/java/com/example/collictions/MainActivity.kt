package com.example.collictions

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var massive = arrayOf<Int>(4 , 45, 234, 234, 23)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initViews()
        initShowFirst()

        btnGo.setOnClickListener {
            initClick()
        }
    }

    private fun initViews(){
        val etFirst = findViewById<EditText>(R.id.etFirst)
        val etSecond = findViewById<EditText>(R.id.etSecond)
        val etThird = findViewById<EditText>(R.id.etThird)
        val etFourth = findViewById<EditText>(R.id.etFourth)
        val etFifth = findViewById<EditText>(R.id.etFifth)

        val tvFirst = findViewById<TextView>(R.id.tvFirst)
        val tvSecond = findViewById<TextView>(R.id.tvSecond)
        val tvThird = findViewById<TextView>(R.id.tvThird)
        val tvFourth = findViewById<TextView>(R.id.tvFourth)
        val tvFifth = findViewById<TextView>(R.id.tvFifth)

        val btnGo = findViewById<Button>(R.id.btnGo)
    }

    private fun initShowFirst(){
        etFirst.setText(massive[0].toString())
        etSecond.setText(massive[1].toString())
        etThird.setText(massive[2].toString())
        etFourth.setText(massive[3].toString())
        etFifth.setText(massive[4].toString())

        tvFirst.text = (massive[0]*2*3.14159).toString()
        tvSecond.text = (massive[1]*2*3.14159).toString()
        tvThird.text = (massive[2]*2*3.14159).toString()
        tvFourth.text = (massive[3]*2*3.14159).toString()
        tvFifth.text = (massive[4]*2*3.14159).toString()
    }

    private fun initClick() {
        massive[0]=etFirst.text.toString().toInt()
        tvFirst.text = (massive[0]*2*3.14159).toString()

        massive[1]=etSecond.text.toString().toInt()
        tvSecond.text = (massive[1]*2*3.14159).toString()

        massive[2]=etThird.text.toString().toInt()
        tvThird.text = (massive[2]*2*3.14159).toString()

        massive[3]=etFourth.text.toString().toInt()
        tvFourth.text = (massive[3]*2*3.14159).toString()

        massive[4]=etFifth.text.toString().toInt()
        tvFifth.text = (massive[4]*2*3.14159).toString()

        etFirst.setText(massive[0].toString())
        etSecond.setText(massive[1].toString())
        etThird.setText(massive[2].toString())
        etFourth.setText(massive[3].toString())
        etFifth.setText(massive[4].toString())
    }
}