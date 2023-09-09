package Looping;

public class Pattern13 {

	public static void main(String[] args) {
/*
55555
44444
33333
22222
11111

 */
		int n=5;
		for(int i=n;i>=1;i--)
		{
			for(int j=n;j>=1;j--)
			{
				System.out.print(i);
			}
			System.out.println();
		}

	}

}
