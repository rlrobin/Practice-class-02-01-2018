import java.util.Scanner;
public class instancesss {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("What is your firstname? ");
		String first = scan.nextLine();
		
		System.out.println("What is your lastname? ");
		String last= scan.nextLine();
		
		System.out.println("What is your middle Intitials? ");
		String middleInt= scan.nextLine();
		
		System.out.println("What is your career? ");
		String career1= scan.nextLine();
		
		System.out.println("How old are you? ");
		int age1=scan.nextInt();
		
		System.out.println("Firstname : "+first + "\n"+ "Middle Intitial : "+middleInt+ "\n"+"Lastname: "+last+"\n"+"Career :"+career1+"\n"+ "Age :"+age1);        
				
		
		
		
	}

}
