package children;
import java.util.*;

public class motivationProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float count=0;
		System.out.println("I'm Asiimwe Martin");
		System.out.println("Your Teacher Today");
		
		System.out.println("Whats your Name");
		String name; 
		Scanner scan = new Scanner(System.in);
		name = scan.nextLine();
		System.out.println("Hi,"+name+" Nice to met you,\nWhat multiplication Table do you like");
		
		int choice;
		choice = scan.nextInt();
		
		for(int i=1; i<=12; i++) {
			int answer;
			System.out.println(choice+"X"+i+"=");
			answer = scan.nextInt();
			if(answer == i*choice) {
				System.out.println("You Have Passed" );
				count++;
			}else {
				System.out.println("You are Wrong\n\n" );
			}
		}
		
		System.out.println("You have "+count+" Answers Correct" );
		System.out.println("And "+(12-count)+" Wrong" );
		System.out.println("So your score is"+(count/12)*100+"% " );
		
		
		scan.close();

	}

}
