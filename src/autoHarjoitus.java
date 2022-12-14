
public class autoHarjoitus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Auto auto = new Auto();
		auto.merkki="Saab";
		auto.malli="9-3";
		auto.bensanMaara=10;
		auto.kiihdyta();
	}

}//EndOfMain

class Auto
{
	public String merkki;
	public String malli;
	public int bensanMaara;

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
}
