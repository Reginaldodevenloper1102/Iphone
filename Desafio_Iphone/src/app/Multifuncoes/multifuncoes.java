package app.Multifuncoes;

import app.Browser.Browser;
import app.Iphod.Iphod;
import app.fone.Telefone;

public class multifuncoes implements Browser, Telefone, Iphod{

	
	public void exibirPagina(String url) {
		System.out.println("Exibindo via equipamento Multifuncional");
		
	}

	
	public void adicionarNovaAba() {
		System.out.println("Adicionando via equipamento Multifuncional");
	}

	
	public void atualizarPagina() {
		System.out.println("Atualizando via equipamento Multifuncional");
		
	}

	
	public void tocar() {
		System.out.println("Tocando via equipamento Multifuncional");
		
	}

	
	public void pausar() {
		System.out.println("Pausando via equipamento Multifuncional");
		
	}

	@Override
	public void selecionarMusica(String musica) {
		System.out.println("Selecionando via equipamento Multifuncional");
		
	}

	@Override
	public void ligar(String numero) {
		System.out.println("Ligando via equipamento Multifuncional");
		
	}

	@Override
	public void atender() {
		System.out.println("Atendendo via equipamento Multifuncional");
		
	}

	@Override
	public void iniciarCorreioVoz() {
		System.out.println("Iniciando via equipamento Multifuncional");
		
	}

}
