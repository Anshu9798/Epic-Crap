import java.util.Scanner;
public class CrapTesting {
 
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Dice dice1 = new Dice();
		Dice dice2 = new Dice();
		int roll1 = dice1.roll();
		int roll2 = dice2.roll();
		int sum = roll1 + roll2;
		
		System.out.println("Your objective is to roll a 7 or an 11; After the subsequent roll, your goal becomes to acheive the number of your second roll");
		System.out.println("If you roll a 7 after the first roll, you lose!");
		System.out.println("Press enter to roll the dice once");
		in.nextLine();
		dice1.roll();
		dice2.roll();
		
		
		if ( sum ==7) {
			System.out.println("Total Roll: " + sum);
			System.out.println("Cogratulations! You Won!");
			System.out.println(" Type enter to play again");
		}
		else if (sum == 11) {
			System.out.println("Total Roll: " + sum);
			System.out.println("Congratulations! You Won!");
			
		}
		else if (sum == 2) {
			System.out.println("Total Roll: " + sum);
			System.out.println("Sorry! You Lose!");

		}
		else if (sum == 12) {
			System.out.println("Total Roll: " + sum);
			System.out.println("Sorry! You Lose!");
			
		}
		else if(sum >2 || sum<7 || sum>7 || sum < 11) {
			int point = sum;
			System.out.println("Your point is " +  sum +" . Your goal is to now try and roll your point.");
			
			in.nextLine();
			roll1 = dice1.roll();
			roll2 = dice2.roll();
			sum = roll1+roll2;
			
			
			while (point != sum && sum != 7) {
				System.out.println("You rolled a " + sum +" .You did not roll your point. Keep Trying!");
				
				in.nextLine();
				roll1 = dice1.roll();
				roll2 = dice2.roll();
				sum = roll1 + roll2;
				}
			if(sum == point) {
				System.out.println("Congratulations, you rolled a " + point + " and won!");
				
			}
			if (sum == 7) {
				System.out.println("Sorry, you rolled a 7 and lost!.Try again!");	
			}
			
			
		}
	}	
	
}