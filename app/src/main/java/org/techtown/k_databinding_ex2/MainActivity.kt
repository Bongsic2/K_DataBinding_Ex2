package org.techtown.k_databinding_ex2

import android.os.Bundle
import android.os.Handler
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.LinearLayoutManager
import org.techtown.k_databinding_ex2.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        binding.activity = this@MainActivity
        setRcv()
    }

    fun btnClick(view: View) {
        Toast.makeText(this, "Button Click", Toast.LENGTH_SHORT).show()
    }

    fun setRcv() {
        val profileAdapter = ProfileAdapter(this)
        binding.mainRcv.layoutManager = LinearLayoutManager(this)
        binding.mainRcv.adapter = profileAdapter
        profileAdapter.data = listOf(
            ProfileData(profile = "이미지 url", name = "Kang", age = 26),
            ProfileData(profile = "이미지 url", name = "Kim", age = 25)
        )
        profileAdapter.notifyDataSetChanged()
    }

    fun setObserv() {
        var item: ObservableData = ObservableData()
        item.site = "Namer"
        binding.site = item
        Handler().postDelayed(Runnable {
            run {
                item.site = "Google"
            }
        }, 3000)
    }

}