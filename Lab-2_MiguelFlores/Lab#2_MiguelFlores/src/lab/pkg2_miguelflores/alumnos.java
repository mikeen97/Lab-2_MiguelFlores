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
public class alumnos {

    //atributos 
    private String apodo;
    private String cuenta;
    private int edad;
    private int resistencia;
    private int grado;
    private String arma;
    private int dano;

    public alumnos() {
    }

    public alumnos(String apodo, String cuenta, int edad, int resistencia, int grado, String arma, int dano) {
        this.apodo = apodo;
        this.cuenta = cuenta;
        this.edad = edad;
        this.resistencia = resistencia;
        this.grado = grado;
        this.arma = arma;
        this.dano = dano;
    }

    public int getDano() {
        return dano;
    }

    public void setDano(int dano) {
        this.dano = dano;
    }

    public String getApodo() {
        return apodo;
    }

    public void setApodo(String apodo) {
        this.apodo = apodo;
    }

    public String getCuenta() {
        return cuenta;
    }

    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getResistencia() {
        return resistencia;
    }

    public void setResistencia(int resistencia) {
        this.resistencia = resistencia;
    }

    public int getGrado() {
        return grado;
    }

    public void setGrado(int grado) {
        this.grado = grado;
    }

    public String getArma() {
        return arma;
    }

    public void setArma(String arma) {
        this.arma = arma;
    }

    @Override
    public String toString() {
        return "alumnos{" + "apodo=" + apodo + ", cuenta=" + cuenta + ", edad=" + edad + ", resistencia=" + resistencia + ", grado=" + grado + ", arma=" + arma + '}';
    }

}
