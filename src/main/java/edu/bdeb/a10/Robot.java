package edu.bdeb.a10;

/**
 * La classe Robot représente un robot avec un nom et une stratégie de déplacement.
 */
public class Robot {
    private String nom;
    private IBehaviour strategie;

    /**
     * Constructeur par défaut.
     */
    public Robot() {
        this.strategie = new DefaultBehaviour(); // Initialisation de la stratégie par défaut
    }

    /**
     * Constructeur avec un paramètre de nom.
     *
     * @param nom le nom du robot
     */
    public Robot(String nom) {
        this.nom = nom;
        this.strategie = new DefaultBehaviour(); // Initialisation de la stratégie par défaut
    }

    /**
     * Constructeur par copie.
     *
     * @param r le robot à copier
     */
    public Robot(Robot r) {
        this.nom = r.nom;
        this.strategie = r.strategie;
    }

    /**
     * Méthode pour effectuer une action de déplacement basée sur la stratégie.
     */
    public void move() {
        int command = this.strategie.moveCommand();
        // Effectuer l'action basée sur la commande
        System.out.println("Commande : " + command);
    }

    /**
     * Obtient le nom du robot.
     *
     * @return le nom du robot
     */
    public String getNom() {
        return nom;
    }

    /**
     * Définit le nom du robot.
     *
     * @param nom le nom à définir
     */
    public void setNom(String nom) {
        this.nom = nom;
    }

    /**
     * Obtient la stratégie de déplacement du robot.
     *
     * @return la stratégie de déplacement
     */
    public IBehaviour getStrategie() {
        return strategie;
    }

    /**
     * Définit la stratégie de déplacement du robot.
     *
     * @param strategie la stratégie à définir
     */
    public void setStrategie(IBehaviour strategie) {
        this.strategie = strategie;
    }
}

// Exemple d'un comportement par défaut, en supposant que IBehaviour est une interface
class DefaultBehaviour implements IBehaviour {
    @Override
    public int moveCommand() {
        return 0; // Commande par défaut
    }
}
