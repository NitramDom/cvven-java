package projectPackage;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class UtilisateurDAO extends DAO<Utilisateur> {

    Statement stmt = null;

    public Utilisateur find(long id) {
        Utilisateur u = new Utilisateur();
        try {
            ResultSet result = this.handler
                    .createStatement(
                            ResultSet.TYPE_SCROLL_INSENSITIVE,
                            ResultSet.CONCUR_UPDATABLE
                    ).executeQuery("SELECT * FROM utilisateur WHERE id_user = " + id);
            if (result.first()) {
                u = new Utilisateur(id, result.getString("nom"), result.getString("prenom"), result.getString("password"), result.getString("login"));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return u;
    }
    
    public Utilisateur findByLogin(String login) {
        Utilisateur u = new Utilisateur();
        try {
            ResultSet result = this.handler
                    .createStatement(
                            ResultSet.TYPE_SCROLL_INSENSITIVE,
                            ResultSet.CONCUR_UPDATABLE
                    ).executeQuery("SELECT * FROM utilisateur WHERE login = '" + login +"' LIMIT 1");
            if (result.first()) {
                u = new Utilisateur(result.getInt("id_user"), result.getString("nom"), result.getString("prenom"), result.getString("password"), result.getString("login"));        
            } else u = null;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return u;
    }

    @Override
    public Utilisateur create(Utilisateur obj) {
        try {
            ResultSet result = this.handler
                    .createStatement(
                            ResultSet.TYPE_SCROLL_INSENSITIVE,
                            ResultSet.CONCUR_UPDATABLE
                    ).executeQuery("INSERT INTO utilisateur (nom, prenom, password, login) "
                            + "VALUES (" 
                            + "'" + obj.getNom() + "', "
                            + "'" + obj.getPrenom() + "', "
                            + "'" + obj.getPassword() + "', "
                            + "'" + obj.getLogin() + "'"
                            + ")");                
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return obj;
    }

    @Override
    public Utilisateur update(Utilisateur obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(Utilisateur obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


}
