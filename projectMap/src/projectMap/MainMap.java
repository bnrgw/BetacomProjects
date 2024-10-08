package projectMap;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MainMap {

	public static void main(String[] args) {
	
		Map<String,String> map = new HashMap<String,String>();
		
		map.put("k1", "1");
		map.put("k2", "2");
		map.put("k3", "3");
		map.put("k4", "4");
		map.put("k5", "5");
		map.put("k6", "6");
		map.put("k7", "7");
		map.put("k8", "8");
		
		System.out.println("Size:" + map.size());
		
	//mastrare come si puo ottenere il valore di una chiave, con il get(key)	
		String key = "k4";
		System.out.println("key 4:" + map.get(key));
		
		// uso di containKey per verificare se una mappa contiene una chiave 
		if(map.containsKey("k8"))
			System.out.println("key found");
		else
			System.out.println("key not found");
		
		// uso di containKey per verificare se una mappa contiene  un valore
		if(map.containsValue(7))
			System.out.println("value found");
		else
			System.out.println("value not found");
		
		//stampa di tutte le chiavi della map
	   Set<String> keys = map.keySet();// ritorna tutte le chiavi presente in map
	   for(String k:keys) {
		   System.out.println("Keys found:" + "valore" +map.get(k));
	   }
	   //uguale al ciclo fatto sopra
		Set <Entry<String,String>> entry = map.entrySet();//ha lo stesso scopo di keyset(),restituisce le chiavi di map
		for(Entry<String,String> e : entry) {//entry a questo punto è un entità di map, permette di avere sia la chiave che il valore
			System.out.println("keys found:" + e.getKey() + "valore: " + e.getValue());
		}
		
		
		for(String v: map.values()) {
			System.out.println("value found:" + v);
		}
	
		
	Map<String,TestMap> object = new HashMap<String,TestMap>();//si crea una mapa con chiave di tipo string e valore di tipo TestMap 
	TestMap obj = null;
	String k = "map";
		for(int i=0; i<10; i++) {
			k += String.valueOf(i);
			obj = new TestMap();
			obj.setC1("c1" + String.valueOf(i));
			obj.setC2("c2" + String.valueOf(i));
			object.put(k,obj);
		}
		System.out.println("object size:" + object.size());
		
		for(Entry<String,TestMap> e:object.entrySet()) {//qui si vuole fare la stampa di quello che c'è in object
			System.out.println("entry key found:" + e.getKey() + "valore" + ((TestMap)e.getValue()).toString());
		}
		
    TestMap mm = (TestMap)object.get("map012");//ritorna il testmap 012 di object
    System.out.println("object value:" + mm);
    
    
    List<Cliente> lc = new ArrayList<Cliente>(); 
    lc.add(new Cliente("Pippo","verde",60));
    lc.add(new Cliente("bianco","marco",60));
    lc.add(new Cliente("franco","misso",60));
    lc.add(new Cliente("leila","cara",60));
    lc.add(new Cliente("mana","blu",60));
    
    for(Cliente c:lc) {
    	System.out.println(c);
    }
    System.out.println("*******************After sort***********");
    
   /* lc.sort(new Compaerator <Cliente>() {
    	
    }
    
    		);*/
    
  /////////////////////LAMBDA ESPRESSIONI//////////////////////////////////////////////////
    
  lc.sort((Cliente a,Cliente b) -> a.getEta() - b.getEta()) ;
    
    for(Cliente it:lc) {
    	System.out.println(it);
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
}
