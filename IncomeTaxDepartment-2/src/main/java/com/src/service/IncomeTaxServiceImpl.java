package com.src.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.src.dao.IncomeTaxDao;
import com.src.model.TdsMaster;


@Component("incomeTaxService")
@Service
@Transactional
public class IncomeTaxServiceImpl implements IncomeTaxService {

	
	@Autowired
	IncomeTaxDao incomeDao;
	@Override
	public TdsMaster getById(int id) {
		// TODO Auto-generated method stub
		return incomeDao.getById(id);
	}

}
