/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tarea1_p2_michaelmartinez;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;
import javax.swing.JColorChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author Michael Martínez
 */
public class Tarea1_P2_MichaelMartinez {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        boolean bandera = true;
        ArrayList<Mascota> listaMascotas = new ArrayList();
        while (bandera) {
            String opcionMenu = JOptionPane.showInputDialog("-----INVENTARIO DE MASCOTAS-----" + "\n" + "1. Agregar" + "\n" + "2. Listar" + "\n" + "3. Modificar" + "\n" + "4. Eliminar"
                    + "\n" + "5. Mascota más antigua" + "\n" + "6. Mascota más negra" + "\n" + "7. Diferencia de edad" + "\n" + "8. Salir");
            int opcion = Integer.parseInt(opcionMenu);
            switch (opcion) {
                case 1:
                    String nombre = JOptionPane.showInputDialog("Ingrese el nombre de la mascota");
                    String tipo = JOptionPane.showInputDialog("Ingrese el tipo de la mascota");
                    Date fecha = new Date(JOptionPane.showInputDialog("Ingrese la fecha de nacimiento de la mascota (YYYY/MM/dd)"));
                    Color color = JColorChooser.showDialog(null, "Seleccione el color de la mascota", Color.yellow);
                    String valor = JOptionPane.showInputDialog("Ingrese el precio de la mascota");
                    double precio = Double.parseDouble(valor);
                    Mascota objeto = new Mascota(nombre, tipo, fecha, color, precio);
                    listaMascotas.add(objeto);
                    break;
                case 2:
                    String ver = "";
                    for (int i = 0; i < listaMascotas.size(); i++) {
                        ver += listaMascotas.get(i) + "\n";
                    }
                    JOptionPane.showMessageDialog(null, ver);

                    break;
                case 3:
                    String mascotaModificar = JOptionPane.showInputDialog(null, "Ingrese el nombre de la mascota a modificar" + "\n");
                    for (int i = 0; i < listaMascotas.size(); i++) {
                        if (mascotaModificar.equalsIgnoreCase(listaMascotas.get(i).nombre)) {
                            String modificacion = JOptionPane.showInputDialog("Ingrese el atributo a modificar" + "\n" + "1. Tipo" + "\n" + "2. Color" + "\n"
                                    + "3.Fecha de nacimiento" + "\n" + "4. Precio");
                            int opcionModificacion = Integer.parseInt(modificacion);
                            switch (opcionModificacion) {
                                case 1:
                                    String nTipo = JOptionPane.showInputDialog("Ingrese el nuevo tipo de la mascota");
                                    listaMascotas.get(i).setTipo(nTipo);
                                    break;
                                case 2:
                                    Color nColor = JColorChooser.showDialog(null, "Seleccione el nuevo color de la mascota", Color.yellow);
                                    listaMascotas.get(i).setColor(nColor);
                                    break;
                                case 3:
                                    Date nFecha = new Date(JOptionPane.showInputDialog("Ingrese la nueva fecha de nacimiento de la mascota (YYYY/MM/dd)"));
                                    listaMascotas.get(i).setFecha(nFecha);

                                    break;
                                case 4:
                                    String nValor = JOptionPane.showInputDialog("Ingrese el nuevo precio de la mascota");
                                    double nPrecio = Double.parseDouble(nValor);
                                    listaMascotas.get(i).setPrecio(nPrecio);

                                    break;
                                default:
                                    System.out.println("Opcion incorrecta");
                                    ;
                            }
                            break;
                        } else {
                            System.out.println("No se encontró la mascota");

                        }
                    }
                    break;
                case 4:
                    String mascotaEliminar = JOptionPane.showInputDialog(null, "Ingrese el nombre de la mascota a Eliminar" );
                    for (int i = 0; i < listaMascotas.size(); i++) {
                        if (mascotaEliminar.equalsIgnoreCase(listaMascotas.get(i).nombre)) {
                            listaMascotas.remove(i);
                        }
                        break;
                    }

                    break;
                case 5:

                    break;
                case 6:

                    break;
                case 7:

                    break;
                case 8:
                    bandera = false;
                    break;
                default:
                    System.out.println("Opcion incorrecta");
            }

        }

    }

}
