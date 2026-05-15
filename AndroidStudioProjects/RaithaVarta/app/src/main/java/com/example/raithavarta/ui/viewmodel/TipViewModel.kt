package com.example.raithavarta.ui.viewmodel

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import com.example.raithavarta.data.local.TipDatabase
import com.example.raithavarta.data.local.TipEntity
import com.example.raithavarta.repository.TipRepository

class TipViewModel(application: Application)
    : AndroidViewModel(application) {

    private val repository: TipRepository

    val allTips: LiveData<List<TipEntity>>

    init {

        val dao = TipDatabase
            .getDatabase(application)
            .tipDao()

        repository = TipRepository(dao)

        allTips = repository.allTips
    }
}