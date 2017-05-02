package projectPackage;

public class Utilisateur {
    private long
            id_user;
    private String
            nom,
            prenom,
            password,
            login;
    
    public Utilisateur() {}

    public Utilisateur(long id_user, String nom, String prenom, String password, String login) {
        this.id_user = id_user;
        this.nom = nom;
        this.prenom = prenom;
        this.password = password;
        this.login = login;
    }

    public Utilisateur(String nom, String prenom, String password) {
        this.nom = nom;
        this.prenom = prenom;
        this.password = password;
    }

    public Utilisateur(String nom, String prenom, String password, String login) {
        this.nom = nom;
        this.prenom = prenom;
        this.password = password;
        this.login = login;
    }

    public long getId_user() {
        return id_user;
    }

    public void setId_user(long id_user) {
        this.id_user = id_user;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }
    
}
