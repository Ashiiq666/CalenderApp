package com.ak.calenderapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.ak.calenderapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private var binding:ActivityMainBinding?=null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding?.root)
        init()
    }
    private fun init(){
        binding?.calendar?.setOnDateChangeListener{view,year,month,dayofMonth->
            val message="Selected date :"+dayofMonth+ "/"+(month+1)+"/"+year
            Toast.makeText(this@MainActivity,message,Toast.LENGTH_LONG).show()
            binding?.tvContent?.setText("Selected date :"+dayofMonth+ "/"+(month+1)+"/"+year)
            
        }
    }
}