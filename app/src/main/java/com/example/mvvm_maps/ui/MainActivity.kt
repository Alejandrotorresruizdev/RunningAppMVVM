package com.example.mvvm_maps.ui

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.mvvm_maps.db.RunDao
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject
import com.example.mvvm_maps.R

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var runDao : RunDao

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}