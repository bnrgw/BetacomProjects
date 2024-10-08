package projectString;

public class MainString {

	public static void main(String[] args) {
		
		StringBuilder sb = new StringBuilder();
		sb.append("Buongiorno");
		sb.append(" ");
		sb.append("Sono");
		sb.append(" ");
		sb.append("Ruth");
		
		System.out.println(sb.toString());
		String n = "Ruth";
		String f = "Camerunese";
		
		String msg = String.format("Mio nome è %s sono %s", n,f);
		System.out.println(msg);
		
		if(n.equalsIgnoreCase("rUTh"))
			System.out.println("found...");
		
		if(n.contains("th"))
			System.out.println("found...");
		
		StringBuilder sb1 = new StringBuilder("Siamo nell'Academy");
		sb1.append("?");
		sb1.insert(5, " veramente");
		System.out.println(sb1.toString());
		
		String test = "";
		if(test.isEmpty())
			System.out.println("Empty string");

		String trim = "              Hello World          ";
		System.out.println(">>>>>>" + trim.trim() + "<<<<<<");
		
		String sub = "abcdefg";
		System.out.println(sub.substring(3,5));
		
		String strl1 = "apple";
		String strl2 = "samsung";
		int result = strl1.compareTo(strl2);
		if(result < 0) {
			System.out.println("inf");
		}else if(result > 0) {
			System.out.println("sup");
		}else {
			System.out.println("==");
		}
		
		
		int numero=34;
		String numeroStr = String.valueOf(numero);//String numeroStr = Integer.toString(numero);,danno lo stesso risultato
		System.out.println("numereoStr" + numeroStr);
		
		String esempio = "aaa,bbb,ccc,ddd";
		String[] t = esempio.split(",");
		System.out.println("size:" + t.length + " ->3:" + t[3]);
		System.out.println(t[0]);
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
