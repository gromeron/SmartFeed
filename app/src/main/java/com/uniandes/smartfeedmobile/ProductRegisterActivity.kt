package com.uniandes.smartfeedmobile

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class ProductRegisterActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_product_register)
    }

    fun goToMascotaRegisterActivity(view: View?) {
        val intent_1 = Intent(this, MascotaRegisterActivity::class.java)
        startActivity(intent_1)
    }

    fun goToAlimentadorRegisterActivity(view: View?) {
        val intent_2 = Intent(this, AlimentadorRegisterActivity::class.java)
        startActivity(intent_2)
    }

    fun goToDashboardActivity(view: View?) {
        val intent_3 = Intent(this, DashboardActivity::class.java)
        startActivity(intent_3)
    }
}