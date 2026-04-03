package tn.esprit.ipproject.Services;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.ipproject.Entities.Entreprise;
import tn.esprit.ipproject.Repositories.EntrepriseRepository;

import java.util.List;

@Service
@AllArgsConstructor
public class EntrepriseServiceImplementation implements IEntrepriseService{

    @Autowired
    private EntrepriseRepository entrepriseRepository;
    @Override
    public Entreprise ajouterEntreprise(Entreprise entreprise) {
        return entrepriseRepository.save(entreprise);
    }

    @Override
    public List<Entreprise> afficherEnreprise() {
        return entrepriseRepository.findAll();
    }

    @Override
    public Entreprise afficherEntrepriseSelonId(long id) {
        return entrepriseRepository.findById(id).orElse(null);
    }

    @Override
    public Entreprise modifierEntreprise(Entreprise entreprise) {
        return entrepriseRepository.save(entreprise);
    }

    @Override
    public void supprimerEntreprise(long id) {
        entrepriseRepository.deleteById(id);

    }
}
