package lavsam.gb.profias.translatorl2.model.datasource

import io.reactivex.Observable
import lavsam.gb.profias.translatorl2.model.Vocabulary

class DataSourceLocal(
    private val remoteProvider: RoomDataBaseImplementation = RoomDataBaseImplementation()
) : DataSource<List<Vocabulary>> {
    override fun getData(word: String): Observable<List<Vocabulary>> = remoteProvider.getData(word)
}