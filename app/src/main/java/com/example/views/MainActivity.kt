package com.example.views

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import android.widget.Toast.makeText
import kotlin.math.tanh

class MainActivity : AppCompatActivity() {
    var fn:EditText?=null
    var ln:EditText?=null
    var ea:EditText?=null
    var pd:EditText?=null
    var cancelbtn:Button?=null
    var proceedbtn:Button?=null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        fn = findViewById(R.id.fn)
        ln = findViewById(R.id.ln)
        ea = findViewById(R.id.ea)
        pd = findViewById(R.id.pd)
        cancelbtn = findViewById(R.id.cancelbtn)
        proceedbtn = findViewById(R.id.proceedbtn)

        proceedbtn?.setOnClickListener(object : View.OnClickListener {
            override fun onClick(view: View?) {
                CheckFields()

            }

        })

        cancelbtn!!.setOnClickListener(object : View.OnClickListener {
            override fun onClick(p0: View?) {
                finish()
                System.exit(0)
            }
        })
    }

        fun CheckFields(): Boolean {
            if (fn!!.length()==0) {
                fn!!.error = "This field is required"
                return true
            }
            if(ln!!.length()==0){
                ln!!.error="This fied is required"
                return true
            }
            if(ea!!.length()==0){
                ea!!.error="This fied is required"
                return true
            }
            if(pd!!.length()==0){
                pd!!.error="This fied is required"
                return true
            }
            return true
        }
    }








