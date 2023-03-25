package Ejercicio1;

public class ItemCarrito {

    private Carrito carrito;
    private Producto producto;
    private int cantidad;
    private double montoItem;

    public ItemCarrito(Producto producto,int cantidad){
        this.producto = producto;
        this.cantidad = cantidad;
        montoItem = producto.getPrecio() * cantidad;
    }

    public Carrito getCarrito() {
        return carrito;
    }

    public void setCarrito(Carrito carrito) {
        this.carrito = carrito;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getMontoItem() {
        return montoItem;
    }

    public void setMontoItem(double montoItem) {
        this.montoItem = montoItem;
    }

    public void mostrarItem() {
        System.out.println("  "+cantidad+"\t"+"\t"+producto.getPrecio()+"\t"+montoItem+"\t"+producto.getNombre());

    }

}
