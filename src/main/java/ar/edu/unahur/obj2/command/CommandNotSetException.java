package ar.edu.unahur.obj2.command;

public class CommandNotSetException extends Exception {
    public CommandNotSetException(String mensaje){
        super(mensaje);
    }

}
