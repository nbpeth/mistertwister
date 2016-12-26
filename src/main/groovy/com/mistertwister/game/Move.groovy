package com.mistertwister.game

class Move {
    static def orientation = [
        0:"left",
        1:"right"
    ]

    static def bodyPart = [
        0:"hand",
        1:"foot"
    ]
    static def color = [
        0:"red",
        1:"blue",
        2:"green",
        3:"yellow"
    ]

    private static Map spin(){
        move:[
            orientation:orientation.get(new Random().nextInt(2)),
            bodyPart:bodyPart.get(new Random().nextInt(2)),
            color:color.get(new Random().nextInt(4))
        ]
    }

    static List<Map> spinStandard(){
        moves:[spin()]
    }

    static List<Map> spinDouble(){
        moves:[spin(),spin()]
    }

}
