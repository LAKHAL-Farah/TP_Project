package tn.esprit.ipproject.Services;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.ipproject.Entities.Equipe;
import tn.esprit.ipproject.Repositories.EquipeRepository;

import java.util.List;
@Service
@AllArgsConstructor
public class EquipeServiceImplementation implements IEquipeService {


    @Autowired
    private EquipeRepository equipeRepository;
    @Override
    public Equipe ajouterEquipe(Equipe equipe) {
        return equipeRepository.save(equipe);
    }

    @Override
    public Equipe afficherEquipeSelonId(long id) {
        return equipeRepository.findById(id).orElse(null);
    }

    @Override
    public List<Equipe> afficherEquipes() {
        return equipeRepository.findAll();
    }

    @Override
    public Equipe modifierEquipe(Equipe equipe) {
        return equipeRepository.save(equipe);
    }

    @Override
    public void supprimerEquipe(long id) {
        equipeRepository.deleteById(id);

    }



}
