package com.esprit.karimmohsen4sae1.Services;

import com.esprit.karimmohsen4sae1.Entities.Produit;

import java.util.List;

public interface ProduitService {

    public List<Produit> retrieveAllProduits();
    public Produit addProduit(Produit p, Long idRayon, Long idStock);
    public Produit retrieveProduit(Long id);
    public void assignProduitToStock(Long idProduit, Long idStock);

}
