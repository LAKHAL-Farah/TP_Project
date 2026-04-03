package tn.esprit.ipproject.Services;

import tn.esprit.ipproject.Entities.Entreprise;

import java.util.List;

public interface IEntrepriseService {
    Entreprise ajouterEntreprise(Entreprise entreprise);
    List<Entreprise> afficherEnreprise();
    Entreprise afficherEntrepriseSelonId( long id);
    Entreprise modifierEntreprise(Entreprise entreprise);
    void supprimerEntreprise(long id);

}
