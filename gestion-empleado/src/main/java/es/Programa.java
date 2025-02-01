package es.ies.puerto.model;

/**
 *@author santiago
 *@version 1.0
 */

public class Programa {
    public static void main(String[] args) {
        DesarrolladorModel desarrollador = new DesarrolladorModel("Giancarlo", "404040f", 22, 1800);
        DiseniadorModel deseniador = new DiseniadorModel("Salazar", "54628l", 20, 3400);
        GerenteModel gerente = new GerenteModel("Adrian","954762w", 25, 3250);
        System.out.println(desarrollador);
        System.out.println(deseniador);
        System.out.println(gerente);
    }
}