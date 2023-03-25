package Ejercicio1;

import java.time.LocalDate;

public class ProbarCarrito {
    public static void main(String[] args) {

        Persona persona1 = new Persona("Mariana","Gonzalez",LocalDate.of(1998,5,4));
        Persona persona2 = new Persona("Pedro","Sousa",LocalDate.of(2005,12,9));

        Producto producto1 = new Producto("Cepillo de dientes", "1234556", 550);
        Producto producto2 = new Producto("Pasta de dientes", "4321", 750);
        Producto producto3 = new Producto("Harina 0000 x 1kg","25356",200);

        ItemCarrito itemCarrito1 = new ItemCarrito(producto1,2);
        ItemCarrito itemCarrito2 = new ItemCarrito(producto2,3);
        ItemCarrito itemCarrito3 = new ItemCarrito(producto3,5);

        Carrito carrito1 = new Carrito(1,persona1,itemCarrito1,itemCarrito2,itemCarrito3);
        Descuento descuento1 = new Descuento(carrito1.getPrecioFinal());

        carrito1.mostrarTitulo();
        carrito1.mostrarItems();
        carrito1.mostrarTotal();
        descuento1.CalcularDescuento();

    }
}
