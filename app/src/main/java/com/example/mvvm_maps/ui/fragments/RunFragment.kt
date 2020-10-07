package com.example.mvvm_maps.ui.fragments

import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.example.mvvm_maps.R
import com.example.mvvm_maps.ui.viewmodels.MainViewModel
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class RunFragment : Fragment(R.layout.fragment_run){

    private val viewModel : MainViewModel by viewModels()
}