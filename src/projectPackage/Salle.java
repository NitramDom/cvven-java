package projectPackage;

public class Salle {
    private double
            prixSalle;
    
    private String
            equipement;
    
    private int
            id,
            typeSalle,
            typeEvenement,
            capacite;

    public Salle(int id, int capacite, double prixSalle, String equipement, int typeSalle, int typeEvenement) {
        this.capacite = capacite;
        this.prixSalle = prixSalle;
        this.equipement = equipement;
        this.typeSalle = typeSalle;
        this.typeEvenement = typeEvenement;
    }

    Salle() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getCapacite() {
        return capacite;
    }

    public void setCapacite(int capacite) {
        this.capacite = capacite;
    }

    public double getPrixSalle() {
        return prixSalle;
    }

    public void setPrixSalle(double prixSalle) {
        this.prixSalle = prixSalle;
    }

    public String getEquipement() {
        return equipement;
    }

    public void setEquipement(String equipement) {
        this.equipement = equipement;
    }

    public int getTypeSalle() {
        return typeSalle;
    }

    public void setTypeSalle(int typeSalle) {
        this.typeSalle = typeSalle;
    }

    public int getTypeEvenement() {
        return typeEvenement;
    }

    public void setTypeEvenement(int typeEvenement) {
        this.typeEvenement = typeEvenement;
    }
}