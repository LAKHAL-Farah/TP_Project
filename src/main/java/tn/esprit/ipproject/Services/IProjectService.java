package tn.esprit.ipproject.Services;

import tn.esprit.ipproject.Entities.Project;

import java.util.List;

public interface IProjectService {

    Project ajouterProjet(Project project);
    List<Project> afficherProjets();
    Project afficherProjetSelonId(long id);
    Project modifierProjet (Project project);
    void supprimerProjet(long id);
    Project setProjectDetailsId(long idProject, long idProjetDetail);
    Project addEquipeToProject(long idProject, long idEquipe);
    Project ajouterProjetWithDetails(Project project, long idProjetDetail);


}
