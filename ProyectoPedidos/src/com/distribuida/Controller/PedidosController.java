package com.distribuida.Controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.distribuida.DAO.PedidosDAO;
import com.distribuida.entities.Pedidos;

@Controller
@RequestMapping("/pedidos")
public class PedidosController {
	
	@Autowired
	private PedidosDAO pedidosDAO;
	
	@GetMapping("/findAll")
	public String findAll (Model model) {
		List<Pedidos> pedidos = pedidosDAO.findALL();
		model.addAttribute("pedidos", pedidos);
		return "pedidos-listar";
	}
	
	@GetMapping("/findOne")
	public String findOne(@RequestParam("idPedidos")@Nullable Integer idPedidos
			             ,@RequestParam("opcion")@Nullable Integer opcion
			             ,Model model) {
		if(idPedidos != null){
			Pedidos pedidos = pedidosDAO.findOne(idPedidos);
			model.addAttribute("pedidos", pedidos);
		}
		
		if(opcion == 1) return "pedidos-add";
		else return "del-pedidos";
	}
	
	
	@PostMapping("/add")
	public String add(@RequestParam("idPedidos")@Nullable Integer idPedidos
					 ,@RequestParam("FechaPedido")@Nullable Date FechaPedido
					 ,@RequestParam("FechaPedido")@Nullable Integer IdProveedor
					 ,@RequestParam("FechaPedido")@Nullable Integer IdSucursal
					 ,@RequestParam("FechaPedido")@Nullable Integer IdCliente
					 ,@RequestParam("FechaPedido")@Nullable Double Total
					 ,Model model) {
		if(idPedidos == null) {
			Pedidos pedidos = new Pedidos(0, FechaPedido, IdProveedor, IdSucursal, IdCliente, Total);
			pedidosDAO.add(pedidos);
		}else {
			Pedidos pedidos = new Pedidos(idPedidos, FechaPedido, IdProveedor, IdSucursal, IdCliente, Total);
			pedidosDAO.up(pedidos);
		}
		return "redirect:/pedidos/findAll";
	}
	
	@GetMapping("/del")
	public String del(@RequestParam("idPedidos")@Nullable Integer idPedidos) {
		pedidosDAO.del(idPedidos);
		return "redirect:/pedidos/findAll";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
