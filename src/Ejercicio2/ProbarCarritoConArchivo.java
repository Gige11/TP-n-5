package Ejercicio2;

import Ejercicio1.Carrito;
import Ejercicio1.ItemCarrito;
import Ejercicio1.Producto;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class ProbarCarritoConArchivo {
    public static void main(String[] args) throws IOException {

        String ruta = "src/Ejercicio2/ListaProductos.txt";
        double precioFinal = 0;
        System.out.println("Cant | \tPrecio | Importe | Producto \n----------------------------------------------");

        int x=1;

        Producto producto1 = new Producto();
        Producto producto2 = new Producto();
        Producto producto3 = new Producto();

        for(String linea : Files.readAllLines(Paths.get(ruta))){
            String[] productos = linea.split(",");

            if(x==1){
                 producto1.setNombre(productos[0]);
                 producto1.setCodigo(productos[1]);
                 producto1.setPrecio(Float.parseFloat(productos[2]));
            }
            if(x==2){
                producto2.setNombre(productos[0]);
                producto2.setCodigo(productos[1]);
                producto2.setPrecio(Float.parseFloat(productos[2]));
            }
            if(x==3){
                producto3.setNombre(productos[0]);
                producto3.setCodigo(productos[1]);
                producto3.setPrecio(Float.parseFloat(productos[2]));
            }
            x++;

        }

        ItemCarrito itemCarrito1 = new ItemCarrito(producto1,1);
        ItemCarrito itemCarrito2 = new ItemCarrito(producto2,2);
        ItemCarrito itemCarrito3 = new ItemCarrito(producto3,1);

        ItemCarrito[] items= {itemCarrito1,itemCarrito2,itemCarrito3};
        Carrito carrito1 = new Carrito(items);

        carrito1.mostrarItems();
        carrito1.mostrarTotal();

    }

}

