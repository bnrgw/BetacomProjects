package projectDate;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;

public class MainDate {

	public static void main(String[] args) {
		Date myDate = new Date(); //per avere la data di oggi
		
		
		Locale local = new Locale("it"); //per avere la data in italia
		
		DateFormat df= DateFormat.getDateInstance(DateFormat.DEFAULT, local);// per dare un formato alla data
		
		String date = df.format(new Date());
        System.out.println("today's date :" + date);
		
		String pattern = "EEEE dd MMMM yyyy";
		SimpleDateFormat sdf = new SimpleDateFormat(pattern);
		
		String date2 = sdf.format(new Date());
		 System.out.println("date2:" + date2);
		 
		 Cliente c = new Cliente("Ruth","Genevieve", 2000,01,11);
		 
		 System.out.println(c);
		 
		 System.out.println("Nascita:" + sdf.format(c.getNascita()));
		 
		 
		 GregorianCalendar cal = new GregorianCalendar();
		 cal.setTime(c.getNascita());
		 
		 System.out.println("Giorno dell'anno:" + cal.get(Calendar.DAY_OF_YEAR));
		 
		 cal.set(Calendar.MONTH, 7);
		 c.setNascita(cal.getTime());
		 System.out.println("Nascita 1:" +sdf.format(c.getNascita()));
		 
		/* Date d = new Date();
		 String dataString ="10/06/2009";
		 
		 sdf = new SimpleDateFormat("dd/MM/yyyy");
		 try {
			 d = sdf.parse(dataString);
		 }catch (ParseException e) {
			 e.printStackTrace();
		 }
		 SimpleDateFormat sdfOutput = new SimpleDateFormat(pattern,local);
		 System.out.println("Risultato:" +sdfOutput.format(d));
		 
		 //convert da util a sql
		 java.util.Date utilDate = new java.util.Date();
		 java.sql.Date sqlDate = new java.sql.Date(utilDate.getTime());
		 
		 // convert da gregorian a util
		 GregorianCalendar cal1 = new GregorianCalendar();
		  utilDate = cal1.getTime();
		  
		  System.out.println("Risultato gregorian:" + sdfOutput.format(utilDate));
		  
		  
		  GregorianCalendar cal2 = new GregorianCalendar();
		  sqlDate = new java.sql.Date(cal2.getTime().getTime());
		  
		  System.out.println("Risultato gregorian to sql:" + sdfOutput.format(sqlDate));
		  
		  //da sql a util
		  sqlDate = new java.sql.Date(new Date().getTime());
		  utilDate = new java.sql.Date(sqlDate.getTime());
		  
		  //util a calendar
		  GregorianCalendar cal3 = new GregorianCalendar();
		  cal3.setTime(utilDate);*/
		  
		
	}

}
