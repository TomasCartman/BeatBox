package com.dashboarder.beatbox

import android.content.res.AssetManager
import androidx.lifecycle.ViewModel

class BeatBoxViewModel(private var assets: AssetManager) : ViewModel() {
    var beatBox: BeatBox = BeatBox(assets)


    override fun onCleared() {
        super.onCleared()

        beatBox.release()
    }
}