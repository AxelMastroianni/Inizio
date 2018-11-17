
public class Veicolo implements Inter {
	
		public int currentRewardPointBalance;
		private static int hola=2;

	   public int level1Cutoff = 15000;

	   private boolean blnEliteCustomer;


	   public void setElite() {

	      int level1Cutoff = 25000;

	      if (blnEliteCustomer)

	      {

	         this.level1Cutoff = 12500;

	      }

	   }
	   
	   public int getLevel1CutOff() {
		   return level1Cutoff;
	   }
	   
	   private static class Nodo{
		   int n;
	   }
	   private Nodo n=new Nodo();


	@Override
	public void hola() {
		// TODO Auto-generated method stub
		
	}

}
