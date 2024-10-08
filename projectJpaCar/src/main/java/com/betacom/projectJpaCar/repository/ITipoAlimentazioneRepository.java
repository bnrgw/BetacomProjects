package com.betacom.projectJpaCar.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.betacom.projectJpaCar.pojo.TipoAlimentazione;


@Repository
public interface ITipoAlimentazioneRepository extends JpaRepository<TipoAlimentazione,Integer> {

}
