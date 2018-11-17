import java.util.*;
public class PariODispari {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner tastiera=new Scanner(System.in);
		int x=0,y;
		System.out.println("Inserisci y: ");
		y=tastiera.nextInt();
		x=(y%2==0) ? y/2 : y/3;
		System.out.println(x);
		System.out.println(x << 2);
	}

}
