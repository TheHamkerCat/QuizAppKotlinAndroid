package com.hamker.quizer

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import kotlinx.android.synthetic.main.activity_main.*

var name = ""

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnStartQuiz.setOnClickListener {
            if (tvName.text.toString().isEmpty()) {
                tvNameParent.error = "Please provide a name"
            } else {
                name = tvName.text.toString()
                startActivity(
                    Intent(
                        this,
                        QuestionsActivity::class.java,
                    )
                )
            }
        }
    }
}