package com.distribuida.principal;

import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.distribuida.DAO.DetallePedidosDAO;
import com.distribuida.DAO.DetallePedidosDAOImpl;
import com.distribuida.entities.DetallePedidos;

public class PrincipalDetallePedidos {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		DetallePedidosDAO detallePedidosDAO = context.getBean("detallePedidosDAOImpl", DetallePedidosDAO.class);
		List<DetallePedidos> detallePedidos = detallePedidosDAO.findAll();
		
		detallePedidos.forEach(item ->{
			System.out.println(item.toString());
		});

	}

}
