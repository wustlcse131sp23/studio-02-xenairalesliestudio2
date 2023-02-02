package studio2;

import java.util.Scanner;

public class Mine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		double startAmount = 20;
		int trialRuns = 0;
		// 50% shot of winning or losing:
		double randNum = Math.random();
		boolean winorlose = (randNum >= 0.5);
		double winLimit = 40;
		double win = 0;
		double lose = 0;
		
		//loop that runs the whole program
		while (trialRuns < 500) {
			while (startAmount >= 0 && startAmount != 40)
				
			{
				randNum = Math.random(); 
				winorlose = (randNum >= 0.5);
				if (winorlose)
					startAmount++;
					
				else 
					startAmount--;
				System.out.println(startAmount);
			}
			trialRuns++;	
			if (startAmount == 0.0)
				lose++;
			else
				win++;
			startAmount = 20;
		}
		System.out.println("We lost " + lose + "times. We won " + );
		}
}
