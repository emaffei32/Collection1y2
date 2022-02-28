/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Elizabeth Maffei
 */
public class Servicios {

    private Scanner leer;
    private ArrayList<String> razas;

    public Servicios() {
        this.razas = new ArrayList();
        this.leer = new Scanner(System.in);
    }

    //metodo para pedir las razas
    public void pedirRaza() {
        String respuesta;
        int contRazas = 1;
        do {
            System.out.println("Ingrese una raza de perro, ingreso n° " + contRazas);
            String razaIngresada = leer.nextLine();
            razas.add(razaIngresada);
            contRazas++;
            System.out.println("Desea continuar ingresando razas? si/no");
            respuesta = leer.nextLine();
        } while (respuesta.equals("si"));

    }

    //metodo para mostrar el array list
    public void mostrarRazas() {
        System.out.println("Las razas de perros ingresadas fueron :");
        for (String aux : razas) {
            System.out.println(aux);

        }
        System.out.println("En total ingreso : " + razas.size() + " razas");

    }

    //metodo para pedir y borrar elemento del arrayList
    public void buscarRaza() {
        System.out.println("****Ejercicio 2******");
        System.out.println("Ingrese la raza de perro que desea eliminar");
        String razaBuscada = leer.nextLine();
        String r = "";
        for (int i = 0; i < razas.size(); i++) {
            r = razas.get(i);
            if (r.equals(razaBuscada)) {
                razas.remove(r);

            }
        }
        if (r.equals(razaBuscada) == true) {

            System.out.println("Usted elimino a " + razaBuscada + ". Su lista es :");
        } else {
            System.out.println("La raza no fue encontrada. Su lista es :");
        }
        //Collections.sort(razas);

        razas.forEach((e) -> System.out.println(e));

    }

}
