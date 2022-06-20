package com.example.pr10

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.view.View.inflate
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.res.ColorStateListInflaterCompat.inflate
import androidx.core.content.res.ComplexColorCompat.inflate

class MainActivity2(var bindingClass: Any) : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bindingClass = ActivityMainBinding.inflate (layoutInflater)
        setContentView(R.layout.activity_main2)
    }
    fun onClickBrowserActivity(view: View){
        val intent = Intent(this, BrowserActivity::class.java)
        startActivity(intent)
    }
}