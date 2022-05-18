package dio.me.adevan;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PessoaTeste {
    @Test
    void TesteMaiorIdade(){
        Pessoa p1 = new Pessoa("Adevan Neves Santos",19);
        Assertions.assertTrue(p1.maiorIdade());

        Pessoa p2 = new Pessoa("Paulo Cativo",18);
        Assertions.assertTrue(p1.maiorIdade());
    }

}
