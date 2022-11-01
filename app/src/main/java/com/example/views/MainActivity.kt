package com.example.views

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    lateinit var tv:TextView
    lateinit var button:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    tv=findViewById(R.id.tv)
    button=findViewById(R.id.one)
 /*    button.setOnClickListener {
    Edittext
}*/
    }

    @SuppressLint("SetTextI18n")
    fun onClick1(view: View) {
      tv.text=tv.text.toString()  + "1"
    }
    fun onClick2(view: View) {tv.text=tv.text.toString()  + "2"}
    fun onClick3(view: View) {tv.text=tv.text.toString()  + "3"}
    fun onClick4(view: View) {tv.text=tv.text.toString()  + "4"}
    fun onClick5(view: View) {tv.text=tv.text.toString()  + "5"}
    fun onClick6(view: View) {tv.text=tv.text.toString()  + "6"}
    fun onClick7(view: View) {tv.text=tv.text.toString()  + "7"}
    fun onClick8(view: View) {tv.text=tv.text.toString()  + "8"}
    fun onClick9(view: View) {tv.text=tv.text.toString()  + "9"}
    fun onClick0(view: View) {tv.text=tv.text.toString()  + "0"}


}