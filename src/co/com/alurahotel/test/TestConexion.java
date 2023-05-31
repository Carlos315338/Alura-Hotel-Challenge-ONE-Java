package co.com.alurahotel.test;

import java.sql.Connection;
import java.sql.SQLException;
import co.com.alurahotel.factory.ConnectionFactory;

/**
 *
 * @author carlos
 */
public class TestConexion {
    
    public static void main(String[] args) {
        try(Connection c = new ConnectionFactory().realizarConexion();){
            System.out.println(c);
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
    }
    
}
