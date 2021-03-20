package javaBasics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class ListaDeStrings {

	public static void main(String[] args) {
		
		
		List<String> listaDeNombre = new ArrayList<>();
		listaDeNombre.add("Persona 1");
		listaDeNombre.add("Persona 2");
		listaDeNombre.add("Persona 2");
		listaDeNombre.add("Persona 3");
		listaDeNombre.add("Persona 4");
		
		System.out.println(listaDeNombre);
		Collections.sort(listaDeNombre, Collections.reverseOrder());
		System.out.println(listaDeNombre);
		
		List<String>nombreSinRepetir = listaDeNombre
				.stream()
				.distinct().
				collect(Collectors.toList());
		System.out.println(nombreSinRepetir);
		
	}

}
