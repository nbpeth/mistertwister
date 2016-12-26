package com.mistertwister.handler

import com.amazon.speech.speechlet.SpeechletV2
import com.amazon.speech.speechlet.lambda.SpeechletRequestStreamHandler
import com.mistertwister.Config
import com.mistertwister.speechlet.MisterSpeechlet

class LambdaHandler extends SpeechletRequestStreamHandler {

    LambdaHandler(SpeechletV2 speechlet, Set<String> supportedApplicationIds) {
        super(speechlet, supportedApplicationIds)
    }

    LambdaHandler() {
        super(new MisterSpeechlet(), Config.ids());
    }
}
