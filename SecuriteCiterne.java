package Tp2;

public class SecuriteCiterne implements Cloneable {
	private Citerne unObjet;
	@Override
	public Object clone() throws CloneNotSupportedException  {
			SecuriteCiterne acloner= (SecuriteCiterne)super.clone();
			acloner.unObjet=(Citerne)unObjet.clone();
		
			return acloner;
		
	}
}
