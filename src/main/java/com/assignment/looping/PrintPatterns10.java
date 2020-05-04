package com.assignment.looping;

//1 2 3 4 5 6 7 8 7 6 5 4 3 2 1
//1 2 3 4 5 6 7 6 5 4 3 2 1
//  1 2 3 4 5 6 5 4 3 2 1
//    1 2 3 4 5 4 3 2 1
//      1 2 3 4 3 2 1
//        1 2 3 2 1
//          1 2 1
//            1


public class PrintPatterns10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		  int n=8;
		  for(int i =0;i<n;i++)
			{
				int k = 1;
				for(int j = 1 ;j<=n;j++)
				{
					if(j<=i)
						System.out.print("  ");
					else
					{
						System.out.print(k+" ");					
				     	k++;
					}
				}
				
				k--;
			 for(int j = 1 ;j<n-i;j++)
				{
					k--;		
					System.out.print(k+" ");
					
				}
				System.out.println("\n");
			}
	}

}
