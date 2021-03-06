

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author david
 */
public class Electrodomestico extends Articulo {

    private ClaseE clasificacion;
    private String gama;

    public Electrodomestico() {
    }

    public Electrodomestico(String gama, ClaseE clasificacion,
            String codigo, String nombre,
            float precio, int stock) {
        super(codigo, nombre, precio, stock);
        this.gama = gama;
        this.clasificacion = clasificacion;
    }

    public String getGama() {
        return gama;
    }

    public void setGama(String gama) {
        this.gama = gama;
    }

    public ClaseE getClasificacion() {
        return clasificacion;
    }

    public void setClasificacion(ClaseE clasif) {
        this.clasificacion = clasif;
    }

    @Override
    public String toString() {
        return super.toString() + "Gama: " + getGama() + "\nClasificacion: " + getClasificacion() + "\n";
    }

    @Override
    public void applyPromo(String codigopromo) {
        //Si el codigo promocional es SINIVA aplicamos un 21% de descuento
        //Si el codigo promocional es ELECPROMO aplicamos un 10%
        if (codigopromo.equals("SINIVA")) {
            this.setPrecio(((float) this.getPrecio() * 0.79));
        }
        if (codigopromo.equals("ELECPROMO")) {
            this.setPrecio(((float) this.getPrecio() * 0.9));
        }

    }
}
