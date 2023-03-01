public class useClasses {
    public static void main(String[] args) {
        // je creer une premiere marque de telephone : je declare un nouvel objet de type Marque
        // grace au mot clé new, je creer une nouvelle instance ma classe
        // entre parenthese ce sont les arguments
        Marque apple = new Marque("apple");

        Telephone iphone = new Telephone(34000, "iphone", apple);
        System.out.println(iphone.nom);
    }
}
// on a notre classe "Telephone", avec ses attributs
class Telephone {
    int pixels;
    String nom;
    Marque marque;

    // avant de creer des objets, on doit creer notre constructeur, on utilise le meme nom que la classe comme nom de fonction.
    // en argument, je donne une valeur pour chaques attributs
    // on met a jour la valeur de nos attributs par nos arguments -> mot clé this + valeur de l'argument
    // on a maintenant notre constructeur pret a creer des instances de ma classe
    public Telephone(int pixels, String nom, Marque marque) {
        this.pixels = pixels;
        this.nom = nom;
        this.marque = marque;
    }
}
    // classe Marque , attribut nom
class Marque  {
    String nom;

    // idem pour Marque (constructeur), ça met a jour notre attribut
    public Marque(String nom) {
        this.nom = nom;
    }
}
// 1. classes
// 2. constructueur
// 3. nouvelle instance + arguments