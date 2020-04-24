package com.qait.assignment.looping;

//A                                 *
//L  *                          *
//T      *                   *   
//M         *            *
//E            *     * 
//T               *             
//R          *       *  
//I       *             *
//C   *                     * 
//S                            *



public class PrintAnimalPattern {

	public static void main(String[] args) {
		
		String str = "ALTMETRICS";
		int i,j;
		
		for(i=0;i<str.length();i++)
		{
			
			for(j=0;j<str.length();j++)
			{
				if(j==0)
					System.out.print(str.charAt(i));
				else {
				   if(i==str.length()/2)
				    {
					if(j==str.length()/2) {
						System.out.print(" * ");
						continue;
	
					}
					else {
						System.out.print("   ");
						continue;
			
					}
				   }	
				  else
				   {				
				    if(j==i && (j!=0))
				    	System.out.print(" * ");
				    else
				      if(((str.length()-1) - j) == i  && i!=str.length()-1)
				    	System.out.print("  * ");
				   else
				    	System.out.print("   ");
				}
					
			} 
				}
			System.out.println();
		}
		

	}

}
