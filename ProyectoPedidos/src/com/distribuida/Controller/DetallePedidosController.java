package com.distribuida.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.distribuida.DAO.DetallePedidosDAO;
import com.distribuida.entities.DetallePedidos;

public class DetallePedidosController {
	
	@Autowired
	private DetallePedidosDAO detallePedidosDAO;
	
	@GetMapping("/findAll")
	public String findAll(Model model) {
		List<DetallePedidos> detallePedidos = detallePedidosDAO.findAll();
		model.addAttribute("detallePedidos", detallePedidos);
		return "etallePedidos-listar";
	}
}
