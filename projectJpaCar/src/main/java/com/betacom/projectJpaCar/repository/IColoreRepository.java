package com.betacom.projectJpaCar.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.betacom.projectJpaCar.pojo.Colore;
import com.betacom.projectJpaCar.pojo.Veicolo;

@Repository
public interface IColoreRepository extends JpaRepository<Colore,Integer> {

}
