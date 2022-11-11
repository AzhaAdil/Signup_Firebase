package com.example.android.marsphotos.signup

import android.app.Application
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

import androidx.lifecycle.ViewModelProvider
import com.example.android.marsphotos.signup.datalayer.viewmodels

class MainActivity : AppCompatActivity() {
    lateinit var viewmodel: viewmodels
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        viewmodel= ViewModelProvider(this).get(viewmodels::class.java)



    val submit:Button=findViewById(R.id.submit)
        submit.setOnClickListener {
            val username=findViewById<EditText>(R.id.username).text.toString()
            val fullname=findViewById<EditText>(R.id.fullname).text.toString()
            val email=findViewById<EditText>(R.id.email).text.toString()
            val password=findViewById<EditText>(R.id.password).text.toString()
        when{
            TextUtils.isEmpty(username)->Toast.makeText(this,"empty username",Toast.LENGTH_SHORT).show()
            TextUtils.isEmpty(fullname)->Toast.makeText(this,"empty fulname",Toast.LENGTH_SHORT).show()
            TextUtils.isEmpty(email)->Toast.makeText(this,"empty email",Toast.LENGTH_SHORT).show()
            TextUtils.isEmpty(password)->Toast.makeText(this,"empty password",Toast.LENGTH_SHORT).show()

            else->{

                viewmodel.Singup(username,fullname,email,password)
                Toast.makeText(this,"sucess",Toast.LENGTH_SHORT).show()
                }
            }


        }




    }
}