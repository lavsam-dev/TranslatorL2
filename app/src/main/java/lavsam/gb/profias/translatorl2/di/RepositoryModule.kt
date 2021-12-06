package lavsam.gb.profias.translatorl2.di

import dagger.Module
import dagger.Provides
import lavsam.gb.profias.translatorl2.model.Vocabulary
import lavsam.gb.profias.translatorl2.model.datasource.DataSource
import lavsam.gb.profias.translatorl2.model.datasource.RetrofitImplementation
import lavsam.gb.profias.translatorl2.model.datasource.RoomDataBaseImplementation
import lavsam.gb.profias.translatorl2.model.repository.Repository
import lavsam.gb.profias.translatorl2.model.repository.RepositoryImplementation
import javax.inject.Named
import javax.inject.Singleton

@Module
class RepositoryModule {

    @Provides
    @Singleton
    @Named(NAME_REMOTE)
    internal fun provideRepositoryRemote(@Named(NAME_REMOTE) dataSourceRemote:
        DataSource<List<Vocabulary>>): Repository<List<Vocabulary>> =
        RepositoryImplementation(dataSourceRemote)

    @Provides
    @Singleton
    @Named(NAME_LOCAL)
    internal fun provideRepositoryLocal(@Named(NAME_LOCAL) dataSourceLocal:
        DataSource<List<Vocabulary>>): Repository<List<Vocabulary>> =
        RepositoryImplementation(dataSourceLocal)

    @Provides
    @Singleton
    @Named(NAME_REMOTE)
    internal fun provideDataSourceRemote(): DataSource<List<Vocabulary>> =
        RetrofitImplementation()

    @Provides
    @Singleton
    @Named(NAME_LOCAL)
    internal fun provideDataSourceLocal(): DataSource<List<Vocabulary>> =
        RoomDataBaseImplementation()
}