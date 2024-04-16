package com.example.rate_fix.ui.toprated

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class TopratedViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is Top Rated Fragment"
    }
    val text: LiveData<String> = _text
}