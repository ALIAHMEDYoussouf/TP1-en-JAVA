package Tp2;

public class TestCiterne {

	public static void main(String[] args) {
	
		Citerne c1=new Citerne(1,"Vin",13,"2019-10-22",9.5);
		Citerne c2=new Citerne(2,"Vin",15,"2019-10-14",5.5);
		
		System.out.println(c1.compareA(c2)); 
		SecuriteCiterne m= new SecuriteCiterne(1,u1);
		try {
			Mere m2=(Mere)m.clone();
			System.out.println(m.getUnObjet());
			
			System.out.println(m2.getUnObjet());
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
