
	import java.text.DecimalFormat;
	import java.text.NumberFormat;

	import javax.swing.JOptionPane;

	public class Atleta {
	     
		//Atributos
		
		private int codigo;
		private String nome;
		private String esporte;
		private double valorPatrocinio;
		
		// Get e Set - Métodos Acessores
		
		public int getCodigo() {
			return codigo;
		}
		public void setCodigo(int codigo) {
			this.codigo = codigo;
		}
		public String getNome() {
			return nome;
		}
		public void setNome(String nome) {
			this.nome = nome;
		}
		public String getEsporte() {
			return esporte;
		}
		public void setEsporte(String esporte) {
			this.esporte = esporte;
		}
		public double getValorPatrocinio() {
			return valorPatrocinio;
		}
		public void setValorPatrocinio(double valorPatrocinio) {
			this.valorPatrocinio = valorPatrocinio;
		}
		public void inserirDados() {
			this.codigo = Integer.parseInt(JOptionPane.showInputDialog("Código:"));
			this.nome = JOptionPane.showInputDialog("Nome:");
			this.esporte = JOptionPane.showInputDialog("Esporte:");
			this.valorPatrocinio = Double.parseDouble(JOptionPane.showInputDialog("ValorPatrocinio:"));
			
		}
		public double atualizarValor(double taxa) {
			this.valorPatrocinio += this.valorPatrocinio * taxa / 100;
			return this.valorPatrocinio;
		}
		public void mostrar () {
			String msg = "Objeto atleta criado da classe Atleta";
			msg += "\nCódigo:" + this.codigo;
			msg += "\nNome:" + this.nome;
			msg += "\nEsporte:" + this.esporte;
			
			NumberFormat fmt = DecimalFormat.getCurrencyInstance();
			
			msg += "\nValor:" + fmt.format(this.valorPatrocinio);
			
			JOptionPane.showMessageDialog(null, msg);
			
		}
		
		}

