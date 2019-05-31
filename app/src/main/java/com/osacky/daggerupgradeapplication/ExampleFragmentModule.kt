package com.osacky.daggerupgradeapplication

import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class ExampleFragmentModule {
    @ContributesAndroidInjector
    abstract fun bindFragment(): ExampleFragment
}