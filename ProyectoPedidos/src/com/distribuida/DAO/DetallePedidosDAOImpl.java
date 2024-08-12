package com.distribuida.DAO;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.distribuida.entities.DetallePedidos;
import com.distribuida.entities.Pedidos;

@Repository
public class DetallePedidosDAOImpl implements DetallePedidosDAO {

	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	@Transactional
	public List<DetallePedidos> findAll() {
		Session session = sessionFactory.getCurrentSession();
		return session.createQuery("from DetallePedidos", DetallePedidos.class).getResultList();
	}

	@Override
	@Transactional
	public DetallePedidos findOne(int id) {
		Session session = sessionFactory.getCurrentSession();
		return session.get(DetallePedidos.class, id);
	}

	@Override
	@Transactional
	public void add(DetallePedidos detallePedidos) {
		Session session = sessionFactory.getCurrentSession();
		session.saveOrUpdate(detallePedidos);
	}

	@Override
	@Transactional
	public void UP(DetallePedidos detallePedidos) {
		Session session = sessionFactory.getCurrentSession();
		session.saveOrUpdate(detallePedidos);
	}

	@Override
	@Transactional
	public void del(int id) {
		Session session = sessionFactory.getCurrentSession();
		session.delete(findOne(id));
	}

}
