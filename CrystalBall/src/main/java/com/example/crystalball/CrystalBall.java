package com.example.crystalball;

import java.util.Random;

/**
 * Created by Kevin on 2/19/14.
 */
public class CrystalBall {

    public String[] mAnswers = {
            "It is certain",
            "It is decidedly so",
            "All signs say YES",
            "The stars are not aligned",
            "My reply is no",
            "It is doubtful",
            "Better not tell you now",
            "Concentrate and ask again",
            "Unable to answer now"
    };

    public String getAnAnswer(){
        String answer = "";

        Random randomGenerator = new Random();
        int randomNumber = randomGenerator.nextInt(mAnswers.length);

        answer = mAnswers[randomNumber];

        return answer;
    }
}
