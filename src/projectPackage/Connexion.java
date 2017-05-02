package projectPackage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.SQLClientInfoException;
import java.sql.SQLException;

public class Connexion {
    private static String bdd_url = "jdbc:postgresql://172.16.10.65/groupe2b";
    private static String bdd_user = "groupe2b";
    private static String bdd_passwd = "mdp2b";
    
    private static Connection handler;
    
    public static Connection getInstance() {
        if(handler == null) {
            try {
                handler = DriverManager.getConnection(bdd_url, bdd_user, bdd_passwd);
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return handler;
    }        
    
}