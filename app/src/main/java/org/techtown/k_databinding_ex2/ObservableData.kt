package org.techtown.k_databinding_ex2

import androidx.databinding.BaseObservable
import androidx.databinding.Bindable

class ObservableData : BaseObservable() {

    @get:Bindable
    var site : String = ""
        set(value) {
            field = value
            notifyPropertyChanged(BR.site)
        }
}