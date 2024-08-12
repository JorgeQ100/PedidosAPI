package com.distribuida.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "pedidos")
public class Pedidos {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_pedidos")
	private int idPedidos;
	@Column(name = "FechaPedido")
	private Date FechaPedido;
	@Column(name = "IdProveedor")
	private int IdProveedor;
	@Column(name = "IdSucursal")
	private int IdSucursal;
	@Column(name = "IdCliente")
	private int IdCliente;
	@Column(name = "Total")
	private Double Total;

	public Pedidos() {
	}

	public Pedidos(int idPedidos, Date fechaPedido, int idProveedor, int idSucursal, int idCliente, Double total) {
		this.idPedidos = idPedidos;
		this.FechaPedido = fechaPedido;
		this.IdProveedor = idProveedor;
		this.IdSucursal = idSucursal;
		this.IdCliente = idCliente;
		this.Total = total;
	}

	public int getIdPedidos() {
		return idPedidos;
	}

	public void setIdPedidos(int idPedidos) {
		this.idPedidos = idPedidos;
	}

	public Date getFechaPedido() {
		return FechaPedido;
	}

	public void setFechaPedido(Date fechaPedido) {
		FechaPedido = fechaPedido;
	}

	public int getIdProveedor() {
		return IdProveedor;
	}

	public void setIdProveedor(int idProveedor) {
		IdProveedor = idProveedor;
	}

	public int getIdSucursal() {
		return IdSucursal;
	}

	public void setIdSucursal(int idSucursal) {
		IdSucursal = idSucursal;
	}

	public int getIdCliente() {
		return IdCliente;
	}

	public void setIdCliente(int idCliente) {
		IdCliente = idCliente;
	}

	public Double getTotal() {
		return Total;
	}

	public void setTotal(Double total) {
		Total = total;
	}

	@Override
	public String toString() {
		return "Pedidos [idPedidos=" + idPedidos + ", FechaPedido=" + FechaPedido + ", IdProveedor=" + IdProveedor
				+ ", IdSucursal=" + IdSucursal + ", IdCliente=" + IdCliente + ", Total=" + Total + "]";
	}

}
