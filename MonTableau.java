package Tp2;
import java.util.*;

public class MonTableau implements EstComparable{
	protected int[] tab;
	

	public MonTableau(int[] tab)throws NullPointerException,ClassCastException {
    	if(tab==null) {
    		throw new NullPointerException("ne peux pas etre null");
    	}
		this.tab=tab;
    	}
    
    public  int[] getTab() {
    	return tab;
    }
    
	@Override
	//public String toString() {
	//	return "MonTableau [somme=" + somme + "]";
	//}
	
	public int compareA(Object o) {
		MonTableau obj=(MonTableau)o;
		int som1=0;
		int som2=0;
		for (int nb1 : this.tab){	
			som1+=nb1;
			}
       for (int nb2 : obj.getTab()){
			
			
			som2+=nb2;
			}
		
		if(som1==som2) {
			return 0; } 
        
		else if (som1 >som2)
			{ 
			return 1;  }
		else 
			return -1;
		  
	} }
	
	


