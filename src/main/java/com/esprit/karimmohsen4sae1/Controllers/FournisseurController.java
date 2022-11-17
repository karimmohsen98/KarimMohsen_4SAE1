package com.esprit.karimmohsen4sae1.Controllers;

import com.esprit.karimmohsen4sae1.Services.FournisseurService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/fournisseur")
public class FournisseurController {

    @Autowired
    FournisseurService fournisseurService;

    @PutMapping("{fournisseurId}/{produitId}")
    public void assignFournisseurToProduit(Long fournisseurId, Long produitId){
        fournisseurService.assignFournisseurToProduit(fournisseurId,produitId);
    }
}
