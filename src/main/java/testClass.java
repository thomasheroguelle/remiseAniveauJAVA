// variable globale
public class testClass {

    // variable locale 1
    public static void main(String[] args) {
        String exemple = "hello";
        // méthode toUpperCase qui permet d'afficher en MAJ
        exemple = exemple.toUpperCase();
       // remplace une partie de notre text par une autre, 1er argument texte a remplacer,
        // puis le texte avec lequel le remplacer
        exemple = exemple.replace("HELL", "YEAH");
        System.out.println(exemple);

        // portée des variables
        fonction1();
        fonction2();
    }
    // chaque variable déclarée en Java a une portée, c à d un champ d'accessibilité dans lequel elle peut
    // etre utilisée
    static String exemple = "hello";
    // variable locale 2
    public static void fonction1() {
        System.out.println((exemple));
    }
    // variable locale 3
    public static void fonction2() {
        System.out.println((exemple));
    }
}
