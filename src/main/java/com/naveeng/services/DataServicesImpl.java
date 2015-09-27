package com.naveeng.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.naveeng.dao.DataDao;
import com.naveeng.model.IceCream;

public class DataServicesImpl implements DataServices {

	@Autowired
	DataDao dataDao;

	@Override
	public IceCream getEntityById(long id) throws Exception {
		return dataDao.getEntityById(id);
	}

	@Override
	public List<IceCream> getEntityList() throws Exception {
		return dataDao.getEntityList();
	}

	@Override
	public boolean updateEntity(long id, int quantity) throws Exception {
		dataDao.updateEntity(id, quantity);

		return true;
	}
}
