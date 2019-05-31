package com.osacky.daggerupgradeapplication

import dagger.Component
import dagger.android.support.AndroidSupportInjectionModule

@Component(modules = [
    AndroidSupportInjectionModule::class,
    ExampleActivityModule::class,
    DataModule::class,
    ExampleFragmentModule::class
])
interface ExampleAppComponent {

    fun injectApplication(app: DaggerExampleApplication)

}