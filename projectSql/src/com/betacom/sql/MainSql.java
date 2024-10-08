package com.betacom.sql;

import java.io.FileNotFoundException;

import java.util.Properties;
import java.util.Scanner;

import com.betacom.sql.config.SQLConfiguration;
import com.betacom.sql.utilities.ProcessQuery;
import com.betacom.sql.utilities.ProcessUpdate;
import java.io.InputStream;
import java.io.FileInputStream;

public class MainSql {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("query Q - update U - transaction T");
		String option = input.nextLine();
		SQLProcess pro = null;

		if (option.equalsIgnoreCase("Q"))
			pro = new ProcessQuery();
		else if (option.equalsIgnoreCase("U"))
			pro = (SQLProcess) new ProcessUpdate();
		else if (option.equalsIgnoreCase("T"))
			pro = (SQLProcess) new ProcessTransaction();

		pro.execute();

		System.out.println("End of process..");
	}

}
