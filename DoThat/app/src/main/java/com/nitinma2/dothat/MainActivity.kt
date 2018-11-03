package com.nitinma2.dothat

import android.content.Context
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.design.widget.FloatingActionButton
import android.widget.TextView
import android.widget.Toast
import com.github.clans.fab.FloatingActionMenu

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val floatingActionMenu = findViewById<FloatingActionMenu>(R.id.menu)
        val visual = findViewById<com.github.clans.fab.FloatingActionButton>(R.id.menu_item_visual)
        val timed = findViewById<com.github.clans.fab.FloatingActionButton>(R.id.menu_item_timed)
        val note = findViewById<com.github.clans.fab.FloatingActionButton>(R.id.menu_item_note)
        val list = findViewById<com.github.clans.fab.FloatingActionButton>(R.id.menu_item_list)

        visual.setOnClickListener { v ->
            Toast.makeText(this, "Visual Clicked", Toast.LENGTH_SHORT).show()
        }

        timed.setOnClickListener { v ->
            Toast.makeText(this, "Timed Clicked", Toast.LENGTH_SHORT).show()
        }

        note.setOnClickListener { v ->
            Toast.makeText(this, "Note Clicked", Toast.LENGTH_SHORT).show()
        }

        list.setOnClickListener { v ->
            Toast.makeText(this, "List Clicked", Toast.LENGTH_SHORT).show()
        }

    }

}
