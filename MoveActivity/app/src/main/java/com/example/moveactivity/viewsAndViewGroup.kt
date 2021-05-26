package com.example.moveactivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class viewsAndViewGroup : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_views_and_view_group)

        supportActionBar?.title = "Google Pixel"
    }
}