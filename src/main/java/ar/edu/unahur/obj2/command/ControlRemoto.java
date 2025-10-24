package ar.edu.unahur.obj2.command;

public class ControlRemoto {

    private Command comando;

    public void setComando(Command comando) {
        this.comando = comando;
    }

    public void presionarBoton() throws CommandNotSetException {
        if (this.comando == null){
            throw new CommandNotSetException("No se ha configurado un comando en el control.");
        }
        this.comando.ejecutar();
    }

}
