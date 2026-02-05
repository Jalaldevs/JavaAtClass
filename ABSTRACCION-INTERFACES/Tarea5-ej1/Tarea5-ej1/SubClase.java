package ABSTRACCION;

public class SubClase extends Clase {

    public SubClase() {
    }

    @Override
    public String abstract_method() {
        return  "Este es un método" +
                " abstracto implementado en una clase no abstracta";
    }
}
