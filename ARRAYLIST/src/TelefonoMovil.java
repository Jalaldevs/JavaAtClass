import java.util.ArrayList;

public class TelefonoMovil {

    private String myNumber;
    private ArrayList<Contacto> myContacts;

    // CONSTRUCTOR

    public TelefonoMovil(String myNumber, ArrayList<Contacto> myContacts) {
        this.myNumber = myNumber;
        this.myContacts = myContacts;
    }

    // METHODS

    public boolean addNewContact(Contacto c) {
        boolean isValid = true;
        for (int i = 0; i < myContacts.size(); i++) {
            Contacto newContact = myContacts.get(i);
            if (newContact.getName() == c.getName() || newContact.getPhoneNumber() == c.getPhoneNumber()) {
                isValid = false;
                return isValid;
            }
        }
        return isValid;
    }

    public boolean updateContact(Contacto contactoAntiguo, Contacto contactNuevo) {
        boolean isValid = false;
        for (int i = 0; i < myContacts.size(); i++) {
            Contacto listContact = myContacts.get(i);
            if (listContact == contactoAntiguo) {
                listContact.setName(contactNuevo.getName());
                listContact.setPhoneNumber(contactNuevo.getPhoneNumber());
                isValid = true;
                return isValid;
            }
        }
        return isValid;
    }

    public boolean removeContact(Contacto c) {
        boolean isValid = false;
        for (int i = 0; i < myContacts.size(); i++) {
            Contacto listContact = myContacts.get(i);
            if (listContact == c) {
                myContacts.remove(listContact);
                isValid = true;
                return isValid;
            }

        }
        return isValid;
    }

    public int findContact(Contacto c) {
        int contador = 0;
        int indexList = -1;
        for (int i = 0; i < myContacts.size(); i++) {
            Contacto listContact = myContacts.get(i);
            if (listContact == c) {
                contador++;
                indexList = myContacts.indexOf(c);
            }
        }
        return indexList;
    }

    public int findContact(String nombre) {
        int contador = 0;
        int indexList = -1;
        for (int i = 0; i < myContacts.size(); i++) {
            Contacto listContact = myContacts.get(i);
            if (listContact.getName() == nombre) {
                contador++;
                indexList = myContacts.indexOf(listContact);
            }
        }
        return indexList;
    }

    public Contacto queryContact(String nombre) {
        for (int i = 0; i < myContacts.size(); i++) {
            Contacto listContact = myContacts.get(i);
            if (listContact.getName() == nombre) {
                return listContact;
            }
        }
        return null;
    }

    public String printContacts() {
        String print = "";
        for (int i = 0; i < myContacts.size(); i++) {
            Contacto listContact = myContacts.get(i);
            print += listContact.getName() + " -> " + listContact.getPhoneNumber() + "\n";
        }
        return print;
    }


}
