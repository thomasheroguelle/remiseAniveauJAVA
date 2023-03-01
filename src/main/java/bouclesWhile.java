public class bouclesWhile {
    public static void main(String[] args) {
        // je declare ma variable i et l'initialise a zero
        int i = 0;
        // mot cle while pour declarer ma boucle et j'utilise ensuite une condition : je repete i tant que inferieur a 90
        while(i < 90) {
            // j'utilise la méthode randomNumber qui me retourne un nombre aleatoire entre 1 et 100
            i = randomNumber();
            print(i);
        }
    }
    static void print(int nombre) {
        System.out.println("Nombre : " + Integer.toString(nombre));
    }
    static int randomNumber() {
        return (int) ((Math.random() * ((100 - 1) + 1)) + 1);
    }
}
// parfois la boucle for n'est pas appropriée car elle necessite a l'avance de savoir le nombre de repetitions
