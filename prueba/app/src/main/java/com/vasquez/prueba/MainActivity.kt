package com.vasquez.prueba

import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    private  lateinit var previus : Button
    private lateinit var next: Button
    private lateinit var tower_one: ImageView
    private lateinit var tower_two: ImageView
    private lateinit var tower_three: ImageView
    private lateinit var small_one: ImageView
    private lateinit var small_two: ImageView
    private lateinit var small_three: ImageView
    private lateinit var medium_one: ImageView
    private lateinit var medium_two: ImageView
    private lateinit var medium_three: ImageView
    private lateinit var big_one: ImageView
    private lateinit var big_two: ImageView
    private lateinit var big_three: ImageView
    var helper: Int = 0
    var aux: Boolean = true



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        create()
        addListeners()
    }

    private fun create(){
        previus = findViewById(R.id.previus)
        next = findViewById(R.id.next)
        tower_one = findViewById(R.id.first_tower)
        tower_two = findViewById(R.id.second_tower)
        tower_three = findViewById(R.id.third_tower)
        small_one = findViewById(R.id.first_small)
        medium_one = findViewById(R.id.first_medium)
        big_one = findViewById(R.id.first_big)
        small_two = findViewById(R.id.second_small)
        medium_two = findViewById(R.id.second_medium)
        big_two = findViewById(R.id.second_big)
        small_three = findViewById(R.id.third_small)
        medium_three = findViewById(R.id.third_medium)
        big_three = findViewById(R.id.third_big)

    }
    private fun addListeners(){
        next.setOnClickListener {
            helper++
            if (helper ==1){
                small_one.visibility = View.INVISIBLE
                small_three.visibility = View.VISIBLE
            }
            else if (helper == 2){
                medium_one.visibility = View.INVISIBLE
                medium_two.visibility = View.VISIBLE
            }
            else if(helper == 3){
                small_three.visibility = View.INVISIBLE
                small_two.visibility = View.VISIBLE
            }
            else if(helper == 4){
                big_one.visibility = View.INVISIBLE
                big_three.visibility = View.VISIBLE
            }
        }
    }


}