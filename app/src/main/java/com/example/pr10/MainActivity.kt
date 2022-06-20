package com.example.pr10

import android.os.Bundle
import android.view.View.inflate
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.resources.Compatibility.Api21Impl.inflate
import androidx.core.content.res.ColorStateListInflaterCompat.inflate
import androidx.core.content.res.ComplexColorCompat.inflate
import androidx.core.graphics.drawable.DrawableCompat.inflate

class MainActivity : AppCompatActivity() {
lateinit var bindingClass: ActivityMainBinding
override fun onCreate (savedInstanceState: Bundle? ){
    super.onCreate(savedInstanceState)
    bindingClass = ActivityMainBinding.inflate (layoutInflater)
setContentView(bindingClass.root)
}
}

