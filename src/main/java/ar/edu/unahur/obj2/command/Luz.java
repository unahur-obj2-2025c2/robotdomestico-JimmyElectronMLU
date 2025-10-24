package ar.edu.unahur.obj2.command;

public class Luz {

    private Boolean estado = false;

    public Boolean estaEncendida() {
        return this.estado;    
    }

    public void encender() {
        estado = true;
    }

    public void apagar() {
        estado = false;
    }

}
