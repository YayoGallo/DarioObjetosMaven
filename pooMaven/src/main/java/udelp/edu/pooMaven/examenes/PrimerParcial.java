package udelp.edu.pooMaven.examenes;

import java.util.Scanner;

import udelp.edu.pooMaven.model.Prenda;
import udelp.edu.pooMaven.process.TiendaDeRopa;
import udelp.edu.pooMaven.utility.Validaciones;

public class PrimerParcial {

	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		boolean repetir = true;
		TiendaDeRopa movimientos = new TiendaDeRopa();
		Validaciones valida = new Validaciones();
		String tipo, opcion, aux;
		Double precio, total;
		Integer stock;
		do {
			total=0.0;
			System.out.println(
					"Tienda de ropa\n1)Dar de alta prenda\n2)Ver inventario\n3)Realizar venta\n4)Ver prendas vendidas\n5)Salir");
			opcion = leer.nextLine();
			switch (valida.esByte(opcion)) {
			case 1:
				System.out.println("Ingresa el tipo de prenda\n"
						+ "1)Pantalones de vestir\n2)Pantalones de mezclilla\n3)Camisas\4)Faldas\n5)Blusas\nOtro)Playeras");
				tipo = movimientos.tipoDePrenda(valida.esByte(leer.nextLine()));
				System.out.println("Ingresa la talla\n1)Chica\n2)Mediana\n3)Grande\nOtra)Extra Grande");
				aux = leer.nextLine();
				System.out.println("Ingresa el precio de compra");
				precio = valida.esDecimal(leer.nextLine());
				if (precio <= 0.0) {
					System.out.println("Precio invalido");
					break;
				}
				System.out.println("Ingresa el numero de prendas");
				stock = valida.esInt(leer.nextLine());
				if (stock <= 0) {
					System.out.println("Cantidad invalido");
					break;
				}
				Prenda prenda = new Prenda(tipo, valida.esByte(aux), precio, stock);
				movimientos.darDeAlta(prenda);
				break;
			case 2:
				if (null == movimientos.prendas) {
					System.out.println("Aun no hay prendas");
					break;
				}
				System.out.println(movimientos.mostrarLista());
				break;
			case 3:
				do {
					System.out.println("Ingresa el codigo de la prenda");
					aux = leer.nextLine();
					Prenda auxPrenda = movimientos.buscarPorCodigo(aux);
					if (null == auxPrenda) {
						System.out.println("No se encontraron prendas");
						break;
					}
					System.out.println("Ingresa la cantidad a comprar");
					stock = valida.esInt(leer.nextLine());
					if (stock <= auxPrenda.getStock()) {
						auxPrenda.reducirStock(stock);
						Prenda venta=new Prenda(auxPrenda.getTipo(), auxPrenda.getTalla(), auxPrenda.getPrecioCompra(), stock);
						total+=venta.getPrecioVenta();
						movimientos.agregarVenta(venta);
					}else {
						System.out.println("No hay articulos suficientes");
					}
					System.out.println("Desea cerrar la venta? 1)No Otro)Si");
					opcion=leer.nextLine();
				} while (valida.esByte(opcion)== 1);
				System.out.println("Su total es de:" + total);
				break;
			case 4:
				if (null == movimientos.prendas) {
					System.out.println("Aun no hay ventas");
					break;
				}
				System.out.println(movimientos.mostrarVentas());
				break;
			case 5:
				System.out.println("Adios");
				repetir = false;
				break;
			default:
				System.out.println("Opcion invalida");
				break;
			}
		} while (repetir);

	}

}
