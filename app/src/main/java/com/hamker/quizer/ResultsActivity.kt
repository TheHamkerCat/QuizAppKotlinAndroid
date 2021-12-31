package com.hamker.quizer

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import kotlinx.android.synthetic.main.activity_results.*


class ResultsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_results)

        // Set name on result page
        tvNameResult.text = "Congratulations $name"
        tvScore.text = "Your score is $score/${getQuestions().size}"

        btnFinish.setOnClickListener {
            // Reset the score when the game finishes
            score = 0

            // Go to homepage
            startActivity(
                Intent(
                    this,
                    MainActivity::class.java,
                )
            )

        }

    }
}
