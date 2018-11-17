import java.util.Scanner;
public class PariDispari {

	public static int isPari(int numero){
		if(numero%2==0)
			return 1;
		else
			return 0;
	}
	public static void main(String[] args)
	{
		Scanner tastiera=new Scanner(System.in);
		int num;
		System.out.println("Inserisci un numero: ");
		num=tastiera.nextInt();
		if(isPari(num)==1)
			System.out.println("Hai inserito un numero pari");
		else
			System.out.println("Hai inserito un numero dispari");
	}
}