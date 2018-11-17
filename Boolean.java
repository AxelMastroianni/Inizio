import java.util.*;

public class Boolean {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner tastiera=new Scanner(System.in);
		boolean p;
		int x;
		System.out.println("Inserisci un numero: ");
		x=tastiera.nextInt();
		if(x%2==0)
			p=true;
		else
			p=false;
		if(p)
			System.out.println("Numero pari");
		else
			System.out.println("Numero dispari");
	}

}
