package lavsam.gb.profias.translatorl2.model.data

import lavsam.gb.profias.translatorl2.model.Vocabulary

sealed class AppState {
    data class Success(val data: List<Vocabulary>?) : AppState()
    data class Error(val error: Throwable) : AppState()
    data class Loading(val progress: Int?) : AppState()
}