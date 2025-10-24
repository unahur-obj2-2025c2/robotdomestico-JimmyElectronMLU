package ar.edu.unahur.obj2.command;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ControlRemotoExceptionTest {

    private Luz luz;
    private ControlRemoto remoto;

    @BeforeEach
    public void setup() {
        remoto = new ControlRemoto();
        luz = new Luz();
    }

    @Test
    public void encenderYApagarViaControlRemoto() throws CommandNotSetException{
        remoto.setComando(new EncederLuzCommand(luz));
        remoto.presionarBoton();
        assertTrue(luz.estaEncendida());

        remoto.setComando(new ApagarLuzCommand(luz));
        remoto.presionarBoton();
        assertFalse(luz.estaEncendida());
    }
    @Test
    public void presionarSinComandoLanzaCommandoNotSet(){
        assertThrows(CommandNotSetException.class, () -> remoto.presionarBoton());
    }
}
