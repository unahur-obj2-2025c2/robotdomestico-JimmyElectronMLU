package ar.edu.unahur.obj2.command;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class LuzTest {

    private Luz luz;

    @BeforeEach
    public void setup() {
        luz = new Luz();
    }

    @Test
    public void estadoInicialApagado(){
        assertFalse(luz.estaEncendida(),"La luz debe comenzar apagada.");
    }

    @Test
    public void estadoCambiaDeApagadoAEncendido(){
        luz.encender();
        assertTrue(luz.estaEncendida());
    }

    @Test
    public void estadoCambiaDeEncendidoAApagado(){
        luz.encender();
        luz.apagar();
        assertFalse(luz.estaEncendida());
    }

}
