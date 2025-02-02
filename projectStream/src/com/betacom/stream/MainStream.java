package com.betacom.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import com.betacom.stream.object.Persona;

public class MainStream {

	public static void main(String[] args) {
		
		//creazione stream object
		Stream<Persona> sp = Stream.of(
				new Persona("Paolo","Rossi",10),
				new Persona("Pietro","Verdi",20),
				new Persona("Anna","Gialli",40),
				new Persona("Giuseppe","Bianchi",50),
				new Persona("Rosa","Neri",17),
				new Persona("Giulia","Marroni",33)
				
				);
		
		//sp.forEach(System.out::println); 
		
		
		
		
		//create con builder
		Stream.Builder<String> streamBuilder = Stream.builder();
		
		//aggiungo elemnti ad una stream di strings
		streamBuilder.add("Lunedi").add("Martedi").add("Mercoledi").add("Giovedi").add("Venerdi");
	
		//Stream<String> stream = streamBuilder.add("Lunedi").add("Martedi").add("Mercoledi").add("Giovedi").add("Venerdi").build(); 
		//stream.forEach(System.out::println); 
		
		//transform in list
		Stream<String> stream = (Stream<String>) streamBuilder;
		List<String> ls =( stream.collect(Collectors.toList()));
		System.out.println("ls size =" +ls.size());
		
		//creazione random
		/*Random ran = new Random();
		Stream<Integer> lg =Stream.generate(() -> ran.nextInt(100)).limit(10));
		lg.forEach(it -> System.out.println( "Random:"+ it));
		
		//creazione Iterate
		Stream<Integer> si = Stream.iterate(4, n-> n+2).limit(10);
		si.forEach(it -> System.out.println( "iterate:"+ it));
		
		System.out.println("Dati primitivi **********");
		IntStream intStream = IntStream.range(10, 15);
		IntStream.forEach(it -> System.out.println("InitStream:" + it));
		
		//convert to array di string
		Stream<String> streamBuilder = Stream<String>builder().add("Lunedi").add("Martedi").add("Mercoledi").add("Giovedi").add("Venerdi");
		String[] giorni =streamBuilder1.toArray(size -> new String(size));
		
		System.out.println("Array length: "+ giorni.length +" arry[2]:" + giorni[2]);
		
		List<Persona> cp = Stream.of(
				new Persona("Paolo","Rossi",10),
				new Persona("Pietro","Verdi",60),
				new Persona("Anna","Gialli",70),
				new Persona("Giuseppe","Bianchi",55),
				new Persona("Rosa","Neri",17),
				new Persona("Giulia","Marroni",33)
				).collect(Collectors.toList());// collect è una terminal operazione di cui non si può più concatenare
		
		cp.forEach(it -> System.out.println(it));
		
		//creazione filtro sull'eta
		System.out.println("Filter**********");
		cp.stream().filter(s->s.getEta() > 50).forEach(s-> System.out.println(s));
		
		System.out.println(" Dopio Filter**********");
		cp.stream().filter(s->s.getEta() > 50).filter(s -> s.getCognome().startsWith("V")).forEach(s-> System.out.println(s));
		
		System.out.println("Count**********");
		long totalMatch = cp.stream().filter(s -> s.getEta() > 20).count();
		System.out.println("totalMAtch:"+ totalMatch);
		
		
		//map permette di mapare il contenuto
		
		System.out.println("**********MAP*********");
		
		List<String> listOfString = Arrays.asList("1","2","3","4","s");//alternativa per non fare new arrayList e aggiungere ogni element tramitte la add()
		System.out.println("Numero elements listOfString" + listOfString.size());
		
		/*List<Integer>listOfIntegers = listOfString.stream()
             .map(Integer :: valueOf)//per tutti i integer che troviamo vogliamo avere il loro value of
             .collect(Collectors.toList());*/
		
		//System.out.println("Map:" +listOfIntegers);
		
		//match
		
		List<Persona> lp = Stream.of(
				new Persona("Paolo","Rossi",10),
				new Persona("Pietro","Verdi",60),
				new Persona("Anna","Gialli",70),
				new Persona("Giuseppe","Bianchi",55),
				new Persona("Rosa","Neri",17),
				new Persona("Giulia","Marroni",33)
				).collect(Collectors.toList());
		
		boolean matchResult = lp.stream().anyMatch(s -> s.getNome().startsWith("P"));
		//System.out.println("Resilt match :" + matchResult );
		
		

	}

}
