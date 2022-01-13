package com.gucheng.jetpacksample.data

import androidx.databinding.ObservableInt

/**
 * Created on 2022/1/13.
 */
data class UserLike(val count : ObservableInt = ObservableInt(0) ,val name:String)