package view;

import model.ClienteModel;
import model.ServicoModel;

public class App {
	
	public static void main(String[] args) {
		String nome = "julia";
		System.out.println(nome);
		
		ServicoModel servico = new ServicoModel(1, "barba", 30);
		
		System.out.println(servico.getDescricaoString());
		System.out.println(servico.getValor());
		
		ClienteModel cliente = new ClienteModel(1, "Julia", "F", "987654", "tesla");
		System.out.println(cliente);
	}

}
