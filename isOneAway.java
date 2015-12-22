import java.util.Scanner;

public class isOneAway {
  static boolean isItOneAway(String s1, String s2){
	 if(s1.equals(s2)){
		 return true;
	 }
	 char [] small = s1.length()>s2.length()? s2.toCharArray() : s1.toCharArray();
	 char [] big = s1.length()>s2.length()? s1.toCharArray() : s2.toCharArray();
	 int count = 0;
	 boolean chance = true;
	 
	 for ( int i =0; i< small.length; i++){
		 if(chance){
			 System.out.println(small[i] + "   " + big[i]);
			 if(small[i]==big[i]){
				 count += 1;
				 
			 }else {
				 chance = !chance;
			 }
		 } else {
			 if(small[i-1]==big[i]){
				 count +=1;
			 } else{
				 return false;
			 }
		 }
	 }
	 if(big.length == 2){
		 return (count)==2;
	 }else if(big.length - count<=1){
		 return true;
	 }else{
		 return false;
	 }
	 

 }
	public static void main(String args[]){
		Scanner userInput = new Scanner(System.in);
		System.out.print("Check if 2 strings are 1 away: ");
		if(userInput.hasNextLine()){
			String[] ar= userInput.nextLine().split(" ");
			System.out.println(isItOneAway(ar[0],ar[1]));
		}

	}
}
