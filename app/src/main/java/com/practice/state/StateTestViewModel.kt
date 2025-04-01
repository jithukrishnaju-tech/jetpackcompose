package com.practice.state

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class StateTestViewModel : ViewModel() {
    private var _name = MutableLiveData<String>()
    var name : LiveData<String> = _name

    fun updateName(newName: String) {
        _name.value = newName
    }
}