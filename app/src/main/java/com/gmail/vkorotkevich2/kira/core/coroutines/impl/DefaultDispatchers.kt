package com.gmail.vkorotkevich2.kira.core.coroutines.impl

import com.gmail.vkorotkevich2.kira.core.coroutines.Dispatchers
import kotlinx.coroutines.CoroutineDispatcher

internal class DefaultDispatchers(
    override val ui: CoroutineDispatcher,
    override val io: CoroutineDispatcher,
    override val default: CoroutineDispatcher
) : Dispatchers
