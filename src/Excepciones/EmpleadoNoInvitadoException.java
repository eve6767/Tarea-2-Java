package Excepciones;

public class EmpleadoNoInvitadoException extends RuntimeException {
    public EmpleadoNoInvitadoException(String mensaje) {
        super(mensaje);
    }
}