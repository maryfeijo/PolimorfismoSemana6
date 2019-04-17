
public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mamifero mamifero = new Mamifero();
		Canguru canguru = new Canguru();
		Reptil reptil = new Reptil();
		Ave ave = new Ave();
		Peixe peixe = new Peixe();
		Cachorro cachorro = new Cachorro();
		
		canguru.locomover(); //vai aparecer saltando
		
		cachorro.reagir("vai embora");
		cachorro.reagir("bom dia");
		
		cachorro.reagir(12, 00);
		cachorro.reagir(18, 00);
		
		mamifero.alimentar();
		mamifero.emitirSom();
		mamifero.locomover();
				
		reptil.alimentar();
		reptil.emitirSom();
		reptil.locomover();
				
		ave.alimentar();
		ave.emitirSom();
		ave.locomover();
		
		peixe.alimentar();
		peixe.emitirSom();
		peixe.locomover();
	}

}

//quando o metodo for abstrato e eu colocar extends (herança),
//tenho que especificar para cada metodo, nao vai funcionar o extends
//pq, por ele ser abstrato, ele nao herda!
//polimorfismo é sobrescrever o método herdado.
