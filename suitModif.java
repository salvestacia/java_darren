import java.util.Scanner;
import java.util.Random;

public class suitModif{
	public static void main(String[] args){
		int userNum = 0;
		userNum = gettinginput();
		Random comp = new Random();
		int compNum = comp.nextInt(3);
		
		System.out.println("welcome to the rock paper scissors game!!!");
		int[] compChoose = {0, 1, 2};
		System.out.println("computer choose: "+compChoose[compNum]);
		
		if((userNum == 0 && compNum == 1) || (userNum == 1 && compNum == 2) || (userNum == 2 && compNum == 0)){
			System.out.println("you win!!! :)" );
		}
		else if((userNum == 0 && compNum == 2) || (userNum == 1 && compNum == 0) || (userNum == 2 && compNum == 1)){
			System.out.println("you lose!!! :(");
		}
		else if(userNum == compNum){
			System.out.println("it's a tie!");
		}
	}
	
	public static int gettinginput(){
		Scanner keyboard = new Scanner(System.in);
		int userNum = 0;
		System.out.println("would you like to use rock[0], paper[1], scissors[2]: ");
		userNum = keyboard.nextInt();
		return userNum;
	}
}