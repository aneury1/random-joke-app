package com.aneury1.random_joke.Data.Model.dataModel

data class Joke(
    val error: Boolean,
    val amount: Int,
    var category: String,
    val delivery: String,
    val type: String,
    val setup : String,
    val flags: Flags,
    val id: Int,
    val safe: Boolean,
    val lang: String
)
{
    companion object{
        fun getFakeJoke() : Joke{
            var joke : Joke = Joke(
                 error= true,
                amount =  1,
                category = "String",
                delivery ="String",
                type="String",
                setup ="String",
                flags = Flags(false,false,false,false,false ,false),
                id = 0,
                safe= true,
                lang= "String"
            )
            return joke
        }
    }
}