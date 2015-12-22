import java.util.Scanner;

public class compressStr {

	static String compressString(String sOrig){
		char[] cArr = sOrig.toCharArray();
		String s = "";
		char prev = cArr[0];
		int count = 1;
		for(int i=1; i<cArr.length; i++ ){
			if(cArr[i] != prev){
				s += (prev + Integer.toString(count));
				prev = cArr[i];
				count =1;
			} else {
				count ++;
			}
			if(i==cArr.length-1){
				s += (prev + Integer.toString(count)); 
			}
		}
		if(s.length() > cArr.length){
			return sOrig;
		}
		return s;
				
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner userInput = new Scanner(System.in);
		System.out.print("Compress a string: ");
		if(userInput.hasNextLine()){
			String str= userInput.nextLine();
			System.out.println(compressString(str));
		}

	}

}
