package com.alex.newkotlingproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.databinding.DataBindingUtil
import com.alex.newkotlingproject.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private var binding:ActivityMainBinding? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        //binding = ActivityMainBinding.inflate(layoutInflater)
        //setContentView(binding?.root)

        supportFragmentManager.beginTransaction().replace(R.id.frame, Catalog()).commit()
        binding?.?.setOnClickListener()

        //binding?.button?.setOnClickListener(View.OnClickListener { binding?.meetPeter. } }})
    }
}