package com.betacom.projectJpaCar.service.interfaces;


import com.betacom.projectJpaCar.dto.AmmortizzatoreDto;
import com.betacom.projectJpaCar.exception.AcademyException;

public interface iAmmortizzatoreService {

	Integer create(AmmortizzatoreDto amm) throws AcademyException;
}
