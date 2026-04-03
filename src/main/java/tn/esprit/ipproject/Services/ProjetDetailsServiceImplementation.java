package tn.esprit.ipproject.Services;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.ipproject.Entities.ProjetDetail;
import tn.esprit.ipproject.Repositories.ProjetDetailRepository;

import java.util.List;
@Service
@AllArgsConstructor
public class ProjetDetailsServiceImplementation implements IProjetDetailService {

    @Autowired
    ProjetDetailRepository projetDetailRepository;
    @Override
    public ProjetDetail ajouterProjetDetails(ProjetDetail projetDetail) {
        return projetDetailRepository.save(projetDetail);
    }

    @Override
    public List<ProjetDetail> afficherProjetsDetails() {
        return projetDetailRepository.findAll();
    }

    @Override
    public ProjetDetail afficherProjetDetailsSelonId(long id) {
        return projetDetailRepository.findById(id).orElse(null);
    }

    @Override
    public ProjetDetail modifierProjetDetails(ProjetDetail projetDetail) {
        return projetDetailRepository.save(projetDetail);
    }

    @Override
    public void supprimerProjet(long id) {
        projetDetailRepository.deleteById(id);

    }
}
