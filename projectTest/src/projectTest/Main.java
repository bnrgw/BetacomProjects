package projectTest;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.betacom.objects.User;

public class Main {
	public static void main(String[] args) {
		
  //System.out.println("ciao sono dentro la JVM");
		//funzione generale che permette di recuperare dati.
		/*Scanner scan = new Scanner(System.in);
		String nome;
		
		System.out.println("Nome");
		nome=scan.nextLine();
		
		int età = 24;
		
		System.out.println("ciao sono" + " " + nome +" " + "ho" +" " + età +" " + "anni");
		// condizionamento in java
		// var = condizione? output1 : output altrimenti
  
		
		// TRASFORMARE UNA STRINGA IN UN INTERO
		String  v ="1223";
		//int  i = parseInt(v);
		double f= Double.parseDouble(v);
		
		/////////////////////////////////////////////////////////////////////////////////
		String[] array = new String[3];
		array[0] = "aaaa";
		array[1] = "bbbb";
		array[2] = "cccc";
		
		System.out.println("Array length:" +  array[1]  );
		
		///////////modo semplice di fare la for////////////////
		for(String it:array) {
		}
	////////OGGETTI CONTENITORI///////////////////
		List<String> myString = new ArrayList<String>();*/
		
/////////////////////////nuovo oggeto OBJECTCOLLECTION////////////////////////////////////
		/*List<objectCollection> oc = new ArrayList<objectCollection>();
		oc.add(new objectCollection("pippo","verde"));
		oc.add(new objectCollection("mama","lala"));
		oc.add(new objectCollection("vehd","lamda"));
		
		for(objectCollection it:oc) {
			System.out.println("array" + it);
			if(it.getSurname().equalsIgnoreCase("hugo"))
				oc.remove(it);
		}
		
//////////////////// array multidimensinali//////////////////////
		String[][] arr = new String[3][5];
		
		arr[0][0] = "pos 00";
		arr[0][1] = "pos 01";
		arr[0][2] = "pos 02";
		arr[0][3] = "pos 03";
		
		
		
		for(int x=0; x<arr.length;  x++) {
			for(int y=0; y<arr[0].length;  y++) {
				arr[x][y] = "pos" + x + y;
				System.out.println(arr[x][y]);
			}
}
////////////////////////////////////////////////////////////////////////		
	
	List mylist = new ArrayList<List>();
	List<objectCollection> oc = new ArrayList<objectCollection>();
	

	
	
	oc.add(new objectCollection("n1","c1"));
	oc.add(new objectCollection("n2","c2"));
	oc.add(new objectCollection("n3","c3"));
	mylist.add(oc);
	
	 oc = new ArrayList<objectCollection>();
	 oc.add(new objectCollection("n4","c4"));
		oc.add(new objectCollection("n5","c5"));
		oc.add(new objectCollection("n6","c6"));
		oc.add(new objectCollection("n7","c7"));
		oc.add(new objectCollection("n8","c8"));
		oc.add(new objectCollection("n9","c9"));
		mylist.add(oc);
		
		
		
		//System.out.println("size:" + mylist.size() + " oc:" + ((List) mylist.get(0)).size());
		
		for(int itMylist = 0; itMylist < mylist.size(); itMylist++) {
			for(int itoc=0; itoc< oc.size(); itoc++) {
				System.out.println(oc.get(itoc).getName() + "," + oc.get(itoc).getSurname());
			}
			//System.out.println(mylist.get(itMylist));
		}
		for(List<objectCollection> item:mylist){
			for(objectCollection elem: item) {
				System.out.println(elem.toString());
			}
		}*/
		
}

}








