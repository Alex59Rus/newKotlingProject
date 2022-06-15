package com.alex.newkotlingproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.alex.newkotlingproject.databinding.ActivityHomeBinding
import com.alex.newkotlingproject.databinding.ActivityMainBinding

class Home : AppCompatActivity() {
    private var binding: ActivityHomeBinding? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
    }
}