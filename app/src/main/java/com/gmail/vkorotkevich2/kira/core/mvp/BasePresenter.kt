package com.gmail.vkorotkevich2.kira.core.mvp

import moxy.MvpPresenter

abstract class BasePresenter<T : BaseView> : MvpPresenter<T>()
