//  boucles for
public class boucles {
    public static void main(String[] args) {
        bonjour("Jean");
      //  bonjour("Jean");
        for (int i = 0; i <= 1000; i++) {
            bonjour(Integer.toString(i));
        }

    }
    // on appelle la fonction bonjour grace a la fonction main
    static void bonjour(String nom) {
        System.out.println("Bonjour " + nom + " !! " );
    }
}
// si je veux répéter cette instruction 1000 fois on utilise la boucle for
// 1. mot clé for
// 2. variable "i" qu'on initialise a 0
// 3. condition de repetition de la boucle : i <== 1000 = tant que i est inferieur ou egal a 1000
// 4. a chaque passage de boucle, on ajoute 1 a notre variable i (i++)
// 5. entre accolades, on ecrit le texte a repeter
// 6. i est un int et bonjour etant un string, faut convertir int en string -> Integer.toString
//
//