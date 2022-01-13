package com.gucheng.jetpacksample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.databinding.DataBindingUtil
import com.gucheng.jetpacksample.R
import com.gucheng.jetpacksample.data.UserLike
import com.gucheng.jetpacksample.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val binding : ActivityMainBinding = DataBindingUtil.setContentView(this,R.layout.activity_main)
        val userLike = UserLike(name="Ada")
        binding.user = userLike

        findViewById<Button>(R.id.like).setOnClickListener{
            userLike.count.set(userLike.count.get() + 1)
        }
    }
}