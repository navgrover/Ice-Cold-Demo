package com.naveeng.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import com.naveeng.model.IceCream;

public class DataDaoImpl implements DataDao {

	@Autowired
	SessionFactory sessionFactory;

	Session session = null;
	Transaction tx = null;

	@Override
	public boolean updateEntity(long id, int quantity) throws Exception {

		session = sessionFactory.openSession();
		IceCream icecream = (IceCream) session
				.get(IceCream.class, new Long(id));
		icecream.setQuantity(quantity);
		tx = session.getTransaction();
		session.saveOrUpdate(icecream);
		session.beginTransaction();
		tx.commit();

		return false;
	}

	@Override
	public IceCream getEntityById(long id) throws Exception {
		session = sessionFactory.openSession();
		IceCream icecream = (IceCream) session.load(IceCream.class,
				new Long(id));
		tx = session.getTransaction();
		session.beginTransaction();
		tx.commit();
		return icecream;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<IceCream> getEntityList() throws Exception {
		session = sessionFactory.openSession();
		tx = session.beginTransaction();
		List<IceCream> icecreamList = session.createCriteria(IceCream.class)
				.list();
		tx.commit();
		session.close();
		return icecreamList;
	}
}
