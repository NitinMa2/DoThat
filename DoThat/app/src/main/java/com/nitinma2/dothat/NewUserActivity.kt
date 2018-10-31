package com.nitinma2.dothat

import android.os.Bundle
import android.app.Activity
import android.content.Context
import android.content.Intent
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

import kotlinx.android.synthetic.main.activity_new_user.*



class NewUserActivity : Activity() {

    val PREFS_FILENAME = "com.nitinma2.dothat"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_new_user)

        val name = findViewById<EditText>(R.id.nameEditText)
        val button = findViewById<Button>(R.id.button)
        val prefs = this.getSharedPreferences(PREFS_FILENAME, Context.MODE_PRIVATE)

        button.setOnClickListener {
            if(name.text.isEmpty()){
                Toast.makeText(this, "Please enter your name", Toast.LENGTH_SHORT).show()
            }else {
                val editor = prefs.edit()
                editor.putString("name", name.text.toString())
                editor.apply()
                val intent = Intent(baseContext, MainActivity::class.java);
                startActivity(intent);
                finish()
            }
        }

    }
}
