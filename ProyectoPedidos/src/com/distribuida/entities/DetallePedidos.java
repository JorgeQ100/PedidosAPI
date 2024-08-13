package com.distribuida.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "detalles_pedidos")
public class DetallePedidos {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_detalle_pedidos")
	private int idDetalleDedidos;
	@Column(name = "IdPedido")
	private int IdPedido;
	@Column(name = "IdProducto")
	private int IdProducto;
	@Column(name = "Cantidad")
	private int Cantidad;
	@Column(name = "PrecioUnitario")
	private Double PrecioUnitario;
	
	public DetallePedidos() {}
	
	public DetallePedidos(int idDetalleDedidos, int idPedido, int idProducto, int cantidad, Double precioUnitario) {
		this.idDetalleDedidos = idDetalleDedidos;
		this.IdPedido = idPedido;
		this.IdProducto = idProducto;
		this.Cantidad = cantidad;
		this.PrecioUnitario = precioUnitario;
	}
	public int getIdDetalleDedidos() {
		return idDetalleDedidos;
	}
	public void setIdDetalleDedidos(int idDetalleDedidos) {
		this.idDetalleDedidos = idDetalleDedidos;
	}
	public int getIdPedido() {
		return IdPedido;
	}
	public void setIdPedido(int idPedido) {
		IdPedido = idPedido;
	}
	public int getIdProducto() {
		return IdProducto;
	}
	public void setIdProducto(int idProducto) {
		IdProducto = idProducto;
	}
	public int getCantidad() {
		return Cantidad;
	}
	public void setCantidad(int cantidad) {
		Cantidad = cantidad;
	}
	public Double getPrecioUnitario() {
		return PrecioUnitario;
	}
	public void setPrecioUnitario(Double precioUnitario) {
		PrecioUnitario = precioUnitario;
	}
	@Override
	public String toString() {
		return "DetallePedidos [idDetalleDedidos=" + idDetalleDedidos + ", IdPedido=" + IdPedido + ", IdProducto="
				+ IdProducto + ", Cantidad=" + Cantidad + ", PrecioUnitario=" + PrecioUnitario + "]";
	}
	
	
	
}
