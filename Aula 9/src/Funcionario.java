
public class Funcionario extends Pessoa{
	//Composição de Funcionário com Endereço
	// Para endereço existir eu preciso de um funcionario, do contrario nao faz sentido
	private double salarioBase;
	private Endereco endereco;// Composição
	private Departamento departamento; // Agregação
	
	public void setSalarioBase(double salarioBase) {
		this.salarioBase = salarioBase;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	
	// ex de método - Comportamenfo do objeto
	public double calcularSalarioComBonus() {
		return salarioBase * 1.10;
	}
	
	public String resumo() {
		return "Funcionario: " + getNome() +
				"\nIdade: " + getIdade() +
				"\nRua: " + endereco.getRua() +
				"\nCidade: " + endereco.getCidade() +
				"\nDepartamento: " + departamento.getNome() +
				"\nSálario com Bônus: R$ " + calcularSalarioComBonus();
	}
}
