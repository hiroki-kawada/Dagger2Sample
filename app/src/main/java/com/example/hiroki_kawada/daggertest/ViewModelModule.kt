package com.example.hiroki_kawada.daggertest

import dagger.Module
import dagger.Provides

@Module
class ViewModelModule {
    @Provides
    fun provideMainViewModel(): MainViewModel {
        return MainViewModel()
    }
}