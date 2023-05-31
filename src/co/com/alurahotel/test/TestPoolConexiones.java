package co.com.alurahotel.test;

import java.sql.Connection;
import co.com.alurahotel.factory.ConnectionFactory;

/**
 * Simulando 20 conexiones, sólo el pool admite 10.
 *
 * @author carlos
 */
public class TestPoolConexiones {

    public static void main(String[] args) {
        ConnectionFactory connectionFactory = new ConnectionFactory();
        for (int i = 0; i < 20; i++) {
            Connection c = connectionFactory.realizarConexion();
            System.out.println("Abriendo la conexión número: " + (i + 1));
        }
    }
}
