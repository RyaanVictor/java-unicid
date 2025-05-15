
public class TecnicoAdministrativo extends Funcionario {

	private double adicionalNoturno;
	
	public TecnicoAdministrativo(String nome, int horasTrabalhadas, double valorHora, double adicionalNoturno) {
		super(nome, horasTrabalhadas, valorHora);
		this.adicionalNoturno = adicionalNoturno;
	}

	public double getAdicionalNoturno() {
		return adicionalNoturno;
	}

	public void setAdicionalNoturno(double adicionalNoturno) {
		this.adicionalNoturno = adicionalNoturno;
	}

	@Override
	public double calcularSalario() {
		return super.calcularSalario() + adicionalNoturno;
	}

	@Override
		public String exibirResumo() {
			return "T�cnico Administrativo\n" + "Nome: " + getNome() + "\n" + "Horas Trabalhadas: " + 
	getHorasTrabalhadas() + "\n" + "valor da Hora: R$ " + getValorHora() + "\n" + "Adicional Noturno: "
			+ adicionalNoturno + "\n" + "Sal�rio: R$" + calcularSalario();
	}
	
}
