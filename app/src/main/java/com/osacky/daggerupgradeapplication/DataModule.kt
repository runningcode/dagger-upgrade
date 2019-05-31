package com.osacky.daggerupgradeapplication

import dagger.Module
import dagger.Provides

@Module
object DataModule {
    @Provides @JvmStatic
    fun provideFoo(): String {
        return "foo"
    }
}