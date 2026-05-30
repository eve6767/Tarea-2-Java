import java.time.Instant;

/**
 * Clase para invitar a empleados y externos, guardando la fecha de invitación y la persona.
 */

public class Invitacion {
    private Invitable invitado;
    private Instant horaInvitacion;

    /**
     * Constructor que guarda al invitado, y instancia la hora de llamada del metodo.
     * @param invitado es el invitado.
     */
    public Invitacion(Invitable invitado) {
        this.invitado = invitado;
        this.horaInvitacion = Instant.now();
    }

    /**
     * Getter que busca al invitado
     * @return invitado.
     */
    public Invitable getInvitado() {
        return invitado;
    }

    /**
     * getter que busca la hora de la invitacion.
     * @return Instant con la hora de la invitacion.
     */
    public Instant getHoraInvitacion() {
        return horaInvitacion;
    }
}