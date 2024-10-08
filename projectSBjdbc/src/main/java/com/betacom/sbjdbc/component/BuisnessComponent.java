package com.betacom.sbjdbc.component;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.betacom.sbjdbc.dao.UfficiDao;
import com.betacom.sbjdbc.model.Uffici;

@Component
public class BuisnessComponent {

	@Autowired
	private UfficiDao uDao;

	public void listUffici() {
		List<Uffici> lU = uDao.getUffici();
		lU.forEach(u -> System.out.println(u));
		
		System.out.println("*******select with id :3**************");
		lU = uDao.getUfficiById(3);
	    lU.forEach(u -> System.out.println(u));
	    
	    System.out.println("*******Insert**************");
		uDao.addUfficio("New room");
		lU = uDao.getUffici();
		lU.forEach(u -> System.out.println(u));
		}
}
