
public class Professor extends Funcionario{
	
	private int numeroAulas;
	
	public Professor(String nome, int horasTrabalhadas, double valorHora, int numeroAulas) {
		super(nome, horasTrabalhadas, valorHora);
		this.numeroAulas = numeroAulas;
}

	public int getNumeroAulas() {
		return numeroAulas;
	}

	public void setNumeroAulas(int numeroAulas) {
		this.numeroAulas = numeroAulas;
	}
	@Override
	public double calcularSalario() {
		double salarioBase = numeroAulas * 4.5 * getValorHora();
		double dsr = salarioBase / 6.0;
		return super.calcularSalario();
	}

	@Override
	public String exibirResumo() {
		return "Professor\n" + "Nome: " + getNome() + "\n" + "Horas Trabalhadas: " + 
getHorasTrabalhadas() + "\n" + "valor da Hora: R$ " + getValorHora() + "\n" + "Aulas "
		+ "Ministradas: " + numeroAulas + "\n" + "Salário: R$" + calcularSalario();
	}
	
	
	
}
