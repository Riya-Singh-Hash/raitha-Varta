package com.example.raithavarta.repository

import com.example.raithavarta.data.local.TipDao
import com.example.raithavarta.data.local.TipEntity

class TipRepository(
    private val tipDao: TipDao
) {

    val allTips = tipDao.getAllTips()

    suspend fun insertTips(tips: List<TipEntity>) {

        tipDao.insertTips(tips)
    }
}