package com.esprit.karimmohsen4sae1.Services;

import com.esprit.karimmohsen4sae1.Entities.Facture;

import java.util.List;

public interface FactureService {

    public Facture addFacture(Facture f , Long idClient);
    public List<Facture> retrieveAllFactures();
    public void cancelFacture(Long id);
    public Facture retrieveFacture(Long id);

    public List<Facture> getFacturesByClient(Long idClient);
}
