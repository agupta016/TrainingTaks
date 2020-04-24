package com.qait.assignment.looping;

//      # # # # # # # # # # #                          
//              # # #                      
//            # # # # #                  
//          # # # # # # #              
//        # # # # # # # # #         
//      # # # # # # # # # # #      
//        # # # # # # # # #
//          # # # # # # #
//            # # # # #
//              # # #
//      # # # # # # # # # # #

public class PrintPatterns7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n=6;
		for(int i =1; i<= n;i++)
		{
			for(int j=1;j<=n;j++) {
				if(i==1)
					System.out.print("# ");
				else if(n-j <i)
					System.out.print("# ");
				else
					System.out.print("  ");
				
			}
			
			for(int j=n-1;j>=1;j--) {
					if(i==1)
						System.out.print("# ");
					else if(n-j <i)
						System.out.print("# ");
					else
						System.out.print("  ");
					
				}
			System.out.println();
		}
		
		
		
		for(int i =1; i<=n-1;i++)
		{
			for(int j =1;j<=n;j++)
			{
				if(i==n-1)
					System.out.print("# ");
				else
					if(j<=i)
						System.out.print("  ");
					else 
						System.out.print("# ");	
				
					
			}
			for(int j =1;j<=n-1;j++)
			{
				if(i==n-1)
					System.out.print("# ");
				else if(n-j<=i)
					System.out.print("  ");
				else 
					System.out.print("# ");	
				
					
			}
			System.out.println();
		}

	}

}
