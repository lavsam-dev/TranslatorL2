package lavsam.gb.profias.translatorl2.interactor

import io.reactivex.Observable

interface Interactor<T> {
    fun getData(word: String, fromRemoteSource: Boolean): Observable<T>
}