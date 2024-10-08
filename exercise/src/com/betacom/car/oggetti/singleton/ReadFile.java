package com.betacom.car.oggetti.singleton;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class ReadFile {

	public  Map<String, List<String>> readLine(String path) {
		Map<String, List<String>> mapControl = new HashMap<String, List<String>>();
		String[] param = null;
		try (BufferedReader reader = new BufferedReader(new FileReader(path))) {
			String line = reader.readLine();//legge prima lineaS
			while (line != null) {
				param = line.split("=");

				if (param.length == 2) {
					String[] values;
					values = param[1].trim().split(",");
					List<String> val = Arrays.asList(values);
					mapControl.put(param[0].trim(), val);
				} else {
					System.out.println("Invalid parameters");
				}
				line = reader.readLine();// aggiornamento nuova linea
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return mapControl;
	}
}