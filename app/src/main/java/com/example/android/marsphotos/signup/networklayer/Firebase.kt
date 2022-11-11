package com.example.android.marsphotos.signup.networklayer

import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.database.FirebaseDatabase

class Firebase {
   private val auth:FirebaseAuth by lazy{ FirebaseAuth.getInstance() }
    private val storage:FirebaseDatabase by lazy { FirebaseDatabase.getInstance() }
     fun SignUp(username:String,Fullname:String,email:String,password:String)
    {
auth.createUserWithEmailAndPassword(email,password).addOnCompleteListener {
    if(it.isSuccessful)
    {
       val database= storage.reference.child("user")
        val map=HashMap<String,Any>()
        map["username"]=username
        map["fullname"]=Fullname
        map["email"]=email
        database.child(currentUser()!!.uid).setValue(map).addOnCompleteListener {
            if(it.isSuccessful)
            {

            }
            else{

            }

        }

    }
}
    }

    fun logout() = auth.signOut()
 private   fun currentUser() = auth.currentUser

}