package com.example.hiroki_kawada.daggertest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject lateinit var viewModel: MainViewModel

    private val component = DaggerMainActivityComponent.builder()
        .viewModelModule(ViewModelModule())
        .build()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        this.component.inject(this)

        val text = viewModel.getText()
        Log.d("MainActivity",text)
    }
}
