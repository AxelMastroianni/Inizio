import java.util.*;
public class PositivoEPari {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner tastiera=new Scanner(System.in);
		int x;
		System.out.println("Inserisci un numero: ");
		x=tastiera.nextInt();
		if(x>=0 && x%2==0)
			System.out.println("yeah!");
		else
			System.out.println("sigh");
	}

}
