package com.distribuida.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.Nullable;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

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
	
	@GetMapping("/findOne")
	public String findOne(@RequestParam("idDetalleDedidos")@Nullable Integer idDetalleDedidos
			             ,@RequestParam("opcion")@Nullable Integer opcion
			             ,Model model) {
		if(idDetalleDedidos != null) {
			DetallePedidos detallePedidos = detallePedidosDAO.findOne(idDetalleDedidos);
			model.addAttribute("detallePedidos", detallePedidos);
		}
		if(opcion == 1) return "detallepedidos-add";
		else return "detallepedidos-del";
	}
}
