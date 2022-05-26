package dio.me.teste;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

public class PessoaTest {
    @Test
    void validaCalculoIdadeEmaiorDeIdade(){
        Pessoa joana = new Pessoa("Joana Liva de Araújo", LocalDate.of(2012,9,23));
        assertEquals(9,joana.calculaIdade());
        assertFalse(joana.ehMaiorDeIdade());

        Pessoa pedro = new Pessoa("Pedro Henrique Araújo", LocalDate.of(1999,9,23));
        assertTrue(pedro.ehMaiorDeIdade());
    }

    @Test
    void testantoOutrosArrays(){
        int[] a1 = {1,2,3,4,5,6};
        int[] a2 = {10,20,30,40,50,60};

        assertNotEquals(a1,a2);

        Pessoa pessoa = null;

        assertNull(pessoa);
    }

}
