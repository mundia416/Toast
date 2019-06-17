package com.nosetrap.toastlib

import android.content.Context

class LongToast private constructor(){
    companion object {
        fun success(context: Context, text: String) {
            Toast.success(context, text, Toast.LONG)
        }

        fun error(context: Context, text: String) {
            Toast.error(context, text, Toast.LONG)
        }

        fun info(context: Context, text: String) {
            Toast.info(context, text, Toast.LONG)
        }

        fun warning(context: Context, text: String) {
            Toast.warning(context, text, Toast.LONG)
        }
    }
}