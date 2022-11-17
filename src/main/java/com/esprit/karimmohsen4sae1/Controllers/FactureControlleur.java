package com.esprit.karimmohsen4sae1.Controllers;

import com.esprit.karimmohsen4sae1.Entities.Facture;
import com.esprit.karimmohsen4sae1.Services.FactureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/facture")
public class FactureControlleur {

    @Autowired
    FactureService factureService;

    @PostMapping("{idClient}")
    public Facture addFacture(@RequestBody Facture f ,@PathVariable long idClient)
    {
       return factureService.addFacture(f,idClient);
    }
    @GetMapping()
    public List<Facture> retrieveFacturesForClient(Long idClient){
        return factureService.getFacturesByClient(idClient);
    }
}
