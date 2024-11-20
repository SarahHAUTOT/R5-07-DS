import java.util.Scanner;
public class Q3
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Tappez un chiffre : ");

		int nb = sc.nextInt();
		for (int i=1; i<=nb; i++) System.out.print("*");

		System.out.println();
	}
}
