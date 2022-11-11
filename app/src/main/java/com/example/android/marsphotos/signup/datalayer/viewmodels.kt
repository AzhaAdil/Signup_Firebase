package com.example.android.marsphotos.signup.datalayer
import android.content.Context
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.android.marsphotos.signup.presentation.Repository
import kotlinx.coroutines.launch
class viewmodels:ViewModel(){
  private var repository: Repository
    init {
        repository= Repository()
    }
    fun Singup(username:String,fullname:String,email:String,password:String)=viewModelScope.launch {

        repository.Signup(username,fullname,email,password) }
    fun g()=repository.log()
}