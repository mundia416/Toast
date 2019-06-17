package com.nosetrap.toastlib

import android.content.Context
import android.widget.Toast
import es.dmoral.toasty.Toasty

internal class Toast private constructor(){
    companion object {
        const val SHORT = Toast.LENGTH_SHORT
        const val LONG = Toast.LENGTH_LONG

        fun success(context: Context, text: String,duration: Int){
            Toasty.success(context,text, duration,true).show()
        }

        fun error(context: Context, text: String,duration: Int){
            Toasty.error(context,text, duration,true).show()
        }


        fun info(context: Context, text: String,duration: Int){
            Toasty.info(context,text, duration,true).show()
        }

        fun warning(context: Context, text: String,duration: Int){
            Toasty.warning(context,text, duration,true).show()
        }
    }
}