package com.company;

public class Main {

    public static void main(String[] args)
    {
        boolean gameOver = true;
        int score =800;
        int levelCompleted = 5 ;
        int bonus = 100;

       int highScore = calculateScore(gameOver ,score ,levelCompleted , bonus);
        System.out.println("Your final Score is "+highScore);


        int highScorePosition = calculateHighScorePosition(1500);
        displayHighScorePosion("Tim" , highScorePosition);
        highScorePosition = calculateHighScorePosition(900);
        displayHighScorePosion("Bob" , highScorePosition);
        highScorePosition = calculateHighScorePosition(400);
        displayHighScorePosion("percy" , highScorePosition);
        highScorePosition = calculateHighScorePosition(50);
        displayHighScorePosion("Gilbert" , highScorePosition);
        highScorePosition = calculateHighScorePosition(1000);
        displayHighScorePosion("Louise" , highScorePosition);
        highScorePosition = calculateHighScorePosition(500);
        displayHighScorePosion("carel" , highScorePosition);
        highScorePosition = calculateHighScorePosition(100);
        displayHighScorePosion("frank" , highScorePosition);
    }
    public  static int calculateScore(boolean gameOver , int score , int levelCompleted , int bonus)
    {

        if(gameOver )
        {
            int finalScore = score + (levelCompleted * bonus);
            finalScore+= 2000;
            return finalScore;
        }
        return -1;
    }
    public static void displayHighScorePosion(String playerName , int highScorePosition)
    {
        System.out.println(playerName + " managed to get into postion "+highScorePosition + " on the high score table");
    }
    public static int calculateHighScorePosition(int playerScore)
    {
   /*     if (playerScore >= 1000)
            return 1;
        else if(playerScore >= 500)
            return 2;
        else if(playerScore >= 100)
            return 3;

            return 4;*/

        int position = 4 ;
        if(position >= 1000)
            position = 1;
        else if(position >= 500)
            position = 2;
        else if(playerScore >= 100);
            position = 3;

        return  position;
    }



}




