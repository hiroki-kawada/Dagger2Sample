package com.example.hiroki_kawada.daggertest

import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {

    //本来はapi通信や内部dbから情報を取得
    fun getText(): String{
        return "おはようございます。"
    }
}