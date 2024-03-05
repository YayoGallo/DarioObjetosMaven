package udelp.edu.pooMaven.model;

import java.util.Random;
import lombok.Data;

@Data
public class Prenda {
	
	private String tipo;
	private Byte talla;
	private String codigo;
	private Double precioCompra;
	private Double precioVenta;
	private Integer stock;
	
	public Prenda() {
		
	}
	
	public Prenda(String tipo, Byte talla, Double precioCompra, Integer numeroDePrendas) {
		this.tipo = tipo;
		this.talla = talla;
		this.codigo = generarCodigo();
		this.precioCompra = precioCompra;
		if(talla==1||talla==2) {
			this.precioVenta = precioCompra+(precioCompra*.1);
		} else {
			this.precioVenta = precioCompra+(precioCompra*.2);
		}
		this.stock=numeroDePrendas;
	}

	private String generarCodigo() {

		String id = "";
		Random random = new Random();
		do {
			id += String.valueOf(random.nextInt(9) + 1);
		} while (id.length() < 8);
		return id;

	}
	
	public void reducirStock(Integer stock) {
		
		this.stock-=stock;
		
	}
}
