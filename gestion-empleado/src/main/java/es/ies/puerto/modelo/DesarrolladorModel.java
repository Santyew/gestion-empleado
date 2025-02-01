package es.ies.puerto.model;

/**
 *@author santiago
 *@version 1.0
 */

public class DesarrolladorModel extends EmpleadoModel {

    /**
     * Constructor vacio
     */

    public DesarrolladorModel(){
        super();
    }

    /**
     * Constructor para la busqueda
     * @param id
     */

    public DesarrolladorModel(String id){
        super(id);
    }

    /**
     * Constructor completo
     * @param nombre del desarrollador
     * @param id de identificacion del desarrollador
     * @param edad del desarrollador
     * @param salarioBase  del desarrollador
     */

    public DesarrolladorModel(String nombre, String id, int edad, double salarioBase){
        super(nombre, id, edad, salarioBase);
    }

    /**
     * Salario base + un 20%
     */

    @Override
    public double calcularSalarioFinal() {
        return getSalarioBase() * 0.2;
    }

    @Override
    public String toString() {
        return "Empleado: Diseñador" + super.toString() ;
    }
}