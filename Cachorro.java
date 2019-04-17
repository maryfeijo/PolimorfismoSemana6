
public class Cachorro extends Mamifero {

	public void reagir (String frase)
	{
		if(frase.equalsIgnoreCase("bom dia"))
		{
			System.out.println("Abanar");
		}
		else
		{
			System.out.println("rosnar");
		}
	}
	
	public void reagir (int hora, int minuto)
	{
		if(hora<12)
			System.out.println("Abanar");
		else if (hora<18)
			System.out.println("Abanar e latir");
		else
		System.out.println("Ignorar");	
	}
}
