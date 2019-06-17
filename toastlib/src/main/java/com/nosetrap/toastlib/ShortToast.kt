package com.nosetrap.applib.toast

import android.content.Context
import androidx.annotation.StringRes

class ShortToast private constructor() {
    companion object {
        fun success(context: Context, text: String) {
            Toast.success(context, text, Toast.SHORT)
        }

        fun error(context: Context, text: String) {
            Toast.error(context, text, Toast.SHORT)
        }

        fun info(context: Context, text: String) {
            Toast.info(context, text, Toast.SHORT)
        }

        fun warning(context: Context, text: String) {
            Toast.warning(context, text, Toast.SHORT)
        }
    }
}