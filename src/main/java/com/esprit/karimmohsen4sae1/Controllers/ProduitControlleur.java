package com.esprit.karimmohsen4sae1.Controllers;

import com.esprit.karimmohsen4sae1.Services.ProduitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/produit")
public class ProduitControlleur {

    @Autowired
    ProduitService produitService;

    @PostMapping("{idProduit}/{idStock}")
    public void assignProduittoStock(Long idProduit, Long idStock)
    {
        produitService.assignProduitToStock(idProduit,idStock);
    }
}
