package Looping;

public class Pattern14 {

	public static void main(String[] args) {
/*
55555
4444
333
22
1
 */
		int n=5;
		for(int i=n;i>=1;i--)
		{
			for(int j=i;j>=1;j--)
			{
				System.out.print(i);
			}
			System.out.println();
		}

	}

}
