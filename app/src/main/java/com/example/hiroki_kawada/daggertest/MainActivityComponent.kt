package com.example.hiroki_kawada.daggertest

import dagger.Component

@Component(modules = [ViewModelModule::class])
interface MainActivityComponent {
    fun inject(activity: MainActivity)
}