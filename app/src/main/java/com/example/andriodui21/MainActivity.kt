package com.example.andriodui21

import android.os.Binder
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.inputmethod.InputBinding
import com.example.andriodui21.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
 lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)

        setContentView(binding.root)

        // TODO how to replace the fragement

        val firstFragement  = FiirstFragement()
        val secondFragement = SecondFeagement()

        // How to change the fragement

        binding.btnFragemet1.setOnClickListener {
            supportFragmentManager.beginTransaction().apply {
                replace(R.id.btnFragemet1  , firstFragement)
                addToBackStack(null)
                commit()
            }
        }
        binding.btnFragemet2.setOnClickListener {
            supportFragmentManager.beginTransaction().apply {
                replace(R.id.btnFragemet2  , secondFragement)
                addToBackStack(null)
                commit()
            }
        }








    }
}