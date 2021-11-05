package com.aneury1.random_joke.Data.Model.dataModel


data class Flags(
    val nsfw: Boolean,
    val religious: Boolean,
    val political: Boolean,
    val racist: Boolean,
    val sexist: Boolean,
    val explicit: Boolean
) {
    companion object {
        fun getDefaultFlag(): Flags {
            return Flags(false, false, false, false, false, false)
        }
    }
}

