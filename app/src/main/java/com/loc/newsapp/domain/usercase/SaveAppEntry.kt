package com.loc.newsapp.domain.usercase

import android.util.Log
import com.loc.newsapp.domain.manager.LocalUserManager

class SaveAppEntry (private val localUserManager: LocalUserManager) {
    suspend operator fun invoke() {
        Log.e("Minhtuan", "invoke: SaveAppEntry")
        localUserManager.saveAppEntry()
    }
}