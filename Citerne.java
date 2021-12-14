package Tp2;
import java.lang.*;
import java.util.*;
import java.time.LocalDate; 
public class Citerne implements EstComparable{
	private int num;
	private double capacite;
	private LocalDate date ;
	private static int nbCiterne;
	private static final int MAXCAPACITE=20000;
	private double VolumeOccupe;
	private String cuve;
	public Citerne (int num,String cuve,double capacite,double 	VolumeOccupe,LocalDate date)throws NullPointerException {
		
		if (capacite<=0) {
			throw new NullPointerException("capacite different de null et negatif");
		}
		this.num=num;
		this.capacite=capacite;
		this.date=date;
		nbCiterne++;
		this.cuve=cuve;
	}
	
	public double getVolumeOccupe() {
		return VolumeOccupe;
	}
	public double getCapacite() {
		return capacite;
	}

	public enum cuve{
	    leau(10),
	    Vin(15)  ,
	    Huile (9);;

		cuve(int i) {	
		}
		}
	
	public int plusAncien(Citerne c1, Citerne c2) {
				
				if(c1.date.compareTo(c2.date) < 0) {
			        return c2;
			      } 
				else {
					return c1;}
	}
	
	public int ajouterliquide(Citerne c1, Citerne c2) {
		
		if(c1.date.compareTo(c2.date) < 0) {
	        return c2;
	      } 
		else {
			return c1;}
		
		
		public void ajouterliquide(double nbr){
			if (capacite + nbr <= MAXCAPACITE)
			{
			capacite = capacite + nbr;
			}
			else
			{
			capacite = MAXCAPACITE;
			}	
		}
		
		public void retirerLiquide(double nbr)
		{
		if (nbr <= capacite)
		{
			capacite = capacite - nbr;
		}
		else
		{
			capacite = 0;
		}
		}
		
		public String toString(){
			
			return	"\nnumero : "+num+"\n"
		    +"cuve : "+cuve+"capacite : "+capacite+"\n"+
			"le date est : "+dat.get(Calendar.DAY_OF_MONTH)+
			"-"+date.get(Calendar.MONTH)+
			"-"+date.get(Calendar.YEAR)+"\n"+
			volumeOcuppe;	
		}
		public int compareA(Object o) {
			Citerne obj=(Citerne)o;
			int c1=0;
			int c2=0;
			for (int nb1 : this.getVolumeOccupe){	
				c1+=nb1;
				}
	       for (int nb2 : obj.getVolumeOccupe()){
				
				
				c2+=nb2;
				}
			
			if(nb1<nb2) {
				return c1<c2; } 
	        
			else 
				return c2>c1;
			  
		} 
		public int compareCapacite(Object o) {
			Citerne obj=(Citerne)o;
			int c1=0;
			int c2=0;
			for (int nb1 : this.getCapacite()){	
				c1+=nb1;
				}
	       for (int nb2 : obj.getCapacite()){
				
				
				c2+=nb2;
				}
			
			if(nb1<nb2) {
				return c1<c2; } 
	        
			else 
				return c2>c1;
			  
		} 
		

	
}