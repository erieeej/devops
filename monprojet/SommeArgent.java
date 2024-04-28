package junit.monprojet;

public class SommeArgent {

    private int quantite;
    private String unite;

    public SommeArgent(int amount, String currency) {
        this.quantite = amount;
        this.unite = currency;
    }

    public int getQuantite() {
        return quantite;
    }

    public String getUnite() {
        return unite;
    }

    public SommeArgent add(SommeArgent m) throws UniteDistincteException {
        if (!this.unite.equals(m.getUnite())) {
            throw new UniteDistincteException("Les unités des sommes d'argent sont différentes");
        }
        return new SommeArgent(this.quantite + m.getQuantite(), this.unite);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        SommeArgent other = (SommeArgent) obj;
        return this.quantite == other.quantite && this.unite.equals(other.unite);
    }
}
