package com.gmail.vkorotkevich2.kira.core.coroutines.impl

import com.gmail.vkorotkevich2.kira.core.coroutines.Dispatchers
import kotlinx.coroutines.CoroutineDispatcher

typealias KotlinDispatchers = kotlinx.coroutines.Dispatchers

internal class DefaultDispatchers(
    override val ui: CoroutineDispatcher = KotlinDispatchers.Main.immediate,
    override val io: CoroutineDispatcher = KotlinDispatchers.IO,
    override val default: CoroutineDispatcher = KotlinDispatchers.Default
) : Dispatchers
