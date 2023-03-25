package Ejercicio1;

public class Producto {

    private String codigo;
    private String nombre;
    private float precio;

    public Producto() {
    }

    public Producto(String nombre, String codigo, float precio) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.precio = precio;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    public String getNombre() {

        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getPrecio() {

        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }


}
