
public class Utente {
	
	private String nome;
	private String genero;
	private String idade;
	private float altura;
	private int peso;
	
	public Utente(String nome, String genero, String idade, float altura, int peso) {
		super();
		this.nome = nome;
		this.genero = genero;
		this.idade = idade;
		this.altura = altura;
		this.peso = peso;
		
	}

	public String getIdade() {
		return idade;
	}

	public void setIdade(String idade) {
		this.idade = idade;
	}

	public float getAltura() {
		return altura;
	}

	public void setAltura(float altura) {
		this.altura = altura;
	}

	public int getPeso() {
		return peso;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}

	@Override
	public String toString() {
		return "Utente [nome=" + nome + ", genero=" + genero + ", idade=" + idade + ", altura=" + altura + ", peso="
				+ peso + "]";
	}

	public float UtenteIMC() {
		return peso/(altura*altura);
	}
	public void imprimirIMC() {
	    System.out.println("IMC: " + UtenteIMC());
	}

	}

