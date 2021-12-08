package com.snowbear.everytime

import android.os.Bundle
import android.os.CountDownTimer
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val but_start = findViewById<Button>(R.id.but_start)
        val but_end = findViewById<Button>(R.id.but_end)
        val tV_start_time = findViewById<TextView>(R.id.tV_time)
        val tV_cate_time = findViewById<TextView>(R.id.tV_time2)

        but_start.setOnClickListener {
            time_30(tV_start_time)
        }
    }

    fun time_30(tV: TextView) {
        object : CountDownTimer(10000, 1000) {
            override fun onTick(mills: Long) {
                val text = "Second: "
                tV.setText((mills/1000).toString())
            }

            override fun onFinish() {
                tV.setText("Finish")
            }
        }.start()
    }
}