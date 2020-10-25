package com.example.tasks.service.listener

class ValidationListener (str: String = ""){

    private var mStatus : Boolean = true
    private var mValidationMessage : String = ""

    init {
        if (str != "") {
            mStatus = false
            mValidationMessage = str
        }
    }

    fun success() = mStatus
    fun failure() = mValidationMessage

}