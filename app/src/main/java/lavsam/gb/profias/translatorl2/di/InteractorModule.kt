package lavsam.gb.profias.translatorl2.di

import dagger.Module
import dagger.Provides
import lavsam.gb.profias.translatorl2.interactor.MainInteractor
import lavsam.gb.profias.translatorl2.model.Vocabulary
import lavsam.gb.profias.translatorl2.model.repository.Repository
import javax.inject.Named


@Module
class InteractorModule {

    @Provides
    internal fun provideInteractor(
        @Named(NAME_REMOTE) repositoryRemote: Repository<List<Vocabulary>>,
        @Named(NAME_LOCAL) repositoryLocal: Repository<List<Vocabulary>>
    ) = MainInteractor(repositoryRemote, repositoryLocal)
}
