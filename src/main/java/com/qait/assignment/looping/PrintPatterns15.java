package com.qait.assignment.looping;

//             1
//           1   1
//       1   2   1
//      1   3   3   1
//    1   4   6   4   1
// 1   5  10  10   5   1
//1   6  15  20  15   6   1

public class PrintPatterns15 {

	static int fact(int num) {
		int factorial;

		for(factorial = 1; num > 1; num--){
			factorial *= num;
		}
		return factorial;
	    }
	    static int ncr(int n,int r) {
		return fact(n) / ( fact(n-r) * fact(r) );
	    }
	    public static void main(String args[]){
		int i, j;
        int n =8;
		

		System.out.println("Pascal Triangle:");
		for(i = 0; i < n; i++) {
			for(j = 0; j < n-i; j++){
				System.out.print(" ");
			}
			for(j = 0; j <= i; j++){
				System.out.print(" "+ncr(i, j));
			}
			System.out.println();
	 	}
	    }

}
