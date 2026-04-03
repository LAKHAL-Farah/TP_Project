package tn.esprit.ipproject.Controllers;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.ipproject.Entities.ProjetDetail;
import tn.esprit.ipproject.Services.IProjetDetailService;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/projet_detail")
public class ProjetDetailRestController {

    @Autowired
    private IProjetDetailService projetDetailService;
    @PostMapping("/addProjetDetail")
    public ProjetDetail ajouterProjetDetail(@RequestBody ProjetDetail projetDetail){
        return projetDetailService.ajouterProjetDetails(projetDetail);
    }


    @GetMapping("/showProjetDetails")
    public List<ProjetDetail> afficherProjetDetail(){
        return projetDetailService.afficherProjetsDetails();
    }

    @GetMapping("/showProjetDetails/{idPD}")
    public ProjetDetail afficherProjetDetailSelonId(@PathVariable("idPD") long id){
        return projetDetailService.afficherProjetDetailsSelonId(id);
    }

    @PutMapping("/modifier_projet")
    public ProjetDetail modifierProjetDetails(@RequestBody ProjetDetail projetDetail){
        return projetDetailService.modifierProjetDetails(projetDetail);
    }

    @DeleteMapping("/supprimer_projet/{idPD}")
    public void supprimerProjet(@PathVariable("idPD") long id) {
        projetDetailService.supprimerProjet(id);
    }
}
