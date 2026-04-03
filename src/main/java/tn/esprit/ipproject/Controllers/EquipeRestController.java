package tn.esprit.ipproject.Controllers;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.ipproject.Entities.Equipe;
import tn.esprit.ipproject.Services.IEquipeService;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("equipe")
public class EquipeRestController {
    @Autowired
    private IEquipeService equipeService;

    @PostMapping("/ajouter_equipe")
    public Equipe ajouter_equipe(@RequestBody Equipe equipe){
        return equipeService.ajouterEquipe(equipe);
    }

    @GetMapping("/afficher_equipes")
    public List<Equipe> afficheEquipes(){
        return equipeService.afficherEquipes();
    }

    @GetMapping("/afficher_equipe/{idE}")
    public Equipe afficherEquipeSelonId(@PathVariable("idE") long id){
        return equipeService.afficherEquipeSelonId(id);
    }


    @PutMapping("/modifier_equipe")
    public Equipe modifierEquipe(@RequestBody Equipe equipe){
        return equipeService.modifierEquipe(equipe);
    }

    @DeleteMapping("/supprimer_equipe/{idE}")
    public void supprimerEquipe(@PathVariable("idE") long id){
        equipeService.supprimerEquipe(id);
    }
}
