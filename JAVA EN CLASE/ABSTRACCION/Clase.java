package ABSTRACCION;

public abstract class Clase {

    public Clase() {
        System.out.println("Este es un constructor de clase abstracta");
    }

    public abstract String abstract_method();
    public String nonAbstractMethod() {
        return "Este es un método normal de clase abstracta";
    }

}
