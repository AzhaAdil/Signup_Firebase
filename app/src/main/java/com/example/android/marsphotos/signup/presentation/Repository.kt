package com.example.android.marsphotos.signup.presentation
import com.example.android.marsphotos.signup.networklayer.Firebase

class Repository() {
    private var firebase: Firebase
    init {
        firebase= Firebase()

    }
    fun log()=firebase.logout()
  fun Signup(username:String,fullname:String, email:String,password:String){
  return firebase.SignUp(username,fullname,email,password)
   }
}