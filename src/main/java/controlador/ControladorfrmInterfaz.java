package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import modelo.Operaciones;
import vista.frmInterfaz;

public class ControladorfrmInterfaz {
    private Operaciones modelo;
    private frmInterfaz vista;
      
    

    public ControladorfrmInterfaz(Operaciones modelo, frmInterfaz vista) {
        this.modelo = modelo;
        this.vista = vista;
        this.vista.btnSumar.addActionListener( new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                modelo.setOperador1(Integer.parseInt(vista.txtPrimerNumero.getText()));
                modelo.setOperador2(Integer.parseInt(vista.txtSegundoNumero.getText()));
                modelo.sumar();
                vista.lblResultado.setText(String.valueOf(modelo.getCalculo()));
            }
        });
        this.vista.btnMultiplicar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                modelo.setOperador1(Integer.parseInt(vista.txtPrimerNumero.getText()));
                modelo.setOperador2(Integer.parseInt(vista.txtSegundoNumero.getText()));
                modelo.multiplicar();
                vista.lblResultado.setText(String.valueOf(modelo.getCalculo()));
            }
        });
        this.vista.btnDividir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    modelo.setOperador1(Integer.parseInt(vista.txtPrimerNumero.getText()));
                    modelo.setOperador2(Integer.parseInt(vista.txtSegundoNumero.getText()));
                    modelo.dividir();
                    vista.lblResultado.setText(String.valueOf(modelo.getCalculo()));
                } catch (ArithmeticException ex) {
                    vista.lblResultado.setText("Error: " + ex.getMessage());
                }
            }
        });
    }
    
     public void iniciar(){
        this.vista.setLocationRelativeTo(null);
        this.vista.setVisible(true);
    }
}
