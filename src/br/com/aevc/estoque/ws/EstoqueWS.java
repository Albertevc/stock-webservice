package br.com.aevc.estoque.ws;

import java.util.ArrayList;
import java.util.List;

import javax.jws.WebService;

import br.com.aevc.estoque.modelo.item.Item;
import br.com.aevc.estoque.modelo.item.ItemDao;

@WebService
public class EstoqueWS {
	private ItemDao dao = new ItemDao();
	
	public List<Item> getItens(){
		System.out.println("Chamando getItens()");
		ArrayList<Item> lista = dao.todosItens();
		return lista;
	}
}
