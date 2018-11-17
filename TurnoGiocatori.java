import java.util.*;
public class TurnoGiocatori {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner tastiera=new Scanner(System.in);
		int turno=1, i=0;
		while(i<100) {
			turno=1-turno;
			System.out.println("Turno giocatore: "+(turno+1));
			i++;
		}
	}

}
