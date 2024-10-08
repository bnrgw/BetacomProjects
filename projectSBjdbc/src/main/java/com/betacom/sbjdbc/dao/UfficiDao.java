package com.betacom.sbjdbc.dao;

import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
//import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.betacom.sbjdbc.model.Uffici;

@Repository
public class UfficiDao {

	// usato per accedere ai dati tramitte qualsiasi operazione JDBC
	// private final JdbcTemplate jdbcTemplate;
	private final NamedParameterJdbcTemplate jdbcTemplate;

	@Autowired
//datasource serve come una connesione al db
	public UfficiDao(DataSource datasource) {
		this.jdbcTemplate = new NamedParameterJdbcTemplate(datasource);
		// this.jdbcTemplate = new JdbcTemplate(datasource);

	}

	/*
	 * public List<Uffici> getUffici(){ return
	 * jdbcTemplate.query("select* from uffici", rs->{ List<Uffici> uffici = new
	 * ArrayList<Uffici>(); while(rs.next()) { Uffici u = new Uffici();
	 * u.setIdUfficcio(rs.getInt("id_ufficio"));
	 * u.setNomeUfficio(rs.getString("nome_ufficio")); uffici.add(u); } return
	 * uffici; });
	 * 
	 * }
	 */

	public List<Uffici> getUfficiById(Integer id) {
		SqlParameterSource param = new MapSqlParameterSource("id", id);
		String sql = "select * from uffici where id_ufficio =:id";
		return jdbcTemplate.query(sql, param, BeanPropertyRowMapper.newInstance(Uffici.class));

	}

	public List<Uffici> getUffici() {
		return jdbcTemplate.query("select* from uffici", BeanPropertyRowMapper.newInstance(Uffici.class));
	}

	
	public void addUfficio(String nome) {
		String sql = "insert into uffici(nome_Ufficio) values (:name)";
		SqlParameterSource param = new MapSqlParameterSource("name", nome);
		jdbcTemplate.update(sql, param);

		/*sql = "insert into xxx(nome_ufficio) vlaues(:name)";
		jdbcTemplate.update(sql, param);
		*/
	}
}
