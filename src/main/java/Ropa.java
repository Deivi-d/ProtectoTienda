/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author david
 */
public final class Ropa extends Articulo {

    private String color;
    private TallaSML talla;

    public Ropa() {
    }

    public Ropa(String color, TallaSML talla, String codigo, String nombre, float precio, int stock) {
        super(codigo, nombre, precio, stock);
        this.color = color;
        this.talla = talla;
    }

    @Override
    public String toString() {
        return super.toString() + "Color: " + color + "\nTalla: " + talla + "\n";
    }

    /**
     * @return the color
     */
    public String getColor() {
        return color;
    }

    /**
     * @param color the color to set
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * @return the talla
     */
    public TallaSML getTalla() {
        return talla;
    }

    /**
     * @param talla the talla to set
     */
    public void setTalla(TallaSML talla) {
        this.talla = talla;
    }

    @Override
    public void applyPromo(String codigopromo) {
        //Si el codigo promocional es "ROPAPROMO" aplico un 20% descuento en el precio
        if (codigopromo.equals("ROPAPROMO")) {
            this.setPrecio(((float) this.getPrecio() * 0.8));
        }

    }
}
