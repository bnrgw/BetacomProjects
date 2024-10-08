package com.betacom.projectJpaCar.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.betacom.projectJpaCar.pojo.Ammortizzatore;


@Repository
public interface IAmmortizatoreRepository extends JpaRepository<Ammortizzatore,Integer> {

}
