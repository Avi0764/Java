package Looping;

public class Pattern21 {

	public static void main(String[] args) {
/*
eeeee
ddddd
ccccc
bbbbb
aaaaa
 */

		int n=5;
		for(int i=n;i>=1;i--)
		{
			for(int j=n;j>=1;j--)
			{
				System.out.print((char)(i+96));
			}
			System.out.println();
		}


	}

}
