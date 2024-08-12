package com.distribuida.DAO;

import java.util.List;

import com.distribuida.entities.DetallePedidos;

public interface DetallePedidosDAO {

	public List<DetallePedidos> findAll();

	public DetallePedidos findOne(int id);

	public void add(DetallePedidos detallePedidos);

	public void UP(DetallePedidos detallePedidos);

	public void del(int id);

}
