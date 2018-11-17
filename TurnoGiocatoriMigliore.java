import java.util.*;
public class TurnoGiocatoriMigliore {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner tastiera=new Scanner(System.in);
		int turno, i=0, numGiocatori=0;
		String termina="";
		System.out.println("Inserisci il numero di giocatori: ");
		numGiocatori=tastiera.nextInt();
		while(!termina.equals("si")) {
			turno=i%numGiocatori;
			System.out.println("Turno giocatore: "+(turno+1));
			System.out.println("Terminare?");
			termina=tastiera.next();
			i++;
		}
	}

}
