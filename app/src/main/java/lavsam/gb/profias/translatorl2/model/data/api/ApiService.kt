package lavsam.gb.profias.translatorl2.model.data.api

import io.reactivex.Observable
import lavsam.gb.profias.translatorl2.model.Vocabulary
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiService {

    @GET("words/search")
    fun search(@Query("search") wordToSearch: String): Observable<List<Vocabulary>>
}
