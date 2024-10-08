package com.betacom.car.utilities;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.betacom.car.dao.Macchina;

public class DBUtilities {

	public static Map<Integer, Object> buildParameters(Object[] p) {
		Map<Integer, Object> params = new HashMap<Integer, Object>();
		int pIdx = 1;
		for (Object o : p) {
			params.put(pIdx++, o);
		}

		return params;
	}

	public static List<Macchina> transformResultMacchinaInDTO(List<Map<String, Object>> rows){
		return rows.stream()
				.map(row -> new Macchina(
						(Integer)row.get("numeroPorte"),
						row.get("targa").toString(),
						(Integer)row.get("cc")
						))
				.collect(Collectors.toList());
		
	}
}
