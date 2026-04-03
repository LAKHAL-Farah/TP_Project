package tn.esprit.ipproject.Controllers;

import lombok.AllArgsConstructor;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import tn.esprit.ipproject.Entities.Project;
import tn.esprit.ipproject.Entities.ProjetDetail;
import tn.esprit.ipproject.Services.IProjectService;
import tn.esprit.ipproject.Services.ProjetServiceImplementation;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/projet")
public class ProjetRestController {
    @Autowired
    private IProjectService projetServiceImplementation;

    // annotation mvc
    @PostMapping("/addProjet")
    public Project ajouterProjet(@RequestBody Project project){
        return projetServiceImplementation.ajouterProjet(project);
    }
    @GetMapping("/showProjets")
    public List<Project> afficherProjets(){
        return projetServiceImplementation.afficherProjets();
    }

    @GetMapping("/afficherProjetParId/{idP}")
    public Project afficherProjetParId(@PathVariable("idP") long Id){
        return projetServiceImplementation.afficherProjetSelonId(Id);
    }
    @PutMapping("/modifierProjet")
    public Project modifierProjet (@RequestBody Project project){
        return projetServiceImplementation.modifierProjet(project);
    }

    @DeleteMapping("/supprimerProjet/{idP}")
    public void supprimerProjet(@PathVariable("idP") long Id){
        projetServiceImplementation.supprimerProjet(Id);
    }

    @PutMapping("/setProjectDetailsId/{idP}/{idPD}")
    public Project setProjectDetailsId(@PathVariable("idP") long idProject, @PathVariable("idPD") long idProjetDetail){
        return projetServiceImplementation.setProjectDetailsId(idProject, idProjetDetail);
    }

    @PutMapping("/addEquipeToProject/{idP}/{idE}")
    public Project addEquipeToProject(@PathVariable("idP") long idProject, @PathVariable("idE") long idEquipe){
        return projetServiceImplementation.addEquipeToProject(idProject, idEquipe);
    }


}
