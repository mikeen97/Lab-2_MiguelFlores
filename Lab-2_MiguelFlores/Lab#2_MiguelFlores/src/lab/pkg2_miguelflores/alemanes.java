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
public class alemanes {
//atributos

    private String alias;
    private int edad;
    private String casta;
    private int resistencia;
    private String arma;
    private int dano;

    public alemanes() {
    }

    public alemanes(String alias, int edad, String casta, int resistencia, String arma, int dano) {
        this.alias = alias;
        this.edad = edad;
        this.casta = casta;
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

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getCasta() {
        return casta;
    }

    public void setCasta(String casta) {
        this.casta = casta;
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
        return "alemanes{" + "alias=" + alias + ", edad=" + edad + ", casta=" + casta + ", resistencia=" + resistencia + ", arma=" + arma + '}';
    }

}
