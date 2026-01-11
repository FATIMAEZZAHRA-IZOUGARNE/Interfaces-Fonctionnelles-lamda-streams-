
public class TestLamda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		Operation addition = (x,y)-> x+y;
		Operation soustraction = (x,y)->x-y;
		Operation multiplication =(x,y)->x* y;
		Operation division =(x,y)->{
			if(y==0) {
				 throw new ArithmeticException("Division par zéro impossible");
			}
			return x/y;
		};
		
		
		System.out.println("5 + 3 = " + addition.calculer(5, 3));
		System.out.println("5 + 3 = " + soustraction.calculer(5, 3));
		System.out.println("5 + 3 = " + multiplication.calculer(5, 3));
		
		
		  // try / catch pour la division
        try {
            System.out.println("6 / 0 = " + division.calculer(6, 0));
        } catch (ArithmeticException e) {
            System.out.println("Erreur : " + e.getMessage());
        }
	
		
		
		//Operation addition=(x,y)->x+y;
		//System.out.println("5 + 3 = "+addition.calculer(5,3));
		
		//Operation op= new Operation() {
		//	@Override
			//public double add(double x, double y) {
				//return x+y;
			//}
			//@Override
			//public double soustraction(double x, double y) {
		//		return x-y;
			//}
			//@Override
			//public double multiplication(double x, double y) {
				//// TODO Auto-generated method stub
				//return x*y;
			//}
			//@Override
			//public double division(double x, double y) {
				// TODO Auto-generated method stub
				//if(y==0) {
					//System.out.println("la division par 0 est impossible !!");
					//return Double.NaN;
				//}else {
				//	return x/y;
				//}
			//}

	    //};
	    
	    //System.out.println("12 + 10 = " + op.add(12,10));
	    //System.out.println("12 - 10 = " + op.soustraction(12,10));
	    //System.out.println("7 * 8 = " + op.multiplication(7,8));
	    //System.out.println("24/12 = " + op.division(24,12));
	    
	    //System.out.println("21/17 = " + op.division(21,17));
	    //System.out.println("9/0 = " + op.division(9,0));
	    
	}
}
