
public class Calculos {

	
	public static void soma(float x, float y) {
		
		float soma = x + y;
		
		System.out.print("\n Soma �:" + soma + "\n ");	
	}
	
	public static void sub(float x, float y) {
		
		float sub = x - y;
		
		System.out.print("\n Subtra��o �:" + sub + "\n ");	
		
	}
	
	public static void div(float x, float y) {
		
		if (y > 0 ) {
			
			float div = (x / y);
			
			System.out.print("\n Divis�o �:" + div + "\n ");		
		} 
		
		else {
			
			System.out.print("\n Impossiv�l dividir por zero");	
		}		
		
	}
	
	public static void mult(float x, float y) {
		
		float mult = x * y;
		
		System.out.print("\n Multiplica��o �:" + mult + "\n ");	
	}
	
	
	
	
	
}
