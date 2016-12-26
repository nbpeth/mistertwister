package com.mistertwister

import com.amazon.speech.speechlet.SpeechletResponse
import com.amazon.speech.ui.Card
import com.amazon.speech.ui.SsmlOutputSpeech

class SpeechBuilder {

    static SpeechletResponse speak(String phrase, Card card = null) {
        SpeechletResponse response = new SpeechletResponse()
        response.setOutputSpeech(buildOutputSpeech(phrase))
        response.shouldEndSession = false

        if(card) response.setCard(card)

        response
    }

    static String move(List<Map> moves){
        def firstMove = movePhraseSection(moves[0])
        String phrase = "Ok... $firstMove..."

        if(moves.size() > 1){
            def secondMove = movePhraseSection(moves[1])

            phrase += "<break time=\"2s\"/>"
            phrase += "...second move..."
            phrase += "<break time=\"1s\"/>"
            phrase += "$secondMove..."
        }

        phrase

    }

    static String movePhraseSection(Map move){
        "${move.orientation}. ${move.bodyPart}... ${move.color}"
    }

    private static SsmlOutputSpeech buildOutputSpeech(String phrase){
        SsmlOutputSpeech outputSpeech = new SsmlOutputSpeech()
        outputSpeech.setSsml("<speak> $phrase </speak>")

        outputSpeech

    }

}
