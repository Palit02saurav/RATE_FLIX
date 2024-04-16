package com.example.rate_fix.ui.recentlyreleased

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class RecentlyreleasedViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is recently released Fragment"
    }
    val text: LiveData<String> = _text
}
