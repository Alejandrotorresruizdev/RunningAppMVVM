package com.example.mvvm_maps.ui.fragments

import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.example.mvvm_maps.R
import com.example.mvvm_maps.ui.viewmodels.MainViewModel
import com.example.mvvm_maps.ui.viewmodels.StatisticsViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class StatisticsFragment : Fragment(R.layout.fragment_statistics){

    private val viewModel : StatisticsViewModel by viewModels()

}