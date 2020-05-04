package com.assignment.looping;

//                           1
//                       1   2   1
//                   1   2   4   2   1
//               1   2   4   8   4   2   1
//           1   2   4   8  16   8   4   2   1
//       1   2   4   8  16  32  16   8   4   2   1
//   1   2   4   8  16  32  64  32  16   8   4   2   1
//1   2   4   8  16  32  64 128  64  32  16   8   4   2   1
// PowerOf2Triangle

public class PrintPatterns13 {

	public static void main(String[] args) {
		
		int n =8;
		
		for(int i =1 ;i<=n;i++)
		{
			int k=1;
			for(int j=0;j<n;j++) {			
								
				if(j>=n-i)
				{
					
				   System.out.print(k+"  ");				   
				   k = 2 *k;
				   
				}
				else
					System.out.print("   ");				
			}
			k/=4;
			
			for(int j=1;j<i;j++) {			
				
				
				System.out.print(k+"  ");
				k=k/2;
				
						
			}
			
			System.out.println();
		}
		


	}

}
