package com.assignment;

public class LambDemo  {

	public static void main(String[] args) {
		
	IGames game=(String [] games)->{
			for(String game1:games) {
				System.out.println(game1);
			}
		};
		
String[] gameList= {"football","cricket"};
game.printGames(gameList);

	}

}
