import java.util.HashMap;
import java.util.Map;
public class usingMaps {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();

        map.put("Jean", 34);
        map.put("Anais", 25);

        map.put("Jean", 89);

        for(Map.Entry<String, Integer> entry : map.entrySet()) {
            printEntry(entry);
        }
    }
    static void printEntry(Map.Entry entry) {
        System.out.println(entry.getKey() + " -> " + entry.getValue());
    }
}

// 1. Pour déclarer une Map, on commence par déclarer son type(Map=, suivi du type de clé(String) et du type de valeur(Integer)
// 2. on déclare notre nom de variable (map), mot clé new et on déclare une nouvelle instance de notre dictionnaire
// 3. on ne peut pas utiliser directement new map car Map est un interface et non une classe
// 4. on utilise la classe HashMap qui implemente l'interface Map -> new HashMap + clé + valeur = 1ere Map
// 5. boucle for avec "Map.Entry" + clé + valeur et j'appelle mon entrée "entry" et je lui assigne l'entrée grace a la methode
// "entrySet" de ma collection Map et dans ma boucle je peux utiliser cette entrée pour l'afficher , j'appelle donc printEntry
// avec mon entrée (c'est un raccourcis qui permet d'afficher mon entrée)
// 6. on utilise la fonction "put" avec la clé (Jean) et la valeur (34 ans)
//
//
//
//
//
//
