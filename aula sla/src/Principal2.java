
public class Principal2 {

	public static void main(String[] args) {
		JogadorDeFutebol neymar = new JogadorDeFutebol();
		neymar.setTime("Santos");
		neymar.setNumeroCamisa(10);
		//neymar.mostrar();
		System.out.println("Time: " + neymar.getTime());
		System.out.println("Camisa: " + neymar.getNumeroCamisa());
		
		Lutador diego = new Lutador();
		//diego.inserirDados();
		diego.setCategoria("Master 2");
		diego.setPeso(88);
		//diego.mostrar();
		System.out.println("Categoria: " + diego.getCategoria());
		System.out.println("Peso: " + diego.getPeso());
		
	}

}
