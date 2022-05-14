package com.example.bjjrecord.page.common

import android.view.View
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.bjjrecord.R

class CommonHeaderViewModel: ViewModel(), CommonHeaderContract.ViewModel {
    lateinit var navigation: CommonHeaderContract.Navigation
    var title: MutableLiveData<String> = MutableLiveData()
    var buttonLabel: MutableLiveData<String> = MutableLiveData()
    var buttonEnabled: MutableLiveData<Boolean> = MutableLiveData()
    var backButtonVisibility: MutableLiveData<Boolean> = MutableLiveData()
    val buttonTextColor: Int
        get() {
            return if (buttonEnabled.value!!) R.color.design_default_color_error else R.color.design_default_color_primary
        }

    fun onClickBack(view: View) {
        navigation.back()
    }

    fun onClickRightButton(view: View) {
        navigation.buttonClick()
    }
}