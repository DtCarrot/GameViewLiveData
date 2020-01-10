package com.example.livedataexample

import android.util.Log
import androidx.lifecycle.ViewModel

class GameViewModel: ViewModel() {
    var word = ""
    var score = 0
    private lateinit var wordList: MutableList<String>

    /*
     *
     * Resets the list of words and randomize the order
     *
     *
     */
    private fun resetList() {
        wordList = mutableListOf(
            "queen",
            "hospital",
            "basketball",
            "cat",
            "change",
            "snail",
            "soup",
            "calendar",
            "sad",
            "desk",
            "guitar",
            "home",
            "railway",
            "zebra",
            "jelly",
            "car",
            "crow",
            "trade",
            "bag",
            "roll",
            "bubble"
        )
    }

    init {
        Log.i("GameViewModel", "GameViewModel created!")
    }
    override fun onCleared() {
        super.onCleared()
        Log.i("GameViewModel", "GameViewModel destroyed")
    }
}