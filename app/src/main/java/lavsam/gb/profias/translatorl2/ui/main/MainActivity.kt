package lavsam.gb.profias.translatorl2.ui.main

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import lavsam.gb.profias.translatorl2.R
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    companion object {
        private const val BOTTOM_SHEET_FRAGMENT_DIALOG_TAG =
            "74a54328-5d62-46bf-ab6b-cbf5fgt0-092395"
    }
}