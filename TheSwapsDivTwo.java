//Problem Statement
//John has a sequence of integers. Brus is going to choose two different positions in John's sequence and swap the elements at those positions. (The two swapped elements may have the same value.) Return the number of different sequences Brus can obtain after he makes the swap.
//Definition
//Class: TheSwapsDivTwo
//Method: find
//Parameters: int[]
//Returns: int
//Method signature: int find(int[] sequence)
//(be sure your method is public)
//Limits
//Time limit (s): 840.000
//Memory limit (MB): 64
//Constraints
//- sequence will contain between 2 and 47 elements, inclusive.
//- Each element of sequence will be between 1 and 47, inclusive.
//Examples
//0)
//{4, 7, 4}
//Returns: 3
//If Brus swaps elements 0 and 1 (0-based indices), the sequence will change to {7, 4, 4}. If he swaps elements 1 and 2 instead, the sequence will change to {4, 4, 7}. Finally, if the swaps elements 0 and 2, the sequence will remain {4, 7, 4}. These three outcomes are all distinct.
//1)
//{1, 47}
//Returns: 1
//Brus has to swap the only two elements, producing the sequence {47, 1}. Note that Brus has to make the swap, he cannot keep the original sequence.
//2)
//{9, 9, 9, 9}
//Returns: 1
//Regardless of which two elements Brus swaps, the resulting sequence will always be {9, 9, 9, 9}.
//3)
//{22, 16, 36, 35, 14, 9, 33, 6, 28, 12, 18, 14, 47, 46, 29, 22, 14, 17, 4, 15, 28, 6, 39, 24, 47, 37}
//Returns: 319
//This problem statement is the exclusive and proprietary property of TopCoder, Inc. Any unauthorized use or reproduction of this information without the prior written consent of TopCoder, Inc. is strictly prohibited. (c)2003, TopCoder, Inc. All rights reserved.

import java.math.BigInteger;
import java.util.Scanner;

public class TheSwapsDivTwo {
	public static BigInteger binomial(final int N, final int K) {
	    BigInteger ret = BigInteger.ONE;
	    for (int k = 0; k < K; k++) {
	        ret = ret.multiply(BigInteger.valueOf(N-k))
	                 .divide(BigInteger.valueOf(k+1));
	    }
	    return ret;
	}

	static int countDif(int[] seq){
		int[] store = new int[47];
		int storeSize = 0;
		for (int i = 0; i < seq.length-1; i++) {
			if(store[i]!= 1){
				store[i]=1;
				storeSize +=1;
			}
		}
		return storeSize;
	}
	static int find(int[] sequence){
		if(sequence.length == 2){
			return 1;
		}
		return binomial(sequence.length,countDif(sequence)).intValue();
	}
	public static void main(String[] args) {
		int[] seq = new int[] {11,1,3};

		System.out.print(find(seq));
	}

}
