package es.ies.puerto.model;

/**
 *@author santiago
 *@version 1.0
 */

public class DiseyadorModel extends EmpleadoModel {

    /**
     * Constructor vacio
     */

    public DiseyadorModel(){
        super();
    }

    /**
     * Constructor para la busqueda
     * @param id
     */

    public DiseyadorModel(String id){
        super(id);
    }

    /**
     * Constructor completo
     * @param nombre del diseyador
     * @param id de identificacion del diseyador
     * @param edad del diseyador
     * @param salarioBase  del diseyador
     */

    public DiseyadorModel(String nombre, String id, int edad, double salarioBase){
        super(nombre, id, edad, salarioBase);
    }

    /**
     * Su salario + un 10%
     */

    @Override
    public double calcularSalarioFinal() {
        return getSalarioBase()*0.10;
    }
    
    @Override
    public String toString() {
        return "Empleado: Desarrollador" + super.toString() ;
    }
}