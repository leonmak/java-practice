import java.util.Scanner;

public class URLify {

	static String URL(String str, int len){
		char[] cArr = str.toCharArray();
		String a = "";
		for (int i = 0; i < len; i++) {
			if (Character.isWhitespace(cArr[i])) {
				a += "%20";
			} else{
				a+= cArr[i];
			}
		}
		return a;
	}
	public static void main(String args[]){
		Scanner userInput = new Scanner(System.in);
		System.out.print("URLIFY: ");
		if(userInput.hasNextLine()){
			System.out.println(URL(userInput.nextLine(), 4));
		}
	}	
}
