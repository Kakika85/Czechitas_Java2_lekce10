package cz.czechitas.java2webapps.lekce10.entity;

import jakarta.persistence.*;

import java.util.List;

/**
 *
 */
@Entity
public class Trida {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String nazev;

    @OneToOne(optional = false, fetch = FetchType.EAGER)
    @JoinColumn(name = "tridni_ucitel_id")
    private Ucitel tridniUcitel;

    @OneToMany(mappedBy = "trida")
    @OrderBy(value = "prijmeni, jmeno")
    private List<Student> studenti;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNazev() {
        return nazev;
    }

    public void setNazev(String nazev) {
        this.nazev = nazev;
    }

    public Ucitel getTridniUcitel() {
        return tridniUcitel;
    }

    public void setTridniUcitel(Ucitel tridniUcitel) {
        this.tridniUcitel = tridniUcitel;
    }

    public List<Student> getStudenti() {
        return studenti;
    }

    public void setStudenti(List<Student> studenti) {
        this.studenti = studenti;
    }

    @Override
    public String toString() {
        return nazev;
    }
}
