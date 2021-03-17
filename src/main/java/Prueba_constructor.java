/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author david
 */
public class Prueba_constructor {

    private String genero;
    private int codigo;
    private String grupo;

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setGrupo(String grupo) {
        this.grupo = grupo;
    }

    public String getGenero() {
        return genero;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getGrupo() {
        return grupo;
    }

    public Prueba_constructor(String genero, int codigo, String grupo) {
        this.genero = genero;
        this.codigo = codigo;
        this.grupo = grupo;
    }

}
