public class arrayString {
    public static void main(String [] args) {
        String[] tableau = new String[10];

        tableau[3] = "index 3";
        tableau[1] = "index 1";

        // nos éléments sont ordonnées, index1 s'affichera avant le 3

        for(int i = 0; i < tableau.length; i++) {
            System.out.println(tableau[i]);
        }
    }
}
// 1. pour déclarer un tableau, on commence par déclarer le type d'éléments qu'on va stocker (String/double crochets)
// 2. variable "tableau"
// 3. j'utilise le mot-clé new pour creer mon tableau et je reprend son type avec le nombre d'elements que je souhaite stocker (10)
// 4. j'utilise une boucle for pour boucler tous les elements de mon tableau et les afficher
// 5. je boucle tant que i est inferieur a la taille de mon tableau (tableau.length)
// 6. si je run, la console affichera null x10 car aucune valeur n'a été déclarée , mon tableau est vide
// 7. donc on rajoute des éléments
// 8. j'initialise ma variable a l'index 3
// on ne peut ni modifier le type ni la taille d'un tableau