public class testClass {

    public static void main(String[] args) {
        String exemple = "hello";
        // méthode toUpperCase qui permet d'afficher en MAJ
        exemple = exemple.toUpperCase();
       // remplace une partie de notre text par une autre, 1er argument texte a remplacer,
        // puis le texte avec lequel le remplacer
        exemple = exemple.replace("HELL", "YEAH");
        System.out.println(exemple);
    }
}
