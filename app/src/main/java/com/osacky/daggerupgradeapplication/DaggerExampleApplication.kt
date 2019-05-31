package com.osacky.daggerupgradeapplication

import android.app.Activity
import android.app.Application
import android.app.Service
import android.content.BroadcastReceiver
import androidx.fragment.app.Fragment
import dagger.android.AndroidInjector
import dagger.android.DispatchingAndroidInjector
import dagger.android.HasActivityInjector
import dagger.android.HasBroadcastReceiverInjector
import dagger.android.HasServiceInjector
import dagger.android.support.HasSupportFragmentInjector
import javax.inject.Inject

class DaggerExampleApplication : Application(), HasActivityInjector, HasServiceInjector, HasBroadcastReceiverInjector, HasSupportFragmentInjector {

    @Inject lateinit var androidActivityInjector : DispatchingAndroidInjector<Activity>
    @Inject lateinit var androidFragmentInjector : DispatchingAndroidInjector<Fragment>
    @Inject lateinit var androidBroadcastReceiverInjector : DispatchingAndroidInjector<BroadcastReceiver>
    @Inject lateinit var androidServiceInjector : DispatchingAndroidInjector<Service>

    override fun onCreate() {
        super.onCreate()

        DaggerExampleAppComponent.builder().build()
            .injectApplication(this)
    }
    override fun activityInjector(): AndroidInjector<Activity> = androidActivityInjector
    override fun serviceInjector(): AndroidInjector<Service> = androidServiceInjector
    override fun broadcastReceiverInjector(): AndroidInjector<BroadcastReceiver> = androidBroadcastReceiverInjector
    override fun supportFragmentInjector(): AndroidInjector<Fragment> = androidFragmentInjector
}