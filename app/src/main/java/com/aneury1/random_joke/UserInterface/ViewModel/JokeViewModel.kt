package com.aneury1.random_joke.UserInterface.ViewModel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.aneury1.random_joke.Data.Model.Providers.DummyJokeProvider
import com.aneury1.random_joke.Data.Model.Providers.JokeProvider
import com.aneury1.random_joke.Data.Model.dataModel.Joke
import com.aneury1.random_joke.Domain.GetAnyJokeUseCase
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class JokeViewModel : ViewModel() {

    val joke = MutableLiveData<Joke>()
    val showLoadSpinner = MutableLiveData<Boolean>()

    var getAnyJokeUseCase = GetAnyJokeUseCase()

    fun onCreate(){
        showLoadSpinner.postValue(true)
        viewModelScope.launch{
            val result = getAnyJokeUseCase()
            if(result!=null && !result.error){
                joke.postValue(result)
            }
        }
        showLoadSpinner.postValue(false)
    }


    fun updateJoke(){
        onCreate()
    }

}