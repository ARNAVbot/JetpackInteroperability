package com.arnav.jetpackinteroperability.FragmentToCompose

import ViewToCopose.ReceipeList2Fragment
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.arnav.jetpackinteroperability.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        /**
         * To see how to convert an exisitng fragment into a compose , use the following fragment
         */
        supportFragmentManager.beginTransaction()
            .replace(R.id.main_container, ReceipeListFragment())
            .commit()

        /**
         * To see how to use a custom view as a composeView (inside an exisitng fragment),
         * use the following fragment
         */
//        supportFragmentManager.beginTransaction()
//            .replace(R.id.main_container, ReceipeList2Fragment())
//            .commit()
    }
}