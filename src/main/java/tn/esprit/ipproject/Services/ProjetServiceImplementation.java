package tn.esprit.ipproject.Services;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.ipproject.Entities.Project;
import tn.esprit.ipproject.Entities.ProjetDetail;
import tn.esprit.ipproject.Entities.Equipe;
import tn.esprit.ipproject.Repositories.ProjetRepository;
import tn.esprit.ipproject.Repositories.ProjetDetailRepository;
import tn.esprit.ipproject.Repositories.EquipeRepository;

import java.util.List;
import java.util.Set;
@Service
@AllArgsConstructor
public class ProjetServiceImplementation implements IProjectService{

    @Autowired
    private  ProjetRepository projetRepository;
    @Autowired
    private ProjetDetailRepository projetDetailRepository;
    @Autowired
    private EquipeRepository equipeRepository;

// par constructuer
  /*  ProjetServiceImplementation(ProjetRepository pr){
        this.projetRepository=pr;
    }*/

   /* private void setProjetRepository(ProjetRepository pr){
        this.projetRepository=pr;
    }*/



    @Override
    public Project ajouterProjet(Project project) {
        return projetRepository.save(project) ;
    }

    @Override
    public List<Project> afficherProjets() {
        return projetRepository.findAll();
    }

    @Override
    public Project afficherProjetSelonId(long id) {
        return projetRepository.findById(id).orElse(null);
        //        return projetRepository.findById(id).get();
    }

    @Override
    public Project modifierProjet(Project project) {
        return projetRepository.save(project);
    }

    @Override
    public void supprimerProjet(long id) {
        projetRepository.deleteById(id);

    }

    @Override
    public Project setProjectDetailsId(long idProject, long idProjetDetail) {
        Project project = projetRepository.findById(idProject).orElse(null);
        if (project != null) {
            ProjetDetail projetDetail = projetDetailRepository.findById(idProjetDetail).orElse(null);
            if (projetDetail != null) {
                project.setProjetDetail(projetDetail);
                return projetRepository.save(project);
            }
        }
        return null;
    }

    @Override
    public Project addEquipeToProject(long idProject, long idEquipe) {
        Project project = projetRepository.findById(idProject).orElse(null);
        if (project != null) {
            Equipe equipe = equipeRepository.findById(idEquipe).orElse(null);
            if (equipe != null) {
                Set<Equipe> equipes = project.getEquipes();
                if (equipes == null) {
                    equipes = new java.util.HashSet<>();
                }
                equipes.add(equipe);
                project.setEquipes(equipes);
                return projetRepository.save(project);
            }
        }
        return null;
    }

    @Override
    public Project ajouterProjetWithDetails(Project project, long idProjetDetail) {
        ProjetDetail projetDetail = projetDetailRepository.findById(idProjetDetail).orElse(null);
        if (projetDetail != null) {
            project.setProjetDetail(projetDetail);
            return projetRepository.save(project);
        }
        return null;
    }

    @Override
    public Project desaffecterProjetDetails(long idProject) {
        Project project = projetRepository.findById(idProject).orElse(null);
        if (project != null) {
            project.setProjetDetail(null);
            return projetRepository.save(project);
        }
        return null;
    }


}
