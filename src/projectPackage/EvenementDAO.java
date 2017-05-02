package projectPackage;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class EvenementDAO extends DAO<Evenement> {

    @Override
    public Evenement find(long id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Evenement create(Evenement obj) {
        try {
            ResultSet result = this.handler
                    .createStatement(
                            ResultSet.TYPE_SCROLL_INSENSITIVE,
                            ResultSet.CONCUR_UPDATABLE
                    ).executeQuery("INSERT INTO evenement (intitule, theme, date_debut, duree, nb_part_max, description, num_salle) "
                            + "VALUES (" 
                            + "'" + obj.getIntitule() + "', "
                            + "'" + obj.getTheme() + "', "
                            + "'" + obj.getDate() + "', "
                            + obj.getDuree() + ", "
                            + obj.getNbPartMax() + ", "
                            + "'" + obj.getDescription() + "', "
                            + obj.getNumSalle() 
                            + ")");                
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return obj;
    }

    @Override
    public Evenement update(Evenement obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(Evenement obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Evenement findByLogin(String login) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
