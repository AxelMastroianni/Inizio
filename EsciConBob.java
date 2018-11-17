import java.util.*;
public class EsciConBob {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner tastiera=new Scanner(System.in);
		boolean ferrari, mocassini, occhialiDaSole;
		System.out.println("Bob è venuto in ferrari? ");
		ferrari=tastiera.nextBoolean();
		if(ferrari) {
			System.out.println("Bob ha i mocassini? ");
			mocassini=tastiera.nextBoolean();
			if(!mocassini)
				System.out.println("Esci con Bob");
			else
				System.out.println("Non uscire con lui");
		}
		else {
			System.out.println("Bob ha gli occhiali da sole? ");
			occhialiDaSole=tastiera.nextBoolean();
			if(!occhialiDaSole)
				System.out.println("Esci con Bob e digli che è un Pezzente!");
			else
				System.out.println("Non uscire con lui ma digli che è un Pezzente!");
		}
	}

}
