package sesion12a14;

import java.util.regex.Pattern;

public class Funciones {

    public static void main(String[] args) {
        double distancia = calcularDistancia(1.0, 2.0, 4.0, 6.0);
        System.out.println("La distancia entre los dos puntos es: " + distancia);

        String telefono = "+34612345678";
        if (verificarTelefono(telefono)) {
            System.out.println("El número de teléfono es válido");
        } else {
            System.out.println("El número de teléfono no es válido");
        }
    }


    public static double calcularDistancia(double x1, double y1, double x2, double y2) {
        /** Esta función calcula la distancia entre dos puntos en un plano cartesiano.
         * @param x1 Coordenada X del primer punto.
         * @param y1 Coordenada Y del primer punto.
         * @param x2 Coordenada X del segundo punto.
         * @param y2 Coordenada Y del segundo punto.
         * @return La distancia entre los dos puntos.
         */
        double dx = x2 - x1;
        double dy = y2 - y1;
        return Math.sqrt(dx * dx + dy * dy);
    }

    public static boolean verificarTelefono(String telefono) {
        /** Esta función verifica si un número de teléfono es válido.
         * @param telefono El número de teléfono a verificar.
         * @return True si el número de teléfono es válido, False en caso contrario.
         */
        Pattern patron = Pattern.compile("^[+]?[0-9]{10,13}$");
        return patron.matcher(telefono).matches();
    }

}


