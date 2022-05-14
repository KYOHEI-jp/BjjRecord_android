package com.example.bjjrecord.page.common

class CommonHeaderContract {
    interface Navigation {
        fun back()
        fun buttonClick()
        fun setButtonEnabled(value: Boolean)
        fun setButtonLabel(titleRes: Int)
        fun setTitle(titleRes: Int)
    }

    interface ViewModel {

    }
}