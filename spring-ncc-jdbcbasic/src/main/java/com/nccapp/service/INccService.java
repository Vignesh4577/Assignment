package com.nccapp.service;

import java.util.List;

import com.nccapp.bean.Ncc;

public interface INccService {

	List<Ncc> getAll();
	List<Ncc> getByName(String cadetName);
	List<Ncc> getByDesignation(String designation);
	List<Ncc> getByDivision(String division);
	Ncc getBycadetId(int cadetId);
	Ncc getByDuration(int duration);
}
