
//clicar em cima da classe > source > 
//generate getters and setters

public abstract class Animal {
	private float peso;
	private int idade;
	private int membros;

	public abstract void locomover();
	
	public abstract void alimentar();
	
	public abstract void emitirSom();
	
	public float getPeso() {
		return peso;
	}

	public void setPeso(float peso) {
		this.peso = peso;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public int getMembros() {
		return membros;
	}

	public void setMembros(int membros) {
		this.membros = membros;
	}



}
