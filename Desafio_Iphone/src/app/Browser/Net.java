package app.Browser;

public class Net implements Browser{

	@Override
	public void exibirPagina(String url) {
		System.out.println("Exibindo Pagina na Net");
		
	}

	@Override
	public void adicionarNovaAba() {
		System.out.println("Adcionando Pagina na Net");
		
	}

	@Override
	public void atualizarPagina() {
		System.out.println("Atualizando Pagina na Net");
		
	}

}
