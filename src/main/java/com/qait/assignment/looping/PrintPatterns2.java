package com.qait.assignment.looping;

//              # 
//            # #
//          # # #
//        # # # #
//      # # # # #
//    # # # # # #
//  # # # # # # #
//# # # # # # # #

public class PrintPatterns2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n = 8;
		for(int i =1; i<= n;i++)
		{
			for(int j=1;j<=n;j++) {
				if(n-j <i)
					System.out.print(" #");
				else
					System.out.print("  ");
				
			}
			
			System.out.println();
			
		}
		

	}

}
