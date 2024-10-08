package com.betacom.projectJpaCar.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.betacom.projectJpaCar.pojo.Macchina;
import com.betacom.projectJpaCar.pojo.Veicolo;

@Repository
public interface IMacchinaRepository extends JpaRepository<Macchina,Integer> {

}
