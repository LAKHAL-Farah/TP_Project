package tn.esprit.ipproject.Services;

import tn.esprit.ipproject.Entities.Equipe;

import java.util.List;

public interface IEquipeService {
    Equipe ajouterEquipe(Equipe equipe);
    Equipe afficherEquipeSelonId(long id);
    List<Equipe> afficherEquipes ();
    Equipe modifierEquipe(Equipe equipe);
    void supprimerEquipe(long id);
}
