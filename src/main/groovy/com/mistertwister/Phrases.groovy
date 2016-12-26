package com.mistertwister

class Phrases {

    private static def onLaunch = [
            0: "Welcome to Mister Twister. I hope your hamstrings are stretched!",
            1: "Welcome to Mister Twister! Maybe you should take a moment and limber up.",
            2: "It's Mister Twister! Get ready to get twisted!",
            3: "Welcome to Mister Twister!"
    ]

    private static def hype = [
            0: "Let's spin it up! I'm looking at you, Jerry.",
            1: "Come on blue! Let's go blue! All hands on blue!",
            2: "I didn't know that legs could do that!",
            3: "If you don't know the person to your left yet, you're about to!",
            4: "Get pumped. Get ready... Mister Twister is in charge!",
            5: "Get out of your seat... get ready... and have a rockin time!",
            6: "I dare you to Spin Twice! Kick the party up notches",
            7: "Twister is hard enough... but do you have it in you to spin twice?",
            8: "Remember, Ghandi probably played twister. You're just like Ghandi now!",
            9: "This isn't a game for denim! Everyone put on stretchy pants!"
    ]

    private static def spins = [
            0: "Ok! Spinning the wheel!",
            1: "Spinning and winning!",
            2: "Giving the wheel a spin.",
            3: "Spinning!! I hope you're limber.",
            4: "Spinning! Get ready to get twisted.",
            5: "All I do is spin spin spin no matter what what what.",
            6: "Spinning... If you don't know the person to your left yet, you're about to!"
    ]

    static def spin(){
        spins.get(rand(spins.size()))
    }

    static def onLaunch(){
        onLaunch.get(rand(onLaunch.size()))
    }

    static def hype(){
        hype.get(rand(hype.size()))
    }

    private static def rand = { int b ->
        new Random().nextInt(b)
    }




}
