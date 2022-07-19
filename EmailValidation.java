package Authorization;
import java.util.Scanner;
public class EmailValidation {

	public static void main(String args[]) {
		int count=0;
		String[] arr=new String[5];
		arr[0]="Ankit1108@gmail.com";
		arr[1]="Rahul@gmail.com";
		arr[2]="avinash@yahoo.com";
		arr[3]="vipin@twitter.com";
		arr[4]="ankit.20m0141@gmail.com";
	
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter you emailId: ");
		String Email=sc.nextLine();
		for(int i=0;i<=4;i++) {
		
			if(arr[i].equals(Email)) {
			  count=1;
			}
			
		}
		if(count==1) {
			System.out.println("Congratulations,you passed the validation test🙂");
		}
		else
			System.out.println("Sorry,wrong emailId ☹ !!");
	}
}