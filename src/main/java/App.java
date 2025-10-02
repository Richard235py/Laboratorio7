
import controlador.ControladorfrmInterfaz;
import modelo.Operaciones;
import vista.frmInterfaz;

public class App {
    public static void main(String[] args) {
        Operaciones modelo = new Operaciones();
        frmInterfaz vista = new frmInterfaz();
        ControladorfrmInterfaz controlador = 
                new ControladorfrmInterfaz(modelo, vista);
        controlador.iniciar();
    }
}
