package com.pawelsobaszek.a7minuteworkout

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_finish.*
import java.text.SimpleDateFormat
import java.util.*
import kotlin.collections.ArrayList

class FinishActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_finish)

        setSupportActionBar(toolbar_finish_activity)
        val actionbar = supportActionBar
        if (actionbar != null) {
            actionbar.setDisplayHomeAsUpEnabled(true)
        }

        toolbar_finish_activity.setNavigationOnClickListener {
            onBackPressed()
        }

        btnFinish.setOnClickListener {
            finish()
        }
        addDateToDatabase()
    }

    private fun addDateToDatabase() {
        val calendar = Calendar.getInstance()
        val dateTime = calendar.time
        Log.i("DATE", "" + dateTime)

        val sdf = SimpleDateFormat("dd MM yyyy HH:mm:ss", Locale.getDefault())
        val date = sdf.format(dateTime)

        val dbHandler = SqlliteOpenHelper(this, null)
        dbHandler.addDate(date)
        Log.i("DATE: ", "Added")
    }

}