/* polimorfismo é principio pelo qual duas ou mais classes derivadas de uma mesma superclasse
 *  podem invocar métodos que tem a mesma identificação (assinatura), mas com comportamento 
 *  distintos, ou seja, especializados para cada classe derivada, usando para tanto uma
 *  referência a um objeto da superclasse.
 */
public class Funcionario {
	private String nome;
	private int horasTrabalhadas;
	private double valorHora;
	
	//construtor
	public Funcionario(String nome, int horasTrabalhadas, double valorHora) {
		super();
		this.nome = nome;
		this.horasTrabalhadas = horasTrabalhadas;
		this.valorHora = valorHora;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getHorasTrabalhadas() {
		return horasTrabalhadas;
	}
	public void setHorasTrabalhadas(int horasTrabalhadas) {
		this.horasTrabalhadas = horasTrabalhadas;
	}
	public double getValorHora() {
		return valorHora;
	}
	public void setValorHora(double valorHora) {
		this.valorHora = valorHora;
	}
	
	// Ex. polimorfico
	public double calcularSalario() {
		return horasTrabalhadas * valorHora;
	}
	
	public String exibirResumo() {
		return "Funcionário comum\n" + "Nome: " + nome + "\n" + "Valor Hora: R$ " + 
	valorHora + "\n" + "Sálario: R$ " + calcularSalario();
	}
	
}
