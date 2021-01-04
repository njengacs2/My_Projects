package com.servlet;

public class codeBlocks {

	public static void main(String[] args) {
		boolean gameOver = true;
		int score = 1000;
		int levelCompleted = 8;
		int bonus = 200;

//        if(score < 5000 && score >1000) {
//            System.out.println("This was was less than 5000 but greater than 1000");
//        } else if(score < 1000) {
//            System.out.println("Your score was less than 1000");
//        } else {
//            System.out.println("Got here");
//
//        }

		if (gameOver) {
			int finalScore = score + (levelCompleted * bonus);
			finalScore += 1000;
			System.out.println("Your final score was " + finalScore);
		}

		// Print out a second score on the screen with the following
		// score set to 10000
		// levelCompleted set to 8
		// bonus set to 200
		// But make sure the first printout above still displays as well

	}

}
