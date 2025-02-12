package com.loc.newsapp.presentation.onboarding

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.loc.newsapp.domain.usercase.AppEntryUseCases
import com.loc.newsapp.domain.usercase.ReadAppEntry
import kotlinx.coroutines.launch
import javax.inject.Inject

class onBoardingViewModel @Inject constructor(private val appEntryUseCases: AppEntryUseCases) :
    ViewModel() {

        fun onEvent(evnet: OnBoardingEvent) {
            when (evnet) {
                is OnBoardingEvent.SaveAppEntry -> {
                    saveAppEntry()
                }
            }
        }

    private fun saveAppEntry() {
        viewModelScope.launch {
            appEntryUseCases.saveAppEntry
        }
    }


}