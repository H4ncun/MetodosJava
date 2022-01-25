
public class Emprestimos {

	public static void calculaEmprestimo(double valor, int parcelas) {
		
	
		switch(parcelas) {
		
		case 1:
			
			System.out.print("\n Valor a ser pago é: " + valor + "\n");
			
			break;
		
		case 2:
			
			double taxa2 = 0.50;
			
			double valorFinal = valor + (valor * taxa2);		
			
			System.out.print("\n Valor a ser pago é: " + valorFinal + "\n");
			
			break;
		
		case 3:
			
			double taxa3 = 1.00;
			
			double valorFinal3 = valor + (valor * taxa3);		
			
			System.out.print("\n Valor a ser pago é: " + valorFinal3 + "\n");
			
			break;
			
		case 4:
			
			double taxa4 = 1.50;
			
			double valorFinal4 = valor + (valor * taxa4);		
			
			System.out.print("\n Valor a ser pago é: " + valorFinal4 + "\n");
			
			break;
		
		case 5:
			
			double taxa5 = 2.00;
			
			double valorFinal5 = valor + (valor * taxa5);		
			
			System.out.print("\n Valor a ser pago é: " + valorFinal5 + "\n");
			
			break;
			
		case 6:
			
			double taxa6 = 2.50;
			
			double valorFinal6 = valor + (valor * taxa6);		
			
			System.out.print("\n Valor a ser pago é: " + valorFinal6 + "\n");
			
			break;
			
		case 7:
			
			double taxa7 = 3.00;
			
			double valorFinal7 = valor + (valor * taxa7);		
			
			System.out.print("\n Valor a ser pago é: " + valorFinal7 + "\n");
			
			break;
			
		case 8:
			
			double taxa8 = 3.50;
			
			double valorFinal8 = valor + (valor * taxa8);		
			
			System.out.print("\n Valor a ser pago é: " + valorFinal8 + "\n");
			
			break;
			
		case 9:
			
			double taxa9 = 4.00;
			
			double valorFinal9 = valor + (valor * taxa9);		
			
			System.out.print("\n Valor a ser pago é: " + valorFinal9 + "\n");
			
			break;
		
		default:
			
			System.out.print("\n Numero máximo de parcelas são 9 \n");
			
		}

	}
}
