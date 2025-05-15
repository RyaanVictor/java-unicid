import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		String[] opcoes = {"Funcionário comum","Professor","Técnico Administrativo"};
		
		int escolha = JOptionPane.showOptionDialog(null, 
				"Escolha o tipo de funcionario", 
				"Cadastro de Funcionário", 
				JOptionPane.DEFAULT_OPTION, 
				JOptionPane.QUESTION_MESSAGE,
				null, opcoes, opcoes[0]);
		String nome = JOptionPane.showInputDialog("Nome");
		int horas = Integer.parseInt(JOptionPane.showInputDialog("Horas Trabalhadas"));
		double valorHora = Double.parseDouble(JOptionPane.showInputDialog("Valor da Hora R$: "));

		Funcionario funcionario = null;
		
		//polimorfismo
		if(escolha == 0) {
			funcionario = new Funcionario(nome, horas, valorHora);
		}else if(escolha == 1) {
			int aulas = Integer.parseInt(JOptionPane.showInputDialog("Aulas"));
			funcionario = new Professor(nome, horas, valorHora, aulas);
		}else if(escolha == 2) {
			double adicional = Double.parseDouble(JOptionPane.showInputDialog("Valor do Adicional Noturno R$"));
			funcionario = new TecnicoAdministrativo(nome, horas, valorHora, adicional);
		}
		
		JOptionPane.showMessageDialog(null, 
				funcionario.exibirResumo(),
				"Resumo Funcionário",
				JOptionPane.INFORMATION_MESSAGE);
	}

}
