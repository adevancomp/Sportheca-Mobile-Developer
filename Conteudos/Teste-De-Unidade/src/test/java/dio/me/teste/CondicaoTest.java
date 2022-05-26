package dio.me.teste;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.Test;

public class CondicaoTest {
    @Test
    void validarAlgoUsuarioAdevan(){
        Assumptions.assumeTrue("adevan".equals(System.getenv("USER")));
        Assertions.assertEquals(10,10);
    }
}
