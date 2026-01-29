public class MainHabitacion {

    public static void main(String[] args) {

        Habitacion habitacion = new Habitacion(
                "Habitación Principal",
                new Pared("Norte"),
                new Pared("Sur"),
                new Pared("Este"),
                new Pared("Oeste"),
                new Techo(250, 0xFFFFFF),
                new Cama("Moderna", 2, 50, 1, 1),
                new Lampara("Clásica", true, 5)
        );

        // Todo se hace DESDE la habitación
        habitacion.hacerLaCama();
        habitacion.getLampara().encender();
    }
}
