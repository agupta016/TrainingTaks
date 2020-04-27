package com.qait.assignment.looping;


//              1
//            2 3 2
//          3 4 5 4 3
//        4 5 6 7 6 5 4
//      5 6 7 8 9 8 7 6 5
//    6 7 8 9 0 1 0 9 8 7 6
//  7 8 9 0 1 2 3 2 1 0 9 8 7 
//8 9 0 1 2 3 4 5 4 3 2 1 0 9 8

class PrintPatterns12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n =8;
		int k =1;
		for(int i =1 ;i<=n;i++)
		{
			
			for(int j=0;j<n;j++) {			
					
				if(k>9)
					k=0;
				
				if(j>=n-i)
				{
					
				   System.out.print(k+" ");
				   k++;
				   
				}
				else
					System.out.print("  ");				
			}
			k--;
			for(int j=1;j<i;j++) {			
				
				k--;	
				if(k>9)
					k=0;
				if(k<0)
					k=9;
				System.out.print(k+" ");
				
						
			}
			k++;
			System.out.println();
		}
		

	}

}
