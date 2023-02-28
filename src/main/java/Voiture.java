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
class Voitures extends Vehicule {
    @Override
    void start() {
        super.start();
        allumerFeux();
    }
    // on crée notre méthode qui permet d'allumer les feux de la voiture
    void allumerFeux() {
        System.out.println("allumage feux");
    }
}
class Bateau extends Vehicule {}

// 1. on souhaite personnaliser la voiture en y ajoutant une fonction "allumerFeux" -> on crée notre méthode qui permet d'allumer les feux de la voiture
// 2. comme la fonction allumerFeux() n'est jamais appelée, on va appeler cette fonction lors du démarrage de la voiture.
// Pour ça, on va surcharger la methode start de la classe Véhicule
// 3. dans ma classe Voiture, pour personnaliser le comportement d'une fonction héritée de la classe Mère, on utilise super() qui fait reference a la classe Mère
// 4. @Override sur les methodes qu'on surcharge pour dire que c'est une surcharge de méthode de la classe Mère


