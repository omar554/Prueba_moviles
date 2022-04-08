package com.vasquez.appfragment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val fragmentManage = supportFragmentManager
        val fragmenTransaction = fragmentManage.beginTransaction()

        val fragment = GreetingFragment()

        fragmenTransaction
            .add(R.id.framelayout_fragment, fragment)
            .commit()

    }
}