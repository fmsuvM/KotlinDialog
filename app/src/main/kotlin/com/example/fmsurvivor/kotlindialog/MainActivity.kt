package com.example.fmsurvivor.kotlindialog

import android.app.AlertDialog
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity(), View.OnClickListener {

    private var dialog_button: Button? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        dialog_button = findViewById(R.id.dialog_button) as Button
        dialog_button!!.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        when (v.id) {
            R.id.dialog_button -> AlertDialog.Builder(this).setTitle("Kotlin").setMessage("Hello, Kotlin!!").setPositiveButton("OK", null).show()
        }
    }
}
