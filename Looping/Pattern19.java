package Looping;

public class Pattern19 {

	public static void main(String[] args) {
/*
AAAAA
BBBBB
CCCCC
DDDDD
EEEEE
 */
		int n=5;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				System.out.print((char)(i+64));
			}
			System.out.println();
		}

	}

}
