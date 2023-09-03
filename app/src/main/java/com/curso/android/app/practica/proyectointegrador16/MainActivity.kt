 package com.curso.android.app.practica.proyectointegrador16

 import androidx.appcompat.app.AppCompatActivity
 import android.os.Bundle
 import com.curso.android.app.practica.proyectointegrador16.databinding.ActivityMainBinding

 class MainActivity : AppCompatActivity() {

     private lateinit var binding: ActivityMainBinding

     override fun onCreate(savedInstanceState: Bundle?) {
         super.onCreate(savedInstanceState)
         binding = ActivityMainBinding.inflate(layoutInflater)
         val view = binding.root
         setContentView(view)

         binding.buttonCompare.setOnClickListener {
             val text1 = binding.editText1.text.toString()
             val text2 = binding.editText2.text.toString()

             val resultText = if (text1 == text2) {
                 getString(R.string.result_equal)
             } else {
                 getString(R.string.result_not_equal)
             }

             binding.textViewResult.text = resultText
         }
     }
 }
