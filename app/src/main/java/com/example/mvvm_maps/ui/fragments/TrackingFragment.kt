package com.example.mvvm_maps.ui.fragments

import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.example.mvvm_maps.R
import com.example.mvvm_maps.ui.viewmodels.MainViewModel
import com.example.mvvm_maps.ui.viewmodels.StatisticsViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class TrackingFragment : Fragment(R.layout.fragment_tracking){

    private val viewModel : MainViewModel by viewModels()

}