// l'héritage
public class Voiture {
    public static void main(String[] args) {
        // je creer un nouvel objet de ma classe Voiture avec le constructeur par défaut de ma classe Voiture
        Voitures voitures = new Voitures();
        // j'appelle la methode start pour lancer le programme
        voitures.start();

        Bateau bateau = new Bateau();
        bateau.start();
    }
}
class Vehicule {
    // on cherche a mutualiser cette fonction pour la classe Bateau, la classe Vehicule est donc notre classe mère
    // on créer une fonction démarrer (start())
    void start() {
        System.out.println("VROOOM");
    }
}

// on fait hériter nos classes Voitures et Bateau à notre classe Mère Vehicule grace a extends
class Voitures extends Vehicule {}
class Bateau extends Vehicule {}

