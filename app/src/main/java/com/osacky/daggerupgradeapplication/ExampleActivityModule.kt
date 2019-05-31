package com.osacky.daggerupgradeapplication

import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class ExampleActivityModule {
    @ContributesAndroidInjector
    abstract fun bindMainActivity(): MainActivity
}