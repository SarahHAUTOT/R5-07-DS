import java.util.Scanner;
public class Q5
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Tappez un chiffre : ");

		int nb = sc.nextInt();
		for (int i=0; i<nb; i++) 
		{
			for (int y = nb - i; y > 0; y--)
				System.out.print("*");

			System.out.println();
			}
	}
}
