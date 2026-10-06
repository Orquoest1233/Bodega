
package BodegaVista.Articulo;

public class Articulo {

    private Long id;
    private String nom;
    private double pre;

    public Articulo() {
    }

    public Articulo(Long id, String nom, double pre) {
        this.id = id;
        this.nom = nom;
        this.pre = pre;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public double getPre() {
        return pre;
    }

    public void setPre(double pre) {
        this.pre = pre;
    }
    
}
