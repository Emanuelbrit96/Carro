
public class Carro {
	private int ano;
	private String modelo;
	private double preco;

	public Carro(int ano, String modelo, double preco) {

		if (ano < 1891) {
			this.ano = 2017;
			System.out.println("Ano Inválido, por conta disto trocamos o ano por 2017");
		} else {
			this.ano = ano;
			System.out.println("Ano " + this.ano);
		}

		if (modelo == null) {
			this.modelo = "Eco Sport";
			System.out.println("Modelo não informado, por conta disto adicionamos o modelo Eco Sport");
		} else {
			this.modelo = modelo;
			System.out.println("Modelo " + this.modelo);
		}

		if (preco < 0) {
			this.preco = 40000.0;
			System.out.println("Preço não informado, por conta disto preço é R$ 40.000,00");
		} else {
			this.preco = preco;
			System.out.println("Preço R$" + this.preco);
		}
	}

	public Carro(String modelo, double preco) {
		// chamando o construtor que recebe int, String e double. Nosso primeiro!
		this(2017, modelo, preco);
	}

	// ANO
	public int getAno() {
		return this.ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	// MODELO
	public String getModelo() {
		return this.modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	// PREÇO
	public double getPreco() {
		return this.preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}
}
