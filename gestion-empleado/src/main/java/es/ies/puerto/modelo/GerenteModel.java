package es.ies.puerto.model;

/**
 *@author santiago
 *@version 1.0
 */

public class GerenteModel extends EmpleadoModel {
    /**
     * Constructor vacio
     */

    public GerenteModel(){
        super();
    }

    /**
     * Constructor para la busqueda
     * @param id
     */

    public GerenteModel(String id){
        super(id);
    }

    /**
     * Constructor completo
     * @param nombre del gerente
     * @param id de identificacion del gerente
     * @param edad del gerente
     * @param salarioBase  del gerente
     */

    public GerenteModel(String nombre, String id, int edad, double salarioBase){
        super(nombre, id, edad, salarioBase);
    }

    /**
     * Salario base + un 30%
     */

    @Override
    public double calcularSalarioFinal() {
        return getSalarioBase() * 0.3;
    }

    @Override
    public String toString() {
        return "Empleado: Gerente" + super.toString() ;
    }
}