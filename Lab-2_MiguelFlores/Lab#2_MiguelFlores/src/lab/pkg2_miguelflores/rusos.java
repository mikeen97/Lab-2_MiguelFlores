/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.pkg2_miguelflores;

/**
 *
 * @author Miguel Flores
 */
public class rusos {

    //atributos
    private String nombre;
    private String id;
    private int edad;
    private int rango;
    private int resistencia;
    private String arma;
    private int dano;

    public rusos() {
    }

    public rusos(String nombre, String id, int edad, int rango, int resistencia, String arma, int dano) {
        this.nombre = nombre;
        this.id = id;
        this.edad = edad;
        this.rango = rango;
        this.resistencia = resistencia;
        this.arma = arma;
        this.dano = dano;
    }

    public int getDano() {
        return dano;
    }

    public void setDano(int dano) {
        this.dano = dano;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getRango() {
        return rango;
    }

    public void setRango(int rango) {
        this.rango = rango;
    }

    public int getResistencia() {
        return resistencia;
    }

    public void setResistencia(int resistencia) {
        this.resistencia = resistencia;
    }

    public String getArma() {
        return arma;
    }

    public void setArma(String arma) {
        this.arma = arma;
    }

    @Override
    public String toString() {
        return "rusos{" + "nombre=" + nombre + ", id=" + id + ", edad=" + edad + ", rango=" + rango + ", resistencia=" + resistencia + ", arma=" + arma + '}';
    }

}
