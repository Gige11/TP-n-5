package Ejercicio1;

import java.time.LocalDateTime;

public class Carrito {
    private int codigoCarrito;
    private Persona persona;
    private LocalDateTime fecha;

    private ItemCarrito[] items = new ItemCarrito[3];

    public Carrito(int codigoCarrito, Persona persona, ItemCarrito itemCarrito1, ItemCarrito itemCarrito2, ItemCarrito itemCarrito3) {
        this.codigoCarrito = codigoCarrito;
        this.persona = persona;
        this.items[0] = itemCarrito1;
        this.items[1] = itemCarrito2;
        this.items[2] = itemCarrito3;
    }

    public Carrito(ItemCarrito[] items) {
        this.items = items;
    }

    public int getCodigoCarrito() {
        return codigoCarrito;
    }

    public void setCodigoCarrito(int codigoCarrito) {
        this.codigoCarrito = codigoCarrito;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    public ItemCarrito[] getItems() {
        return items;
    }

    public void setItems(ItemCarrito[] items) {
        this.items = items;
    }

    public LocalDateTime getFecha() {
        fecha = LocalDateTime.now();
        return fecha;
    }

    public double getPrecioFinal(){
        double precioFinal = 0;
        for (int x = 0; x < items.length; x++) {
            precioFinal += items[x].getMontoItem() ;
        }
        return  precioFinal;
    }

    public void mostrarTitulo() {
        System.out.println("\nCliente= "+getPersona().getNombre()+" "+ getPersona().getApellido()+ "\t\t Fecha: "+ getFecha() +"\n");
        System.out.println("Cant | \tPrecio |  Importe  |  Producto \n----------------------------------------------");
    }

    public void mostrarItems(){
          for(int x=0;x<items.length;x++){
              System.out.println("  "+items[x].getCantidad()+"\t"+"\t"+items[x].getProducto().getPrecio()+"\t  "+items[x].getMontoItem()+"\t  "+items[x].getProducto().getNombre());
          }
    }

    public void mostrarTotal() {
        System.out.println("\nPrecio total: "+getPrecioFinal());
    }
}
