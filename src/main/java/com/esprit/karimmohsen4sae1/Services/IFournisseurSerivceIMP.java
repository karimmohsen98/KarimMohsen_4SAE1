package com.esprit.karimmohsen4sae1.Services;

import com.esprit.karimmohsen4sae1.Entities.Fournisseur;
import com.esprit.karimmohsen4sae1.Entities.Produit;
import com.esprit.karimmohsen4sae1.Repositories.FournisseurRepository;
import com.esprit.karimmohsen4sae1.Repositories.ProduitRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class IFournisseurSerivceIMP implements FournisseurService{

    @Autowired
    FournisseurRepository fournisseurRepository;
    @Autowired
    ProduitRepository produitRepository;
    @Override
    public void assignFournisseurToProduit(Long fournisseurId, Long produitId) {
        Fournisseur fournisseur = fournisseurRepository.findById(fournisseurId).orElse(null);
        Produit produit = produitRepository.findById(produitId).orElse(null);
        if (fournisseur != null && produit != null)
        {
            List<Fournisseur> fournisseurList = new ArrayList<Fournisseur>();
            fournisseurList.add(fournisseur);
            produit.setFournisseursList(fournisseurList);
            produitRepository.save(produit);
        }

    }
}
