
public class autoHarjoitus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Auto auto = new Auto();
//		auto.merkki="Saab";
//		auto.malli="9-3";
//		auto.bensanMaara=10;
//		auto.naytaTiedot();
//		auto.tankkaa(70);
		
		Auto auto2 = new Auto("Saab", "9-3", 20);
		auto2.naytaTiedot();
	}

}//EndOfMain

class Auto
{
	public String merkki;
	public String malli;
	public int bensanMaara;

	//Oletusmuodostin
	public Auto()
	{
		merkki = "Saab";
		malli = "9-5";
		bensanMaara = 40;
	}
	
	public Auto(String merkki, String malli, int bensanMaara)
	{
		this.merkki = merkki;
		this.malli = malli;
		this.bensanMaara = bensanMaara;
	}
// Metodit
public void jarruta()
{
	System.out.println("Auto jarruttaa");
}

public void kiihdyta()
{
	if (bensanMaara > 0)
	{
		System.out.println("Auto kiihtyy");
		bensanMaara--;
	}
	else
	{
		System.out.println("");
	}
}
public void naytaTiedot()
{
	System.out.println("Merkki = " + merkki);
	System.out.println("Malli = " + malli);
	System.out.println("Bensan määrä = " + bensanMaara);
}
public void tankkaa (int tankkaus)
{
	System.out.println("Tankissa bensaa: " +bensanMaara);
	System.out.println("Tankkaus: " +tankkaus);
	System.out.println("Tankissa bensaa tankkauksen jälkeen: " +(bensanMaara+tankkaus));
}
}
