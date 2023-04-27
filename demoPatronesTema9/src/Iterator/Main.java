package Iterator;

import static java.lang.System.out;
import static java.lang.System.setOut;

public class Main {
    public  static void  main(String []args){
        Usuarios usuarios = new Usuarios();
        usuarios.crear(new Usuario("uno", 5));
        usuarios.crear(new Usuario("dos", 15));
        usuarios.crear(new Usuario("tres", 22));
        usuarios.crear(new Usuario("cuatro", 45));

        while (usuarios.hayMas()) {
            Usuario usuario = usuarios.siguiente();
            System.out.println("Usuario es: " + usuario.getNombre());
        }


    }
}