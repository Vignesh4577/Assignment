package com.nccapp.dao;

import java.util.List;

import com.nccapp.bean.Ncc;

public interface INccDao {

	List<Ncc> findAll();
	List<Ncc> findByName(String cadetName);
	List<Ncc> findByDesignation(String designation);
	List<Ncc> findByDivision(String division);
	Ncc findBycadetId(int cadetId);
	Ncc findByDuration(int duration);
}
