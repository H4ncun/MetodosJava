import java.util.Scanner;

public class Main {


	public static void main(String[] args) {
		
		 Scanner menu = new Scanner (System.in);         
         
         while (true) {  

         System.out.print("-- Desafio Métodos DIO --\n\n");
         System.out.print("|-----------------------------------------|\n");
         System.out.print("| Opção 1 - Mostrar Operações basicas     |\n");
         System.out.print("| Opção 2 - Mensagem com horários         |\n");
         System.out.print("| Opção 3 - Valor Empréstimos             |\n"); 
         System.out.print("| Opção 4 - Para Sair                     |\n"); 
         System.out.print("|-----------------------------------------|\n");
         System.out.print("Digite uma opção: ");

         int opcao = menu.nextInt();         

         if (opcao == 4) {
        	 System.out.print("\n Saindo \n");
        	 System.out.print("\n Até logo!");
             menu.close();
             System.exit(0);
         }

         switch (opcao) {
         case 1:
        	System.out.print("\n--Digite um valor:\n\n");
            	int x = menu.nextInt();
            	
            System.out.print("--Digite outro valor:\n\n");
            	int y = menu.nextInt();
            
	         	Calculos.soma(x,y);
	         	Calculos.sub(x, y);
	         	Calculos.mult(x, y);
	         	Calculos.div(x, y);
	         	System.out.print("\n\n");	         
	        
             break;

         case 2:
         	System.out.print("\n--Digite o Horário:\n\n");
             	double hora = menu.nextDouble();
             	
             	Mensagens.comparaHorario(hora);
             	System.out.print("\n\n");
             break;

         case 3:
         	System.out.print("\n--Digite o valor do empréstimo:\n\n");
         		double valor = menu.nextDouble();
        	
        	System.out.print("--Digite a quantidade de parcelasr:\n\n");
        		int parcelas = menu.nextInt();
        		
        		Emprestimos.calculaEmprestimo(valor, parcelas);
             
        		System.out.print("\n \n");
             break;

         default:
             System.out.print("\nOpção Inválida!");
             break;
     }
 }


	}

}
