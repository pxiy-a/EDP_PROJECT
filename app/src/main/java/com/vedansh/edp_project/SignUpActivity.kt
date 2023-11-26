package com.vedansh.edp_project

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import com.google.firebase.auth.FirebaseAuth


class SignUpActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up)
        val email : EditText = findViewById(R.id.EmailId)
        val Password : EditText = findViewById(R.id.Password)
        val ConfirmPassword : EditText = findViewById(R.id.ConfirmPassword)
        val SignUpButton : Button = findViewById(R.id.SignUpButton)
        val auth = FirebaseAuth.getInstance()
        SignUpButton.setOnClickListener { 
            val emailText = email.text.toString()
            val passwordText = Password.text.toString()
            val confirmPasswordText = ConfirmPassword.text.toString()



        }

    }
}