package ar.edu.unahur.obj2.command;

public class ApagarLuzCommand implements Command{

    private Luz luz;

    public ApagarLuzCommand(Luz unaLuz) {
        if (unaLuz == null) {
            throw new IllegalArgumentException("Luz no puede ser null.");
        }
        this.luz = unaLuz;
    }

    @Override
    public void ejecutar() {
        this.luz.apagar();
    }

}
