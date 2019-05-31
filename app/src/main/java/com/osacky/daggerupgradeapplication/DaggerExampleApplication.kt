package com.osacky.daggerupgradeapplication

import android.app.Application
import dagger.android.AndroidInjector
import dagger.android.DispatchingAndroidInjector
import dagger.android.HasAndroidInjector
import javax.inject.Inject

class DaggerExampleApplication : Application(), HasAndroidInjector {

    @Inject lateinit var androidInjector : DispatchingAndroidInjector<Any>

    override fun onCreate() {
        super.onCreate()

        DaggerExampleAppComponent.create()
            .injectApplication(this)
    }

    override fun androidInjector(): AndroidInjector<Any> = androidInjector
}