
public class Funcionario extends Pessoa{
	//Composi��o de Funcion�rio com Endere�o
	// Para endere�o existir eu preciso de um funcionario, do contrario nao faz sentido
	private double salarioBase;
	private Endereco endereco;// Composi��o
	private Departamento departamento; // Agrega��o
	
	public void setSalarioBase(double salarioBase) {
		this.salarioBase = salarioBase;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	
	// ex de m�todo - Comportamenfo do objeto
	public double calcularSalarioComBonus() {
		return salarioBase * 1.10;
	}
	
	public String resumo() {
		return "Funcionario: " + getNome() +
				"\nIdade: " + getIdade() +
				"\nRua: " + endereco.getRua() +
				"\nCidade: " + endereco.getCidade() +
				"\nDepartamento: " + departamento.getNome() +
				"\nS�lario com B�nus: R$ " + calcularSalarioComBonus();
	}
}
