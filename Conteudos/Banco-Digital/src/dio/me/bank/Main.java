package dio.me.bank;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        Banco dio = new Banco();
        dio.setNome("Banco Digital Innovation One");
        SwingUtilities.invokeLater(()->{
            App app = new App();
            app.setVisible(true);
        });

    }
}