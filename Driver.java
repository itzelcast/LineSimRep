import java.util.*;

public class Driver{
	public static void main(String [] args){

		Scanner keyboard = new Scanner(System.in);

		System.out.println("\nWelcome to Line Simulator. \nHow many queues do you want to simulate?");
		int nLine = keyboard.nextInt();
		System.out.println("How many customers do you want to simulate?");
		int customers = keyboard.nextInt();
		System.out.println("What is minimum time between person arrival?");
		int minArrival = keyboard.nextInt();
		System.out.println("What is the maximum time between person arrival?");
		int maxArrival = keyboard.nextInt();
		System.out.println("What is the minimum processing time for a person?");
		int minProcessing = keyboard.nextInt();
		System.out.println("What is the maximum processing time for a person?");
		int maxProcessing = keyboard.nextInt();

		

	}
}