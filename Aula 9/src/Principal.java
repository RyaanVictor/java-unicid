import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		Funcionario funcionario = new Funcionario();
		Endereco endereco = new Endereco();
		Departamento departamento = new Departamento();
		
		funcionario.setNome(JOptionPane.showInputDialog("NOME"));
		funcionario.setIdade(Integer.parseInt(JOptionPane.showInputDialog("IDADE")));
		funcionario.setSalarioBase(Double.parseDouble(JOptionPane.showInputDialog("R$")));
		endereco.setRua(JOptionPane.showInputDialog("RUA"));
		endereco.setCidade(JOptionPane.showInputDialog("CIDADE"));
		
		// Composição
		funcionario.setEndereco(endereco);
		
		departamento.setNome(JOptionPane.showInputDialog("DEPARTAMENTO"));
		
		// Agregação
		//funcionario.setDepartamento(JOptionPane.showInputDialog("DEPARTAMENTO"));
		
		JOptionPane.showInputDialog(null, funcionario.resumo());
	}
 
}
