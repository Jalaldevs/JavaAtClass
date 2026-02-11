import java.util.ArrayList;

public class TelefonoMovil {

    private String myNumber;
    private ArrayList<Contacto> myContacts;

    public TelefonoMovil(String myNumber, ArrayList<Contacto> myContacts) {
        this.myNumber = myNumber;
        this.myContacts = myContacts;
    }

    public boolean addNewContact(Contacto c) {
        for (Contacto contacto : myContacts) {
            // ⭐ CAMBIO: == por .equals()
            if (contacto.getName().equals(c.getName()) ||
                    contacto.getPhoneNumber().equals(c.getPhoneNumber())) {
                return false;
            }
        }
        myContacts.add(c); // ⭐ Agregar aquí
        return true;
    }

    public boolean updateContact(Contacto contactoAntiguo, Contacto contactoNuevo) {
        int index = myContacts.indexOf(contactoAntiguo);
        if (index >= 0) {
            myContacts.get(index).setName(contactoNuevo.getName());
            myContacts.get(index).setPhoneNumber(contactoNuevo.getPhoneNumber());
            return true;
        }
        return false;
    }

    public boolean removeContact(Contacto c) {
        return myContacts.remove(c);
    }

    public int findContact(String nombre) {
        for (int i = 0; i < myContacts.size(); i++) {
            // ⭐ CAMBIO: == por .equals()
            if (myContacts.get(i).getName().equals(nombre)) {
                return i;
            }
        }
        return -1;
    }

    public Contacto queryContact(String nombre) {
        for (Contacto contacto : myContacts) {
            // ⭐ CAMBIO: == por .equals()
            if (contacto.getName().equals(nombre)) {
                return contacto;
            }
        }
        return null;
    }

    public String printContacts() {
        if (myContacts.isEmpty()) {
            return "No hay contactos guardados.";
        }
        StringBuilder print = new StringBuilder();
        for (Contacto contacto : myContacts) {
            print.append(contacto.getName())
                    .append(" -> ")
                    .append(contacto.getPhoneNumber())
                    .append("\n");
        }
        return print.toString();
    }
}