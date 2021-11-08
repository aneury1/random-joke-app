package com.aneury1.random_joke.Utils

import android.graphics.Color

object CustomValues {

   fun getColorFromType(type: String):Int{
       val color :Int = when(type){
           "error" -> Color.rgb(0,0,0)
           else-> Color.rgb(0,0,0)
       }
       return color
   }

}