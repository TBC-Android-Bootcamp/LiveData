package com.example.livedatahomework

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import java.util.logging.Handler

class MainViewModel: ViewModel() {

    val progressBarVisible = MutableLiveData<Boolean>()
    val result = MutableLiveData<String>()

    fun logIn(email: String, password: String){
        progressBarVisible.value = true
        android.os.Handler().postDelayed({
            progressBarVisible.value = false
            if(email.isNotEmpty() && password.isNotEmpty())
                result.value = "Success"
            else
                result.value = "Failure"
        }, 3000)
    }
}