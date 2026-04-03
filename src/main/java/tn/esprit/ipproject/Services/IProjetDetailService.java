package tn.esprit.ipproject.Services;

import tn.esprit.ipproject.Entities.ProjetDetail;

import java.util.List;

public interface IProjetDetailService {
    ProjetDetail ajouterProjetDetails(ProjetDetail projetDetail);
    List<ProjetDetail> afficherProjetsDetails();
    ProjetDetail afficherProjetDetailsSelonId(long id);
    ProjetDetail modifierProjetDetails(ProjetDetail projetDetail);
    void supprimerProjet(long id);

}
