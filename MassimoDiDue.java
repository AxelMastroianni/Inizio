import java.util.*;
public class MassimoDiDue {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner tastiera=new Scanner(System.in);
		int a,b;
		System.out.println("Inserisci due numeri: ");
		a=tastiera.nextInt(); b=tastiera.nextInt();
		if(a>b)
			System.out.println("Il maggiore è: "+a);
		else
			System.out.println("Il maggiore è: "+b);
	}

}
