package com.example.views

import android.annotation.SuppressLint
import android.app.Application
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.view.View
import android.widget.*
import android.widget.Toast.makeText
import kotlin.math.tanh

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
       var rg=findViewById<RadioGroup>(R.id.rg)
        var btn1=findViewById<Button>(R.id.btn1)
        var btn2=findViewById<Button>(R.id.btn2)
        var tv2=findViewById<TextView>(R.id.tv2)
    /*    rg.setOnCheckedChangeListener { radioGroup, i ->
            val rd=findViewById<RadioButton>(i)
        } */
        btn1.setOnClickListener {
            val a=rg.checkedRadioButtonId
            var b=findViewById<RadioButton>(a)
             tv2.text=b.text
           /* if(a==-1){
                Toast.makeText(this,"selected atleast one option",Toast.LENGTH_SHORT).show()
            }
            else{
             val rd=findViewById<RadioButton>(a)
             Toast.makeText(this,rd.text,Toast.LENGTH_SHORT).show()
            }*/
        }
        btn2.setOnClickListener {
            tv2.text=" "
        }
    }

}



