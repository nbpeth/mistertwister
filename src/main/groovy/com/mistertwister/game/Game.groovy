package com.mistertwister.game

import com.amazon.speech.speechlet.SpeechletResponse
import com.mistertwister.Phrases
import com.mistertwister.SpeechBuilder

class Game {

    static String spin() {
        SpeechBuilder.move(Move.spinStandard())
    }

    static String doubleSpin() {
        SpeechBuilder.move(Move.spinDouble())
    }

    static SpeechletResponse hype() {
        SpeechBuilder.speak(Phrases.hype())
    }
}
