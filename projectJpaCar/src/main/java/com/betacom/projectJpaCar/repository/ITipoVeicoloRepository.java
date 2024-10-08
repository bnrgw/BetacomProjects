package com.betacom.projectJpaCar.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.betacom.projectJpaCar.pojo.TipoVeicolo;


@Repository
public interface ITipoVeicoloRepository extends JpaRepository<TipoVeicolo,Integer> {

}
