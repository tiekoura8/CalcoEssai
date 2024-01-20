package com.example.calcoessai
import android.app.Activity
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.view.View
import android.widget.Button
import com.example.calcoessai.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    //DECLARATION DES VARIABLES
    var clicOperator = false;
    var operator = "";



    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
    }

    fun clickButtonNumber(view: View){
        if(view is Button){
            binding.ecran.append(view.text)
        }

    }
    fun backSpaceAction(view: View){
        val length= binding.ecran.length()
        if(length > 0){
            binding.ecran.text = binding.ecran.text.subSequence(0, length -1) as Editable?
        }
    }

    fun clearAllAction(view: View){
        binding.ecran.setText("")
    }

    fun calcul(){

    }
}