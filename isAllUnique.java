import java.util.Scanner;

public class isAllUnique {

	 static boolean isUnique(String str){
//		char[] cArr = str.toCharArray();
		if(str.length()>256){
			// .length for array
			return false;
		}else{
			Boolean[] char_set = new Boolean[256];
			for(int i=0; i<str.length(); i++){
				int cIndex = str.charAt(i);
//				int cIndex = (cArr[i]);
				if(char_set[cIndex]!=null){
					return false;
				}else{
					char_set[cIndex] = true;
				}
			}
			
		}
		return true;
	}
	public static void main(String args[]){
		Scanner userInput = new Scanner(System.in);
		System.out.print("Check if this string's char are all unique: ");
		if(userInput.hasNextLine()){
		
			System.out.println(isUnique(userInput.nextLine()));
			
		}
	}
}
