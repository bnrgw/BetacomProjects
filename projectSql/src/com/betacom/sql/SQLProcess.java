package com.betacom.sql;

import java.util.List;

import com.betacom.sql.dao.Dipendenti;

public interface SQLProcess {
  void execute();
  List<Dipendenti>showResults(int rc);
}
