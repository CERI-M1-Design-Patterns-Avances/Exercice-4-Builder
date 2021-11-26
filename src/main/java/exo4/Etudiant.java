package exo4;

import java.time.LocalDate;

public class Etudiant {

    private String codeNIP, codeINE, nom, nomUsuel, prenom;
    private char civilite;
    private LocalDate dateNaissance;
    private String lieuNaissance;

    public Etudiant() {}

    @Override
    public String toString() {
        return (prenom != null ? (prenom + " ") : "") +
                nom +  " codeNIP " + codeNIP +
                (codeINE != null ? (" - codeINE='" + codeINE + '\'') : "")  +
                (nomUsuel != null ? (" - nomUsuel='" + nomUsuel + '\'') : "") +
                (civilite != 'X' ? (" - civilite=" + civilite) : "") +
                (dateNaissance != null ? (" - dateNaissance=" + dateNaissance) : "") +
                (lieuNaissance != null ? (" - lieuNaissance='" + lieuNaissance + '\'') : "") +
                '}';
    }

}