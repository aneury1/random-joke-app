package com.aneury1.random_joke.Model.dataModel

data class Joke(
    var error: Boolean = false,
    var amount: Int = 0,
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
        fun getFakeJoke() : Joke?{
            var joke : Joke = Joke(
                 error= false,
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