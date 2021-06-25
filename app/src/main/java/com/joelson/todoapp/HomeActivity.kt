package com.joelson.todoapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.joelson.todoapp.activities.ProfileActivity

class HomeActivity : AppCompatActivity() {

    private lateinit var userNameDisplay: TextView
    private lateinit var profileButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        userNameDisplay = findViewById(R.id.userNameDisplay)
        profileButton = findViewById(R.id.profileButton)

        userNameDisplay.text = "welcome, ${intent.getStringExtra("")}"
        profileButton.setOnClickListener {
            openProfilePage()
        }
    }

    private fun openProfilePage (){
        val myIntent = Intent (this, ProfileActivity::class.java)
        startActivity(myIntent)
    }
}