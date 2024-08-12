package com.distribuida.DAO;

import java.util.List;

import com.distribuida.entities.Pedidos;

public interface PedidosDAO {
	
	public List<Pedidos> findALL();
	
	public Pedidos findOne(int id);
	
	public void add(Pedidos pedidos);
	
	public void up(Pedidos pedidos);
	
	public void del(int id);
	
}
