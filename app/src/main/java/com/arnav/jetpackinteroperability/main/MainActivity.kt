package com.arnav.jetpackinteroperability.main

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.arnav.jetpackinteroperability.main.FragmentToCompose.ReceipeListFragment
import com.arnav.jetpackinteroperability.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


    }
}