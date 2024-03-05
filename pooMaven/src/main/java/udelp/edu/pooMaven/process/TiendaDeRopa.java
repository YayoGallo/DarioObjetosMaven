package udelp.edu.pooMaven.process;

import java.util.ArrayList;
import java.util.List;

import udelp.edu.pooMaven.model.Prenda;

public class TiendaDeRopa {

	public List<Prenda> prendas;
	public List<Prenda> venta;
	
	public void darDeAlta(Prenda prenda) {
		if (null != prendas) {
			prendas.add(prenda);
		} else {
			prendas = new ArrayList<Prenda>();
			prendas.add(prenda);
		}
	}
	
	public void agregarVenta(Prenda prenda) {
		if (null != venta) {
			venta.add(prenda);
		} else {
			venta = new ArrayList<Prenda>();
			venta.add(prenda);
		}
	}
	
	public String mostrarLista() {
		String respuesta="Prenda|Talla|Stock|Precio de compra|Precio de Venta|\n";
		Prenda aux;
		for (int i=0; i<prendas.size(); i++){
			aux=prendas.get(i);
			String talla = aux.getTalla() == 1 ? "Chico" : aux.getTalla() == 2 ? "Mediano" : aux.getTalla() == 3 ? "Grande" : "Extragrande";
			respuesta+=aux.getTipo()+"|"+talla+"|"+aux.getStock()+"|$"+aux.getPrecioCompra()+"|$"+aux.getPrecioVenta()+"|"+aux.getCodigo()+"\n";
		}
		return respuesta;
	}
	
	public String mostrarVentas() {
		String respuesta="Prenda|Talla|Stock|Precio de compra|Precio de Venta\n";
		Prenda aux;
		for (int i=0; i<venta.size(); i++){
			aux=venta.get(i);
			String talla = aux.getTalla() == 1 ? "Chico" : aux.getTalla() == 2 ? "Mediano" : aux.getTalla() == 3 ? "Grande" : "Extragrande";
			respuesta+=aux.getTipo()+"|"+talla+"|"+aux.getStock()+"|$"+aux.getPrecioCompra()+"|$"+aux.getPrecioVenta()+"\n";
		}
		return respuesta;
	}
	
	public String tipoDePrenda(Byte opcion) {
		String respuesta;
		switch(opcion) {
		case 1:
			respuesta="Pantalon de vestir";
			break;
		case 2:
			respuesta="pantalon de mezclilla";
			break;
		case 3:
			respuesta="camisa";
			break;
		case 4:
			respuesta="falda";
			break;
		case 5:
			respuesta="blusas";
			break;
		default :
			respuesta="playera";
			break;
		}
		return respuesta;
	}
	
	public Prenda buscarPorCodigo(String codigo) {
		if (prendas != null) {
			for (int i = 0; i < prendas.size(); i++) {
				if (prendas.get(i).getCodigo().equals(codigo)) {

					return prendas.get(i);
				}
			}
		}
		return null;
	}
	
	
}
