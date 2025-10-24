package ar.edu.unahur.obj2.command;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class EncenderApagarCommandTest {
 
    private Luz luz;

    @BeforeEach
    public void setup() {
        luz = new Luz();
    }

    @Test
    public void encenderCommandEnciendeLaLuz(){
        Command enc = new EncederLuzCommand(luz);
        enc.ejecutar();
        assertTrue(luz.estaEncendida());
    }

    @Test
    public void apagarCommandApagaLaLuz(){
        luz.encender();
        Command apa = new ApagarLuzCommand(luz);
        apa.ejecutar();
        assertFalse(luz.estaEncendida());
    }
}

