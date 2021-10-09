package atividadeArray;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Arralist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> list = new ArrayList<String>();
		
		list.add("Bia");
		list.add("Alex");
		list.add("Chaico");
		list.add("Maria");
		list.add("Anna");
		list.add(1, "Caio");
		
		for(String x : list) {
			System.out.println(x);
		}
		
		//list.removeIf(x -> x.charAt(0) == 'A');
		
		System.out.println("----------");
		for(String x : list) {
			System.out.println(x);
		}
		
		/*List<String> resultado = list.stream().filter(x -> x.charAt(0) == 'C').collect(Collectors.toList());
		
		System.out.println("---- Filtro----");
		for(String x : resultado) {
			System.out.println(x);
		}
		*/
		
		System.out.println("---- Filtro----");
		String nome = list.stream().filter(x -> x.charAt(0) == 'A').findFirst().orElse(null);
		
		System.out.println(nome);
		
	}

}
