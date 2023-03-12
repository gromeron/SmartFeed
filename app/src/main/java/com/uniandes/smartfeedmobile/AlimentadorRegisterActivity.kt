package com.uniandes.smartfeedmobile

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ArrayAdapter
import android.widget.AutoCompleteTextView
import androidx.appcompat.app.AlertDialog
import com.google.android.material.textfield.TextInputEditText

class AlimentadorRegisterActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_alimentador_register)

        val opciones = arrayOf("Standard", "Pro", "Luxury")
        val adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, opciones)
        val modeloTextInputEditText = findViewById<TextInputEditText>(R.id.modeloTextInputEditText)
        modeloTextInputEditText.setOnClickListener {
            showDropDownMenu(modeloTextInputEditText, opciones)
        }
        val modeloAutoCompleteTextView = modeloTextInputEditText as? AutoCompleteTextView
        modeloAutoCompleteTextView?.setAdapter(adapter)
    }

    private fun showDropDownMenu(textInputEditText: TextInputEditText, opciones: Array<String>) {
        val builder = AlertDialog.Builder(this)
        builder.setItems(opciones) { _, which ->
            textInputEditText.setText(opciones[which])
        }
        val dialog = builder.create()
        dialog.show()
    }

    fun goToProductRegisterActivity(view: View?) {
        val intent = Intent(this, ProductRegisterActivity::class.java)
        startActivity(intent)
    }
}