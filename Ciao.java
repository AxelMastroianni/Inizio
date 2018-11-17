import java.awt.Rectangle;
import java.io.File;
import java.io.FileNotFoundException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.concurrent.TimeUnit;
public class Ciao {
	public static ArrayList<String> reverse(ArrayList<String> names)
	{
	   ArrayList<String> result = new ArrayList<String>();
	   for (int i = names.size() - 1; i >= 0; i--)
	   { 
	      result.add(names.get(i));
	   }
	   return result;
	}
	public static int leggiIntero(String messaggio) {
		return 1;
	}
	public static void methodB(String s) {
		s="abc";
	}
	
	public static Date nuovaData(int anno, int mese, int giorno) {
		Calendar calendar=Calendar.getInstance();
		calendar.set(Calendar.DAY_OF_MONTH, giorno);
		calendar.set(Calendar.MONTH, mese);
		calendar.set(Calendar.YEAR,anno);
		return calendar.getTime();
	}
	public static long differenzaGiorni(Date d1, Date d2) {
		long diff=d2.getTime()-d1.getTime();
		long differenza=TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS);
		return differenza;
	}
		public static int[][] copiaMatrice(int[][] mat)
		{	
			int[][] copiata=new int[mat.length][];
		   copiata=mat.clone();
			return copiata;
		}

		static void stampaMatrice(int[][] x)
		{
		   for(int i=0;i<x.length;i++)
		   {
		      for(int j=0;j<x[0].length;j++)
		          System.out.print(x[i][j]+" ");
		          System.out.println();
		   }
		}
		public static long fattorialeRicorsivo(long n) {

			if(n==0)
				return 1;

			return n*fattorialeRicorsivo(n-1);

		}
		public static long fattorialeIterativo(long n) {
			long fattoriale=1;
			for(long i=n;i>=1;i--){
				fattoriale*=i;
			}
			return fattoriale;

		}
	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		Date data1=new Date();//precisione al millisecondo, poi uso calendar per manipolarla
		data1.getDay();//getDay è deprecato dalla versione 1 ma lo usano tutti in Calendar
		Calendar calendario=Calendar.getInstance();//riesce a capire che calenario usa la mia zona
		GregorianCalendar gCal=(GregorianCalendar)GregorianCalendar.getInstance();
		//calendar è una classe astratta che implementa delle interfacce, getInstance mi da un
		//Calendar quindi devo castarlo in GregorianCalendar
		calendario.setTime(data1);//gli passo una data
		//che giorno è?
		int giornoSettimana=calendario.get(Calendar.DAY_OF_WEEK);
		System.out.println("Oggi è "+giornoSettimana+" giorno della settimana");
		calendario.add(Calendar.DAY_OF_MONTH, 7);//giorni di una settimana, -7 va indietro di una
		System.out.println(data1.toString());
		SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy");
		System.out.println(sdf.format(data1));

		
		int somma=0;
		for(int u=78;u<176;u++)
			somma+=u;
		System.out.println(somma);
		int[][]	matrice=new int[5][];
		
		int [][] mat1 ={{1,2},{2,3},{4,5},{6,7}};
		int [][] matCopia = copiaMatrice(mat1);
		stampaMatrice(matCopia);
		System.out.println(fattorialeRicorsivo(4));
		System.out.println(fattorialeIterativo(4));
	}
	
}

