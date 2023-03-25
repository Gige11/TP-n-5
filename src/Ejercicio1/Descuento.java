package Ejercicio1;

public class Descuento {

    double montoInicial;
    double montoConDescuento;

    public Descuento(double montoInicial) {
        this.montoInicial = montoInicial;
    }

    public void CalcularDescuento(){

        montoConDescuento = montoInicial*0.9;
        System.out.println("Monto final con desc. = "+montoConDescuento);
    }
}
