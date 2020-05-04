package com.assignment.looping;

//# # # # # # #
//# #       # #
//#   #   #   #
//#     #     #
//#   #   #   #
//# #       # #
//# # # # # # #


public class PrintPatterns5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n = 7;
		for(int i =1 ;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				if(i==1 || i== n || j==1 || j==n || j==i)
					System.out.print("# ");
				else if(j==n+1-i)
					System.out.print("# ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}

	}

}
