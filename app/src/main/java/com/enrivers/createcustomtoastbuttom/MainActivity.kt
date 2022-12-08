package com.enrivers.createcustomtoastbuttom


import android.os.Bundle
import android.view.Gravity
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.enrivers.createcustomtoastbuttom.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {


    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_main)
        supportActionBar?.hide()

        binding.button.setOnClickListener {
            successToast()
        }
        binding.button2.setOnClickListener {
            errorToast()
        }
        binding.button3.setOnClickListener {
            warningToast()
        }




    }

    private fun successToast(){
        val view = layoutInflater.inflate(R.layout.toast_successful, findViewById(R.id.toastLayout),false)
        val toast = Toast(this)
        toast.setGravity(Gravity.BOTTOM,0,20)
        toast.duration = Toast.LENGTH_SHORT
        toast.view = view
        toast.show()
    }

    private fun errorToast(){
        val view = layoutInflater.inflate(R.layout.toast_error, findViewById(R.id.toastLayout),false)
        val toast = Toast(this)
        toast.setGravity(Gravity.BOTTOM,0,30)
        toast.duration = Toast.LENGTH_SHORT
        toast.view = view
        toast.show()
    }

    private fun warningToast(){
        val view = layoutInflater.inflate(R.layout.toast_warning, findViewById(R.id.toastLayout),false)
        val toast = Toast(this)
        toast.setGravity(Gravity.BOTTOM,0,40)
        toast.duration = Toast.LENGTH_SHORT
        toast.view = view
        toast.show()
    }
}