package Looping;

public class Pattern22 {

	public static void main(String[] args) {
/*
edcba
edcba
edcba
edcba
edcba

 */
		int n=5;
		for(int i=n;i>=1;i--)
		{
			for(int j=n;j>=1;j--)
			{
				System.out.print((char)(j+96));
			}
			System.out.println();
		}


	}

}
