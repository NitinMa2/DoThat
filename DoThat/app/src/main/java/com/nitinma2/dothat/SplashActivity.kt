package com.nitinma2.dothat

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class SplashActivity : AppCompatActivity() {

    val PREFS_FILENAME = "com.nitinma2.dothat"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        val prefs = this.getSharedPreferences(PREFS_FILENAME, Context.MODE_PRIVATE)

        val background = object : Thread(){
            override fun run() {
                try {
                    Thread.sleep(1500);

                    if (prefs.getString("name", "") == ""){
                        val intent = Intent(baseContext, NewUserActivity::class.java);
                        startActivity(intent);
                    }
                    else{
                        val intent = Intent(baseContext, MainActivity::class.java);
                        startActivity(intent);
                    }
                }
                catch (e: Exception){
                    e.printStackTrace();
                }
            }
        }
        background.start();
    }
}
