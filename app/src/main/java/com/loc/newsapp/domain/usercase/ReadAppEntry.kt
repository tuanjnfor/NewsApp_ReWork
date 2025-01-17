package com.loc.newsapp.domain.usercase

import com.loc.newsapp.domain.manager.LocalUserManager
import kotlinx.coroutines.flow.Flow

class ReadAppEntry (private val localUserManager: LocalUserManager) {
    suspend operator fun invoke():Flow<Boolean> {
       return localUserManager.readAppEntry()
    }
}