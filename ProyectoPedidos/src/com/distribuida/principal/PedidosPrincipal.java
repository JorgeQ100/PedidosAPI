package com.distribuida.principal;

import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.distribuida.DAO.PedidosDAO;
import com.distribuida.DAO.PedidosDAOImpl;
import com.distribuida.entities.Pedidos;

public class PedidosPrincipal {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		PedidosDAO pedidosDAO = context.getBean("pedidosDAOImpl", PedidosDAO.class);
		List<Pedidos> pedidos = pedidosDAO.findALL();
		
		pedidos.forEach(item ->{
			System.out.println(item.toString());
		});

	}

}
