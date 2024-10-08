package com.betacom.front_end.utilities;

import com.fasterxml.jackson.databind.ObjectMapper;

@SuppressWarnings({"rawtypes","unchecked"})
public class WebUtils {

	public static Object convertInObject(Object inp,Class tipo) {
		Object res = new Object();
		ObjectMapper mapper = new ObjectMapper();
		try{
		res = mapper.convertValue(inp, tipo);
		}catch(IllegalArgumentException e) {
			e.printStackTrace();
		}
		return res;
	}
}
