/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.pkg2_miguelflores;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Miguel Flores
 */
public class Lab2_MiguelFlores {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String estado = " ";
        String opcion = " ";
        ArrayList<alemanes> alemanes = new ArrayList();//agregar 
        ArrayList<rusos> rusos = new ArrayList();//agregar
        ArrayList<alumnos> alumnos = new ArrayList();//agregar
        while (!opcion.equalsIgnoreCase("f")) {
            opcion = JOptionPane.showInputDialog("Menu\n"
                    + "a- Base de Rusos\n"
                    + "b- Base de Alemanes\n"
                    + "c- Base de Alumnos\n"
                    + "d- Simular batalla\n"
                    + "f- Salir\n");
            // BASE RUSA
            //
            if (opcion.equals("a")) {
                while (!opcion.equalsIgnoreCase("e")) {
                    opcion = JOptionPane.showInputDialog("Menu\n"
                            + "a- Agregar soldado Ruso\n"
                            + "b- Eliminar soldado Ruso\n"
                            + "c- Listar soldados Rusos\n"
                            + "d- Modificar soldados Rusos\n"
                            + "e- Salir del batallon\n");
                    if (opcion.equals("a")) {
                        String nombre, id, arma;
                        int rango, nivel, resistencia;
                        int edad = 0;
                        int dano = 0;
                        nombre = (JOptionPane.showInputDialog("Ingrese nombre del soldado: "));
                        id = (JOptionPane.showInputDialog("Ingrese el ID del soldado: "));
                        edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese Edad del soldado: "));
                        if (edad < 18) {
                            edad = 18;
                        }
                        rango = Integer.parseInt(JOptionPane.showInputDialog("Ingrese rango del soldado: [mayor que 1]"));
                        if (edad < 26) {
                            arma = (JOptionPane.showInputDialog("Ingrese el arma del soldado: [AK-47, REVOLVER"));
                        } else {
                            arma = (JOptionPane.showInputDialog("Ingrese el arma del soldado: [AK-47, REVOLVER, RPG-7]"));
                        }
                        resistencia = edad * 8;
                        if (arma.equalsIgnoreCase("ak-47")) {
                            dano = 27;
                        }
                        if (arma.equalsIgnoreCase("revolver")) {
                            dano = 13;
                        }
                        if (arma.equalsIgnoreCase("rpg-7")) {
                            dano = 57;
                        }
                        rusos.add(new rusos(nombre, id, edad, rango, resistencia, arma, dano));
                    }
                    if (opcion.equals("b")) {
                        int p = Integer.parseInt(
                                JOptionPane.showInputDialog("Posicion de Soldado ruso a Eliminar"));
                        rusos.remove(p);
                    }
                    if (opcion.equals("c")) {
                        String p1 = "";
                        for (Object t1 : rusos) {
                            if (t1 instanceof rusos) {
                                p1 += rusos.indexOf(t1) + " " + ((rusos) t1) + "\n";
                            }
                        }
                        JOptionPane.showMessageDialog(null, p1);
                    }
                    if (opcion.equals("d")) {
                        int pos = Integer.parseInt(
                                JOptionPane.showInputDialog("Ingrese la Posicion del Soldado a modificar: "));
                        String nombre, id, arma;
                        int rango, nivel, resistencia;
                        int edad = 0;

                        nombre = (JOptionPane.showInputDialog("Ingrese nombre del soldado: "));
                        id = (JOptionPane.showInputDialog("Ingrese el ID del soldado: "));
                        edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese Edad del soldado: "));
                        if (edad < 18) {
                            edad = 18;
                        }
                        rango = Integer.parseInt(JOptionPane.showInputDialog("Ingrese rango del soldado: [mayor que 1]"));
                        arma = (JOptionPane.showInputDialog("Ingrese el arma del soldado: [AK-47, REVOLVER, RPG-7]"));
                        int dano = 0;
                        if (arma.equalsIgnoreCase("ak-47")) {
                            dano = 27;
                        }
                        if (arma.equalsIgnoreCase("revolver")) {
                            dano = 13;
                        }
                        if (arma.equalsIgnoreCase("rpg-7")) {
                            dano = 57;
                        }
                        resistencia = edad * 8;
                        rusos.get(pos).setNombre(nombre);
                        rusos.get(pos).setId(id);
                        rusos.get(pos).setEdad(edad);
                        rusos.get(pos).setRango(rango);
                        rusos.get(pos).setResistencia(resistencia);
                        rusos.get(pos).setArma(arma);
                        rusos.get(pos).setDano(dano);
                    }
                }
            }
            // BASE ALEMANA
            //
            if (opcion.equals("b")) {
                while (!opcion.equalsIgnoreCase("e")) {
                    opcion = JOptionPane.showInputDialog("Menu\n"
                            + "a- Agregar soldado Aleman\n"
                            + "b- Eliminar soldado Aleman\n"
                            + "c- Listar soldados Aleman\n"
                            + "d- Modificar soldados Aleman\n"
                            + "e- Salir del batallon Aleman\n");
                    if (opcion.equals("a")) {
                        String alias, casta, arma;
                        int resistencia;
                        int edad = 0;
                        alias = (JOptionPane.showInputDialog("Ingrese alias del soldado: "));
                        edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese Edad del soldado: "));
                        if (edad < 0) {
                            edad = 0;
                        }
                        casta = (JOptionPane.showInputDialog("Ingrese Casta"));
                        arma = (JOptionPane.showInputDialog("Ingrese el arma del soldado: [Ametralladora, MP-40,PISTOLAS]"));
                        resistencia = edad * 8;
                        int dano = 0;
                        if (arma.equalsIgnoreCase("ametralladora")) {
                            dano = 32;
                        }
                        if (arma.equalsIgnoreCase("mp-40")) {
                            dano = 25;
                        }
                        if (arma.equalsIgnoreCase("pistolas")) {
                            dano = 11;
                        }
                        alemanes.add(new alemanes(alias, edad, casta, resistencia, arma, dano));
                    }
                    if (opcion.equals("b")) {
                        int p = Integer.parseInt(
                                JOptionPane.showInputDialog("Posicion de Soldado Aleman a Eliminar"));
                        alemanes.remove(p);
                    }
                    if (opcion.equals("c")) {
                        String p1 = "";
                        for (Object t1 : alemanes) {
                            if (t1 instanceof alemanes) {
                                p1 += alemanes.indexOf(t1) + " " + ((alemanes) t1) + "\n";
                            }
                        }
                        JOptionPane.showMessageDialog(null, p1);
                    }
                    if (opcion.equals("d")) {
                        int pos = Integer.parseInt(
                                JOptionPane.showInputDialog("Ingrese la Posicion del Soldado a modificar: "));
                        String alias, casta, arma;
                        int resistencia;
                        int edad = 0;
                        alias = (JOptionPane.showInputDialog("Ingrese alias del soldado: "));
                        edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese Edad del soldado: "));
                        if (edad < 0) {
                            edad = 0;
                        }
                        casta = (JOptionPane.showInputDialog("Ingrese Casta"));
                        arma = (JOptionPane.showInputDialog("Ingrese el arma del soldado: [Ametralladora, MP-40,PISTOLAS]"));
                        resistencia = edad * 8;
                        int dano = 0;
                        if (arma.equalsIgnoreCase("ak-47")) {
                            dano = 32;
                        }
                        if (arma.equalsIgnoreCase("revolver")) {
                            dano = 25;
                        }
                        if (arma.equalsIgnoreCase("rpg-7")) {
                            dano = 11;
                        }
                        alemanes.get(pos).setAlias(alias);
                        alemanes.get(pos).setEdad(edad);
                        alemanes.get(pos).setCasta(casta);
                        alemanes.get(pos).setResistencia(resistencia);
                        alemanes.get(pos).setArma(arma);
                        alemanes.get(pos).setDano(dano);
                    }
                }
            }
            ///BATALLON DE PROGRAMACION II
            ///
            if (opcion.equals("c")) {
                while (!opcion.equalsIgnoreCase("e")) {
                    opcion = JOptionPane.showInputDialog("Menu\n"
                            + "a- Agregar soldado de Programacion II\n"
                            + "b- eliminar soldados de Programacion II\n"
                            + "c- Listar soldados de Programacion II\n"
                            + "d- Modificar soldados de Programacion II\n"
                            + "e- Salir del batallon de Programacion II\n");
                    if (opcion.equals("a")) {
                        String apodo, id, arma;
                        int grado, resistencia;
                        int edad = 0;
                        apodo = (JOptionPane.showInputDialog("Ingrese apodo del soldado: "));
                        id = (JOptionPane.showInputDialog("Ingrese el numero de cuenta del soldado: "));
                        edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese Edad del soldado: "));
                        if (edad < 16) {
                            edad = 16;
                        }
                        grado = Integer.parseInt(JOptionPane.showInputDialog("Ingrese grado academico del soldado:"));
                        arma = (JOptionPane.showInputDialog("Ingrese el arma del soldado: [Discos-duros, controles-wii, laptops]"));
                        resistencia = edad * 8;
                        int dano = 0;
                        if (arma.equalsIgnoreCase("discos-duros")) {
                            dano = 23;
                        }
                        if (arma.equalsIgnoreCase("controles-wii")) {
                            dano = 47;
                        }
                        if (arma.equalsIgnoreCase("laptops")) {
                            dano = 76;
                        }
                        alumnos.add(new alumnos(apodo, id, edad, resistencia, grado, arma, dano));
                    }
                    if (opcion.equals("b")) {
                        int p = Integer.parseInt(
                                JOptionPane.showInputDialog("Posicion de Soldado de Programacion II a Eliminar"));
                        alumnos.remove(p);
                    }
                    if (opcion.equals("c")) {
                        String p1 = "";
                        for (Object t1 : alumnos) {
                            if (t1 instanceof alumnos) {
                                p1 += alumnos.indexOf(t1) + " " + ((alumnos) t1) + "\n";
                            }
                        }
                        JOptionPane.showMessageDialog(null, p1);
                    }
                    if (opcion.equals("d")) {
                        int pos = Integer.parseInt(
                                JOptionPane.showInputDialog("Ingrese la Posicion del Soldado a modificar: "));
                        String apodo, id, arma;
                        int grado, resistencia;
                        int edad = 0;
                        apodo = (JOptionPane.showInputDialog("Ingrese apodo del soldado: "));
                        id = (JOptionPane.showInputDialog("Ingrese el numero de cuenta del soldado: "));
                        edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese Edad del soldado: "));
                        if (edad < 16) {
                            edad = 16;
                        }
                        grado = Integer.parseInt(JOptionPane.showInputDialog("Ingrese grado academico del soldado:"));
                        arma = (JOptionPane.showInputDialog("Ingrese el arma del soldado: [Discos-duros, controles-wii, laptops]"));
                        resistencia = edad * 8;
                        int dano = 0;
                        if (arma.equalsIgnoreCase("discos-duros")) {
                            dano = 23;
                        }
                        if (arma.equalsIgnoreCase("controles-wii")) {
                            dano = 47;
                        }
                        if (arma.equalsIgnoreCase("laptops")) {
                            dano = 76;
                        }
                        alumnos.get(pos).setApodo(apodo);
                        alumnos.get(pos).setCuenta(id);
                        alumnos.get(pos).setEdad(edad);
                        alumnos.get(pos).setGrado(grado);
                        alumnos.get(pos).setResistencia(resistencia);
                        alumnos.get(pos).setArma(arma);
                        alumnos.get(pos).setDano(dano);
                    }
                }
            }
            //Simulador de batalla
            if (opcion.equals("d")) {
                //primer round 
                ///////////////
                int resistencia_1 = 0; //aleman
                int dano_1 = 0; //aleman
                int resistencia = 0; //ruso 
                int dano = 0;//ruso
                boolean sale = false;
                for (rusos t1 : rusos) {//primer equipo
                    if (t1 instanceof rusos) {
                        ((rusos) t1).setResistencia(resistencia - dano_1);
                        resistencia = ((rusos) t1).getResistencia();
                        dano = ((rusos) t1).getDano();
                        if (resistencia == 0) {
                            alemanes.remove(t1);
                        }
                    }
                    for (alemanes t2 : alemanes) {//segundo equipo
                        if (t2 instanceof alemanes) {
                            sale = false;
                            if (sale == true) {
                                break;
                            }
                            resistencia_1 = ((alemanes) t2).getResistencia();
                            dano_1 = ((alemanes) t2).getDano();
                            ((alemanes) t2).setResistencia(resistencia_1 - dano);
                            sale = true;
                            if (resistencia_1 == 0) {
                                alemanes.remove(t2);
                            }
                        }
                    }
                }

                //segundo round 
                resistencia_1 = 0; //aleman
                dano_1 = 0; //aleman
                resistencia = 0; //ruso 
                dano = 0;//ruso
                boolean sale0 = false;
                for (rusos t1 : rusos) {//primer equipo
                    if (t1 instanceof rusos) {
                        ((rusos) t1).setResistencia(resistencia - dano_1);
                        resistencia = ((rusos) t1).getResistencia();
                        dano = ((rusos) t1).getDano();
                        if (resistencia == 0) {
                            alemanes.remove(t1);
                        }
                    }
                    for (alumnos t2 : alumnos) {//segundo equipo
                        if (t2 instanceof alumnos) {
                            sale = false;
                            if (sale == true) {
                                break;
                            }
                            resistencia_1 = ((alumnos) t2).getResistencia();
                            dano_1 = ((alumnos) t2).getDano();
                            ((alumnos) t2).setResistencia(resistencia_1 - dano);
                            sale = true;
                            if (resistencia_1 == 0) {
                                alumnos.remove(t2);
                            }
                        }
                    }
                }

                //tercer round
                resistencia_1 = 0; //aleman
                dano_1 = 0; //aleman
                resistencia = 0; //ruso 
                dano = 0;//ruso
                sale = false;
                for (alemanes t1 : alemanes) {//primer equipo
                    if (t1 instanceof alemanes) {
                        ((alemanes) t1).setResistencia(resistencia - dano_1);
                        resistencia = ((alemanes) t1).getResistencia();
                        dano = ((alemanes) t1).getDano();
                        if (resistencia == 0) {
                            alemanes.remove(t1);
                        }
                    }
                    for (rusos t2 : rusos) {//segundo equipo
                        if (t2 instanceof rusos) {
                            sale = false;
                            if (sale == true) {
                                break;
                            }
                            resistencia_1 = ((rusos) t2).getResistencia();
                            dano_1 = ((rusos) t2).getDano();
                            ((rusos) t2).setResistencia(resistencia_1 - dano);
                            sale = true;
                            if (resistencia_1 == 0) {
                                rusos.remove(t2);
                            }
                        }
                    }
                }
                //cuarto round
                resistencia_1 = 0; //aleman
                dano_1 = 0; //aleman
                resistencia = 0; //ruso 
                dano = 0;//ruso
                sale = false;
                for (alemanes t1 : alemanes) {//primer equipo
                    if (t1 instanceof alemanes) {
                        ((alemanes) t1).setResistencia(resistencia - dano_1);
                        resistencia = ((alemanes) t1).getResistencia();
                        dano = ((alemanes) t1).getDano();
                        if (resistencia == 0) {
                            alemanes.remove(t1);
                        }
                    }
                    for (alumnos t2 : alumnos) {//segundo equipo
                        if (t2 instanceof alumnos) {
                            sale = false;
                            if (sale == true) {
                                break;
                            }
                            resistencia_1 = ((alumnos) t2).getResistencia();
                            dano_1 = ((alumnos) t2).getDano();
                            ((alumnos) t2).setResistencia(resistencia_1 - dano);
                            sale = true;
                            if (resistencia_1 == 0) {
                                alumnos.remove(t2);
                            }
                        }
                    }
                }
                //quinto round
                resistencia_1 = 0; //aleman
                dano_1 = 0; //aleman
                resistencia = 0; //ruso 
                dano = 0;//ruso
                sale = false;
                for (alumnos t1 : alumnos) {//primer equipo
                    if (t1 instanceof alumnos) {
                        ((alumnos) t1).setResistencia(resistencia - dano_1);
                        resistencia = ((alumnos) t1).getResistencia();
                        dano = ((alumnos) t1).getDano();
                        if (resistencia == 0) {
                            alumnos.remove(t1);
                        }
                    }
                    for (rusos t2 : rusos) {//segundo equipo
                        if (t2 instanceof rusos) {
                            sale = false;
                            if (sale == true) {
                                break;
                            }
                            resistencia_1 = ((rusos) t2).getResistencia();
                            dano_1 = ((rusos) t2).getDano();
                            ((rusos) t2).setResistencia(resistencia_1 - dano);
                            sale = true;
                            if (resistencia_1 == 0) {
                                rusos.remove(t2);
                            }
                        }
                    }
                }
                //sexto round
                resistencia_1 = 0; //aleman
                dano_1 = 0; //aleman
                resistencia = 0; //ruso 
                dano = 0;//ruso
                sale = false;
                for (alumnos t1 : alumnos) {//primer equipo
                    if (t1 instanceof alumnos) {
                        ((alumnos) t1).setResistencia(resistencia - dano_1);
                        resistencia = ((alumnos) t1).getResistencia();
                        dano = ((alumnos) t1).getDano();
                        if (resistencia == 0) {
                            alumnos.remove(t1);
                        }
                    }
                    for (alemanes t2 : alemanes) {//segundo equipo
                        if (t2 instanceof alemanes) {
                            sale = false;
                            if (sale == true) {
                                break;
                            }
                            resistencia_1 = ((alemanes) t2).getResistencia();
                            dano_1 = ((alemanes) t2).getDano();
                            ((alemanes) t2).setResistencia(resistencia_1 - dano);
                            sale = true;
                            if (resistencia_1 == 0) {
                                alemanes.remove(t2);
                            }
                        }
                    }
                    
                }
                
                //fin batalla
            }
        }
    }
}
