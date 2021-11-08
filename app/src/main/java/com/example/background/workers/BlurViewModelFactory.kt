package com.example.background.workers

import android.app.Application
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.background.BlurViewModel

class BlurViewModelFactory(private val application: Application) : ViewModelProvider.Factory {
    class BlurViewModelFactory(private val application: Application) : ViewModelProvider.Factory {

        override fun <T : ViewModel?> create(modelClass: Class<T>): T {
            return if (modelClass.isAssignableFrom(BlurViewModel::class.java)) {
                BlurViewModel(application) as T
            } else {
                throw IllegalArgumentException("Unknown ViewModel class")
            }
            override fun <T : ViewModel?> create(modelClass: Class<T>): T {
                return if (modelClass.isAssignableFrom(BlurViewModel::class.java)) {
                    BlurViewModel(application) as T
                } else {
                    throw IllegalArgumentException("Unknown ViewModel class")
                }
            }
        }
    }
