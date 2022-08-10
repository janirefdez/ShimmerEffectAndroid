package com.janirefernandez.shimmereffect.ui.main

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.janirefernandez.shimmereffect.data.model.Animal
import com.janirefernandez.shimmereffect.domain.AnimalUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(
    private val animalUseCase: AnimalUseCase
) : ViewModel() {

    val animalList = MutableLiveData<MutableList<Animal>>()

    fun getAnimals(size: Int) {
        viewModelScope.launch {
            val result = animalUseCase.invoke(size)
            animalList.postValue(result.toMutableList())
        }
    }
}