package lavsam.gb.profias.translatorl2.di

import dagger.Module
import dagger.android.ContributesAndroidInjector
import lavsam.gb.profias.translatorl2.ui.main.MainActivity

@Module
abstract class ActivityModule {

    @ContributesAndroidInjector
    abstract fun contributeMainActivity(): MainActivity
}