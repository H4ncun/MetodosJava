
public class Mensagens {

	public static void comparaHorario(double hora) {
		
		if (hora>=6 && hora <= 12){
			
			System.out.print("\n Bom Dia! \n");
		}
		else if(hora>=12 && hora <= 18){			
			System.out.print("\n Boa Tarde! \n");
			
		}
		else{			
			System.out.print("\n Boa Noite! \n");
		}
	}
}
