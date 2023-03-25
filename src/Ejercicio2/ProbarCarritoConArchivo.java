package Ejercicio2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class ProbarCarritoConArchivo {
    public static void main(String[] args) throws IOException {

        String ruta = "src/Ejercicio2/ListaProductos.txt";
        double precioFinal = 0;
        System.out.println("Cant | \tPrecio |  Producto \n----------------------------------------------");

        for(String linea : Files.readAllLines(Paths.get(ruta))){
            String[] producto = linea.split(",");
            System.out.println("  "+producto[2]+"\t"+"\t"+producto[1]+"\t  "+"\t  "+producto[0]);
            precioFinal =  precioFinal + Integer.parseInt(producto[1]);
        }
        System.out.println("\nPrecio final: "+ precioFinal);
    }

}

