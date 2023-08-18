package Teddy.Controller;

import Teddy.repository.TeddyRepository;

import java.util.ArrayList;

import MyHeroicTeddyUniverse.Teddy;
import MyHeroicTeddyUniverse.model.SpecificTeddy;


public class TeddyController implements TeddyRepository{

	private ArrayList<Teddy>listarTeddy = new ArrayList<Teddy>();
	int numero = 0;
	
	
	@Override
	public void procurarPorNumero(int numero) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void listarTodas() {
		for (var Teddy: listarTeddy) {
			Teddy.visualizar();
		}		
	}

	@Override
	public void deletar(int numero) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void listarProdutos() {
		// TODO Auto-generated method stub
		
	}

}
