package com.naveeng.services;

import java.util.List;
import com.naveeng.model.IceCream;

public interface DataServices {
	public IceCream getEntityById(long id) throws Exception;

	public List<IceCream> getEntityList() throws Exception;

	public boolean updateEntity(long id, int quantity) throws Exception;
}
