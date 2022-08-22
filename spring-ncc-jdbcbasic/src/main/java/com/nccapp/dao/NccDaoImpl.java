package com.nccapp.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Arrays;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.nccapp.bean.Ncc;
import com.nccapp.util.DBQueries;
@Repository
public class NccDaoImpl implements INccDao {

	private JdbcTemplate jdbcTemplate;
	@Autowired
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	
	public List<Ncc> findAll() {
		
		return showAll();
	}

	public List<Ncc> findByName(String cadetName) {
		
		
		List<Ncc> ncc = jdbcTemplate.query(com.nccapp.util.DBQueries.SELECTBYNAME, new RowMapper<Ncc>() {

			@Override
			public Ncc mapRow(ResultSet rs, int rowNum) throws SQLException {

				Ncc ncc = new Ncc();
				ncc.setCadetName( "cadet_name");
				ncc.setDesignation(" designation");
				ncc.setCadetId(10);
				ncc.setDivision("division");
				ncc.setDuration(2);
				
				int cadetId=rs.getInt("cadet_id");
				ncc.setCadetId(cadetId);
				return ncc;
			}

		},cadetName);
		return ncc;
		
	}

	public List<Ncc> findByDesignation(String designation) {
		
		List<Ncc> ncc = jdbcTemplate.query(com.nccapp.util.DBQueries.SELECTBYDESIGNATION, new RowMapper<Ncc>() {

			@Override
			public Ncc mapRow(ResultSet rs, int rowNum) throws SQLException {

				Ncc ncc = new Ncc();
				ncc.setCadetName( "cadet_name");
				ncc.setDesignation(" designation");
				ncc.setCadetId(10);
				ncc.setDivision("division");
				ncc.setDuration(2);
				
				int cadetId=rs.getInt("cadet_id");
				ncc.setCadetId(cadetId);
				return ncc;
			}

		},designation);
		return ncc;
	}

	public List<Ncc> findByDivision(String division) {
		List<Ncc> ncc = jdbcTemplate.query(com.nccapp.util.DBQueries.SELECTBYDIVISION, new RowMapper<Ncc>() {

			@Override
			public Ncc mapRow(ResultSet rs, int rowNum) throws SQLException {

				Ncc ncc = new Ncc();
				ncc.setCadetName( "cadet_name");
				ncc.setDesignation(" designation");
				ncc.setCadetId(10);
				ncc.setDivision("division");
				ncc.setDuration(2);
				
				int cadetId=rs.getInt("cadet_id");
				ncc.setCadetId(cadetId);
				return ncc;
			}

		},division);
		return ncc;

	}

	public Ncc findBycadetId(int cadetId) {
		return jdbcTemplate.queryForObject(DBQueries.SELECTBYID,
				(rs,rowNum)->{

					Ncc ncc = new Ncc();
					ncc.setCadetName( "cadet_name");
					ncc.setDesignation(" designation");
					ncc.setCadetId(10);
					ncc.setDivision("division");
					ncc.setDuration(2);
					

					int id=rs.getInt("cadet_id");
					ncc.setCadetId(id);
					return ncc;

				},cadetId);
		
	}

	public Ncc findByDuration(int duration) {
		return jdbcTemplate.queryForObject(DBQueries.SELECTBYDURATION,
				(rs,rowNum)->{

					Ncc ncc = new Ncc();
					ncc.setCadetName( "cadet_name");
					ncc.setDesignation(" designation");
					ncc.setCadetId(10);
					ncc.setDivision("division");
					ncc.setDuration(2);
					

					int cadetId=rs.getInt("cadet_id");
					ncc.setCadetId(cadetId);
					return ncc;

				},duration);


	}
	
	private List<Ncc> showAll(){
		
		List<Ncc> ncc = Arrays.asList(
				new Ncc("cadet Basavaraj", "major", "Junior", 40, 2),
				new Ncc("cadet bharath", "major", "Junior", 20, 3),	
				new Ncc("cadet Vignesh", "major", "Junior", 7, 2),
				new Ncc("cadet jack", "major", "Junior", 7, 2),
				new Ncc("cadet Rakesh", "captain", "Senior", 20, 5),
				new Ncc("cadet Manjunath", "soldier", "Senior", 300, 6));
		return ncc;
				
		
	}





}
