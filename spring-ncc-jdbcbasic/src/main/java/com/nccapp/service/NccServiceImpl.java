package com.nccapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nccapp.bean.Ncc;
import com.nccapp.dao.INccDao;


@Service
public class NccServiceImpl implements INccService {
	
	
	private INccDao dao;
	@Autowired
    public void setiInvestmentRepository(INccDao dao) {
		this.dao = dao;
	}

	public List<Ncc> getAll() {   
		return dao.findAll();
	}

	public List<Ncc> getByName(String cadetName) {
		return dao.findByName(cadetName);
		
	}

	public List<Ncc> getByDesignation(String designation) {
		
		return dao.findByDesignation(designation);
	}

	public List<Ncc> getByDivision(String division) {
		
		return dao.findByDivision("major");
	}

	public Ncc getBycadetId(int cadetId) {
		
		return dao.findBycadetId(cadetId);
	}

	public Ncc getByDuration(int duration) {
		
		return dao.findByDuration(duration);
	}

	

}
