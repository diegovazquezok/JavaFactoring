package Sesion3DataBase;

import Sesion3Interfaces.FactorialCalculator;

public class Sesion3DataBase implements DatabaseConnection {
    @Override
    public void connect() {
        // Lógica para conectar con MySQL
    }

    @Override
    public void disconnect() {
        // Lógica para desconectar de MySQL
    }

    public class IterativeFactorialCalculator implements FactorialCalculator {
        private final DatabaseConnection connection;

        public IterativeFactorialCalculator(DatabaseConnection connection) {
            this.connection = connection;

        }

        @Override
        public int calculateFactorial(int n) {
            return 0;
        }
    }

}