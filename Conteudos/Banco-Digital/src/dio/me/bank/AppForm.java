package dio.me.bank;

import javax.swing.*;

public abstract class AppForm extends JFrame {

    protected JLabel lblConta;
    protected JTextField txtConta;

    public AppForm(){
        this.inicializar();
    }

    public void inicializar(){
        this.setTitle("App Banco Digital DIO");
        this.setSize(640,480);

    }

}
