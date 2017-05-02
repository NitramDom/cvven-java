package projectPackage;

public class Evenement {
    private String
                theme,
                intitule,
                date,
                organisateur,
                description;
        
    private int
                duree,
                numSalle,
                nbPartMax; 

    public Evenement(String theme, String intitule, String date, String organisateur, String description, int duree, int numSalle, int nbPartMax) {
        this.theme = theme;
        this.intitule = intitule;
        this.date = date;
        this.organisateur = organisateur;
        this.description = description;
        this.duree = duree;
        this.numSalle = numSalle;
        this.nbPartMax = nbPartMax;
    }

    Evenement() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getTheme() {
        return theme;
    }

    public void setTheme(String theme) {
        this.theme = theme;
    }

    public String getIntitule() {
        return intitule;
    }

    public void setIntitule(String intitule) {
        this.intitule = intitule;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getOrganisateur() {
        return organisateur;
    }

    public void setOrganisateur(String organisateur) {
        this.organisateur = organisateur;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getDuree() {
        return duree;
    }

    public void setDuree(int duree) {
        this.duree = duree;
    }

    public int getNumSalle() {
        return numSalle;
    }

    public void setNumSalle(int numSalle) {
        this.numSalle = numSalle;
    }

    public int getNbPartMax() {
        return nbPartMax;
    }

    public void setNbPartMax(int nbPartMax) {
        this.nbPartMax = nbPartMax;
    }

    @Override
    public String toString() {
        return "Evenement{" + "theme=" + theme + ", intitule=" + intitule + ", date=" + date + ", organisateur=" + organisateur + ", description=" + description + ", duree=" + duree + ", numSalle=" + numSalle + ", nbPartMax=" + nbPartMax + '}';
    }
}
