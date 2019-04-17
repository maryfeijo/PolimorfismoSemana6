
public class Peixe extends Animal {
	private String corEscama;



public void soltarBolha() //só para a classe peixe
{
	
}

public String getCorEscama() {
	return corEscama;
}

public void setCorEscama(String corEscama) {
	this.corEscama = corEscama;
}

@Override
public void locomover() {
	// TODO Auto-generated method stub
	System.out.println("Nadando!!");
}

@Override
public void alimentar() {
	// TODO Auto-generated method stub
	System.out.println("Algas marinhas!!!");
}

@Override
public void emitirSom() {
	// TODO Auto-generated method stub
System.out.println("Glub glub.");	
}
}
