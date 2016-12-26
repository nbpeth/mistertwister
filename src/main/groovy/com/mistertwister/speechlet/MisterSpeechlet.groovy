package com.mistertwister.speechlet

import com.amazon.speech.slu.Intent
import com.amazon.speech.speechlet.IntentRequest
import com.amazon.speech.speechlet.LaunchRequest
import com.amazon.speech.speechlet.Session
import com.amazon.speech.speechlet.SessionEndedRequest
import com.amazon.speech.speechlet.SessionStartedRequest
import com.amazon.speech.speechlet.Speechlet
import com.amazon.speech.speechlet.SpeechletException
import com.amazon.speech.speechlet.SpeechletResponse
import com.mistertwister.Phrases
import com.mistertwister.SpeechBuilder
import com.mistertwister.game.Game
import org.slf4j.Logger
import org.slf4j.LoggerFactory

class MisterSpeechlet implements Speechlet{
    Logger log = LoggerFactory.getLogger(this.getClass().getName());
    private static String lastMove = ""

    public void onSessionStarted(SessionStartedRequest request, Session session) throws SpeechletException {
        log.info("session started " + session.getSessionId());
    }

    public SpeechletResponse onLaunch(LaunchRequest request, Session session) throws SpeechletException {
        return SpeechBuilder.speak(Phrases.onLaunch());
    }

    public SpeechletResponse onIntent(IntentRequest request, Session session) throws SpeechletException {
        log.info("intent received " + request.getIntent().getName());

        SpeechletResponse response = SpeechBuilder.speak("Sorry, I didn't get that. Maybe you want to Spin the wheel?")
        Intent intent = request.getIntent()

        if(intent.getName() == 'Spin'){
            String doubleSlot = intent.getSlot("double")?.value

            if(doubleSlot in ['double','Double','twice','Twice']) {
                response = SpeechBuilder.speak(Game.doubleSpin())
            }
            else{
                response = SpeechBuilder.speak(Game.spin())
            }

        }

        else if(intent.getName() == 'HypeUp'){
            response = Game.hype()
        }

        response
    }

    public void onSessionEnded(SessionEndedRequest request, Session session) throws SpeechletException {
        log.info("session ended " + session.getSessionId());
    }


}
