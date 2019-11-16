package com;

public class Pattern {

	public static void digits(int n) {
		int i, j;
		int sum = 1;

		for (i = 1; i <= n; i++) {

			for (j = 1; j <= i; j++) {
				System.out.print(sum + "  ");
				sum++;
			}
			System.out.println(" ");
			// sum=sum+1;
			
		}
	}

	public static void triangleChar() {
        char last = 'E', alphabet = 'A';
        
          for(int i=1;i<=(last-'A'+1);i++) {
        	  
        	  for(int j = 1; j<=i;j++) {
        		  
        		  System.out.print(alphabet+" ");
        	  }
        	  System.out.println();
        	  alphabet++;
          }
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		digits(4);
		triangleChar();
	}

}
