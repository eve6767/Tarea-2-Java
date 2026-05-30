import java.time.Instant;

/**
 * Clase para marcar asistencia de los empleados.
 * Guarda el nombre y la hora a la que este llega.
 */
public class Asistencia {
    private Empleado empleado;
    private Instant horaLlegada;

    /**
     * Constructor que guarda los datos del empleado y su Fecha de llegada.
     */
    public Asistencia(Empleado empleado, Instant horaLlegada) {
        this.empleado = empleado;
        this.horaLlegada = horaLlegada;
    }

    /**
     * Getter que busca al empleado.
     * @return Empleado y sus datos.
     */
    public Empleado getEmpleado() {
        return empleado;
    }

    /**
     * Getter que busca la hora de llegada.
     * @return La hora de llegada del empleado.
     */
    public Instant getHoraLlegada() {
        return horaLlegada; }
}