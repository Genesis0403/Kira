package com.gmail.vkorotkevich2.kira.core.coroutines

import kotlinx.coroutines.CoroutineDispatcher

interface Dispatchers {
    val ui: CoroutineDispatcher
    val io: CoroutineDispatcher
    val default: CoroutineDispatcher
}
