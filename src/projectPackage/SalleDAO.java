package projectPackage;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SalleDAO extends DAO<Salle> {

    Statement stmt = null;

    @Override
    public Salle find(long id) {
        Salle s = new Salle();
        try {
            ResultSet result = this.handler
                    .createStatement(
                            ResultSet.TYPE_SCROLL_INSENSITIVE,
                            ResultSet.CONCUR_UPDATABLE
                    ).executeQuery("SELECT * FROM salle WHERE num_salle = " + id);
            if (result.first()) {
                s = new Salle(result.getInt("num_salle"), result.getInt("capacite"), result.getDouble("prix_salle"), result.getString("equipement"), result.getInt("type_salle"), result.getInt("type_event"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return s;
    }

    @Override
    public Salle create(Salle obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Salle update(Salle obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(Salle obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Salle findByLogin(String login) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
