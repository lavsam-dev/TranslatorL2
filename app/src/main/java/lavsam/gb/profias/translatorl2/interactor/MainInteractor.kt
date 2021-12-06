package lavsam.gb.profias.translatorl2.interactor

import io.reactivex.Observable
import lavsam.gb.profias.translatorl2.di.NAME_LOCAL
import lavsam.gb.profias.translatorl2.di.NAME_REMOTE
import lavsam.gb.profias.translatorl2.model.Vocabulary
import lavsam.gb.profias.translatorl2.model.data.AppState
import lavsam.gb.profias.translatorl2.model.repository.Repository
import javax.inject.Inject
import javax.inject.Named

class MainInteractor @Inject constructor(
    @Named(NAME_REMOTE) val repositoryRemote: Repository<List<Vocabulary>>,
    @Named(NAME_LOCAL) val repositoryLocal: Repository<List<Vocabulary>>
) : Interactor<AppState> {

    override fun getData(word: String, fromRemoteSource: Boolean): Observable<AppState> {
        return if (fromRemoteSource) {
            repositoryRemote
        } else {
            repositoryLocal
        }.getData(word).map { AppState.Success(it) }
    }
}