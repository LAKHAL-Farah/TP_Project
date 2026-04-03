package tn.esprit.ipproject.Controllers;

import jakarta.websocket.server.PathParam;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.ipproject.Entities.Entreprise;
import tn.esprit.ipproject.Services.IEntrepriseService;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("entreprise")
public class EntrepriseRestController  {

    @Autowired
    private IEntrepriseService entrepriseService;

    @PostMapping("/ajouter_entreprise")
    public Entreprise ajouterEntreprise(@RequestBody Entreprise entreprise)
    {
        return entrepriseService.ajouterEntreprise(entreprise);
    }


    @GetMapping("/afficher_entreprise/{idE}")
    public  Entreprise afficherEntreprise(@PathVariable("idE") long id){
        return entrepriseService.afficherEntrepriseSelonId(id);
    }

    @GetMapping("/afficher_entreprises")
    public List<Entreprise> afficherEntreprises(){
        return entrepriseService.afficherEnreprise();
    }


    @PutMapping("/modifier_entreprise")
    public Entreprise modifierEntreprise(@RequestBody Entreprise entreprise){
        return entrepriseService.modifierEntreprise(entreprise);
    }

    @DeleteMapping("/supprimer_entreprise/{idE}")
    public void supprimerEntreprise(@PathVariable("idE") long id ){
        entrepriseService.supprimerEntreprise(id);
    }

}
