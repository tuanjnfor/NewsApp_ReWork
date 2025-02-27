package com.loc.newsapp.presentation.home

import android.view.View
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import androidx.paging.cachedIn
import com.loc.newsapp.domain.usercase.news.NewsUseCases
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class HomeViewModel @Inject constructor(private val newsUseCases: NewsUseCases): ViewModel() {
    val news = newsUseCases.getNews(sources = listOf("bbc-news","abc-news","al-jazeera-english")).cachedIn(viewModelScope)


}