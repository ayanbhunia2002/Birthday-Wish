package com.example.birthdaywish

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        createBirthdayButton.setOnClickListener {
           /* val name = userName.editableText.toString()
            Toast.makeText(this, "Name was $name", Toast.LENGTH_LONG).show()
           */

            val name = userName.editableText.toString()
            val intent = Intent(this,Birthday_Greeting::class.java)
            intent.putExtra(Birthday_Greeting.NAME_EXTRA, name)
            startActivity(intent)
        }

    }

}