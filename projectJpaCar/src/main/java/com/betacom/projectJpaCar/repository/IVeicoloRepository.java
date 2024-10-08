package com.betacom.projectJpaCar.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.betacom.projectJpaCar.pojo.Veicolo;

@Repository
public interface IVeicoloRepository extends JpaRepository<Veicolo,Integer> {
	
	Veicolo findByMacchina_id(Integer idMacchina);
	
	Veicolo findByBici_id(Integer idBici);
	
	Veicolo findByMoto_id(Integer idMoto);

}
