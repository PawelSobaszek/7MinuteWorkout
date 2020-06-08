package com.pawelsobaszek.a7minuteworkout

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_exercise.*

class ExerciseActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_exercise)

        setSupportActionBar(toolbar_exercise_activity)
        val actionbar = supportActionBar
        if (actionbar != null) {
            actionbar.setDisplayHomeAsUpEnabled(true)
        }

        toolbar_exercise_activity.setNavigationOnClickListener {
            onBackPressed()

        }

    }
}