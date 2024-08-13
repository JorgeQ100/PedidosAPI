package com.distribuida.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.Nullable;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
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
	
	
	@PostMapping("/add")
	public String add(@RequestParam("idDetalleDedidos")@Nullable Integer idDetalleDedidos
			         ,@RequestParam("IdPedido")@Nullable Integer IdPedido
			         ,@RequestParam("IdProducto")@Nullable Integer IdProducto
			         ,@RequestParam("Cantidad")@Nullable Integer Cantidad
			         ,@RequestParam("PrecioUnitario")@Nullable Double PrecioUnitario) {
		if(idDetalleDedidos == null) {
			DetallePedidos detallePedidos = new DetallePedidos(0, IdPedido, IdProducto, Cantidad, PrecioUnitario);
			detallePedidosDAO.add(detallePedidos);
		}else {
			DetallePedidos detallePedidos = new DetallePedidos(idDetalleDedidos, IdPedido, IdProducto, Cantidad, PrecioUnitario);
			detallePedidosDAO.UP(detallePedidos);
		}
		return "redirect:/detallepedidos/findAll";
	}
	
	@GetMapping("/del")
	public String del(@RequestParam("idDetalleDedidos")@Nullable Integer idDetalleDedidos) {
		detallePedidosDAO.del(idDetalleDedidos);
		return "redirect:/detallepedidos/findAll";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
