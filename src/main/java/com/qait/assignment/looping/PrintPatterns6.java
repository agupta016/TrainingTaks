package com.qait.assignment.looping;

//# # # # # # # # # # #                    
//  # # # # # # # # #                              
//    # # # # # # #               
//      # # # # #                    
//        # # #               
//          #  


public class PrintPatterns6 {

	public static void main(String[] args) {
		
		int n = 6;
		
		for(int i=0;i<n;i++) {
             for(int j=0;j<n;j++) {
				if(j<i)
					System.out.print("  ");
				else 
					System.out.print("# ");				
			}
             
			for(int j=1;j<n-i;j++) {
				
				System.out.print("# ");
				
			}
			System.out.println();
				
		}
		

	}

}
