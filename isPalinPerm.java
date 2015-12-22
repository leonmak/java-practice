import java.util.Scanner;

public class isPalinPerm {
	
	static Boolean permpalin(String str){
		// Since palindromes have at most only 1 of the center char
		// that char will be odd (if other pairs elsewhere)
		
		char[] c = str.toCharArray();
		int chance = 1;

		for (int i = 0; i < c.length/2; i++) {
			// past the middle char, use for loop variable not break.
			
			int count = 1;
			if(c[i]=='0'||c[i]==' '){continue;}
			
			for (int j = i+1; j < c.length; j++) {
				if(c[i]==c[j]){
				 count+=1;
				 c[j]= '0';
				}
			}
			if(count%2 !=0){
				chance -= 1;
			}
			System.out.println(chance);
			if(chance <0){
				return false;
			}			
		}
		return true;

	}
	
	public static void main(String args[]){
		System.out.println("Enter a string of letters:");
		Scanner userInput = new Scanner(System.in);
		if(userInput.hasNextLine()){
			System.out.println(permpalin(userInput.nextLine()));
		}
	}
}
