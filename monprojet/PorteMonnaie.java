package junit.monprojet;
import java.util.HashMap;
public class PorteMonnaie {
    private HashMap<String, Integer> contenu;

    public HashMap<String, Integer> getContenu() {
        return contenu;
    }
    public PorteMonnaie() {
        contenu = new HashMap<String, Integer>();
    }

    public void ajouteSomme(SommeArgent sa) {
        String unite = sa.getUnite();
        int quantite = sa.getQuantite();
        if (contenu.containsKey(unite)) {
            quantite += contenu.get(unite);
        }
        contenu.put(unite, quantite);
    }

    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Contenu du porte-monnaie : ");
        for (String unite : contenu.keySet()) {
            builder.append(contenu.get(unite)).append(" ").append(unite).append(", ");
        }
        return builder.toString();
    }
}
