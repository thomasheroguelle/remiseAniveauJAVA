public class AccesRestreint {
    public static void main(String[] args) {
        // ici, ".text" est un argument
        System.out.println(Exemple.text);

    }
}
class Exemple {
    static String text = "hello";
    static void printText() {
        System.out.println(text);
    }
}

// -> Dans cet exemple, on a bien hello qui va s'afficher dans la console
// Par contre, si on ajoute la variable "private" avant "static String text = "hello" ", ça va marquer une erreur
// en effet, la variable "text" est maintenant privée à la classe Exemple, donc la classe AccesRestreint ne peut plus y acceder
// si on met public, ça va fonctionner