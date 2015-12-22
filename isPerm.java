import java.util.Scanner;

public class isPerm {
	static String sort(String s){
		char[] cArr = s.toCharArray();
		java.util.Arrays.sort(cArr);
		return new String(cArr);
	}

	static boolean isStringPermutation(String s1, String s2){
		if(s1.length()!=s2.length()) {
			return false;
		} else {
			return sort(s1).equals(sort(s2));
		}
	}
	public static void main(String args[]){
		Scanner userInput = new Scanner(System.in);
		System.out.print("Enter 2 strings: \n");
		if(userInput.hasNextLine()){
			String[] splitInput = userInput.nextLine().split(" ");
			System.out.println(isStringPermutation(splitInput[0], splitInput[1]));
		}
	}


}
