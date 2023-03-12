package com.uniandes.smartfeedmobile

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class Monitor3Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_monitor3)
    }

    fun goToAlimentadorRegisterActivity(view: View?) {
        val intent = Intent(this, AlimentadorRegisterActivity::class.java)
        startActivity(intent)
    }

    fun goToDashboardActivity(view: View?) {
        val intent = Intent(this, DashboardActivity::class.java)
        startActivity(intent)
    }
}