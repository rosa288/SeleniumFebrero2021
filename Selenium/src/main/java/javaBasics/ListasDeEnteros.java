package javaBasics;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ListasDeEnteros {

	public static void main(String[] args) {
		
		List<Integer>listaDeNumeros = new ArrayList<>();
		listaDeNumeros.add(1);
		listaDeNumeros.add(2);
		listaDeNumeros.add(3);
		listaDeNumeros.add(4);
		listaDeNumeros.add(5);
		
		System.out.println(listaDeNumeros);
		Collections.sort(listaDeNumeros);
		System.out.println(listaDeNumeros);
		Collections.sort(listaDeNumeros,Collections.reverseOrder());
		System.out.println(listaDeNumeros);
		System.out.println(Collections.max(listaDeNumeros));
		System.out.println(Collections.min(listaDeNumeros));
		Object last = null;
		int numCount=0;
		Iterator<Integer> i = listaDeNumeros.iterator();
		
		while(i.hasNext()) {
			Object temp= i.next();
			if(temp.equals(last)) {
				i.remove();
			}else{
				last=temp;
			}
		}
		System.out.println(listaDeNumeros);
	}

	
	
	
	
}
