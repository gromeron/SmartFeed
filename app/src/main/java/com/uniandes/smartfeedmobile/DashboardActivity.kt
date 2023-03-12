package com.uniandes.smartfeedmobile

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class DashboardActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dashboard)
    }

    fun goToMonitor1Activity(view: View?) {
        val intent = Intent(this, Monitor1Activity::class.java)
        startActivity(intent)
    }

    fun goToMonitor2Activity(view: View?) {
        val intent = Intent(this, Monitor2Activity::class.java)
        startActivity(intent)
    }

    fun goToMonitor3Activity(view: View?) {
        val intent = Intent(this, Monitor3Activity::class.java)
        startActivity(intent)
    }

    fun goToMainActivity(view: View?) {
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
    }
}