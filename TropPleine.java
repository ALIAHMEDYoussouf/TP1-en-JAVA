package Tp2;

public class TropPleine extends Citerne{
	
	public TropPlein (int num,String cuve,double capacite,double volumeOccupe,LocalDate date){
		super(num,cuve,capacite,VolumeOccuoe,date);
	}
	
	public boolean TrpPlein(double nbrVolume)
	{
	if (capacite +nbrVolume  <= MAXCAPACITE)
	{
		capacite = capacite +nbrVolume ;
	return true;
	}
	else
	{
		capacite = MAXCAPACITE;
	return false;
	}
	}
}
