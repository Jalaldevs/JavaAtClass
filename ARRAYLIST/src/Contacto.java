public class Contacto {

    private String name;
    private String phoneNumber;

    // CONSTRUCTOR

    public Contacto(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    // GETTERS Y SETTERS

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    protected void setName(String name) {
        this.name = name;
    }

    protected void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    // METHODS

    public static Contacto createContact(String name, String phoneNumber) {
        Contacto c = new Contacto(name, phoneNumber);
        return c;
    }



}
