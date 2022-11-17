package com.esprit.karimmohsen4sae1.Services;

import com.esprit.karimmohsen4sae1.Entities.Produit;
import com.esprit.karimmohsen4sae1.Entities.Rayon;
import com.esprit.karimmohsen4sae1.Entities.Stock;
import com.esprit.karimmohsen4sae1.Repositories.ProduitRepository;
import com.esprit.karimmohsen4sae1.Repositories.RayonRepository;
import com.esprit.karimmohsen4sae1.Repositories.StockRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class IProduitSerivceIMP implements ProduitService{

    @Autowired
    ProduitRepository produitRepository;
    @Autowired
    RayonRepository rayonRepository;
    @Autowired
    StockRepository stockRepository;

    @Override
    public List<Produit> retrieveAllProduits() {
        return produitRepository.findAll();
    }

    @Override
    public Produit addProduit(Produit p, Long idRayon, Long idStock) {
        Rayon rayon = rayonRepository.findById(idRayon).orElse(null);
        Stock stock = stockRepository.findById(idStock).orElse(null);

        if (rayon!=null && stock!=null)
        {
            Produit produit = produitRepository.save(p);
            produit.setRayon(rayon);
            produit.setStock(stock);

        }

        return produitRepository.save(p);
    }

    @Override
    public Produit retrieveProduit(Long id) {
        return produitRepository.findById(id).orElse(null);
    }

    @Override
    public void assignProduitToStock(Long idProduit, Long idStock) {
        Produit produit = produitRepository.findById(idProduit).orElse(null);
        Stock stock = stockRepository.findById(idStock).orElse(null);
        if (produit!=null && stock!=null){
            produit.setStock(stock);
        }
    }
}
