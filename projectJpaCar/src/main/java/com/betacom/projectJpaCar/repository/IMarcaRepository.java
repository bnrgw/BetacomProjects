package com.betacom.projectJpaCar.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.betacom.projectJpaCar.pojo.Marca;


@Repository
public interface IMarcaRepository extends JpaRepository<Marca,Integer> {

}
