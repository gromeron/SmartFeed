package com.uniandes.smartfeedmobile

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MascotaRegisterActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mascota_register)
    }

    fun goToProductRegisterActivity(view: View?) {
        val intent = Intent(this, ProductRegisterActivity::class.java)
        startActivity(intent)
    }
}