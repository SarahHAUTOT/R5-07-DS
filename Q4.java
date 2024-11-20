import java.util.Scanner;
public class Q4
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Tappez un chiffre : ");

		int nb = sc.nextInt();
		for (int i=1; i<=nb; i++) 
		{
			for (int y = 1; y <= i; y++)
				System.out.print("*");

			System.out.println();
		}
	}
}
