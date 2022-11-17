package com.esprit.karimmohsen4sae1.Services;

import com.esprit.karimmohsen4sae1.Entities.Client;
import com.esprit.karimmohsen4sae1.Entities.Facture;
import com.esprit.karimmohsen4sae1.Repositories.ClientRepository;
import com.esprit.karimmohsen4sae1.Repositories.FactureRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class IFactureSerivceIMP implements FactureService{

    @Autowired
    FactureRepository factureRepository;

    @Autowired
    ClientRepository clientRepository;

    @Override
    public Facture addFacture(Facture f, Long idClient) {
        Client client = clientRepository.findById(idClient).orElse(null);
        if (client!=null)
        {
            Facture facture = factureRepository.save(f);
            facture.setClientFacture(client);
            return factureRepository.save(facture);

        }
        return null;
    }


    @Override
    public List<Facture> retrieveAllFactures() {
        return factureRepository.findAll();
    }

    @Override
    public void cancelFacture(Long id) {
        factureRepository.deleteById(id);

    }

    @Override
    public Facture retrieveFacture(Long id) {
        return factureRepository.findById(id).orElse(null);
    }

    @Override
    public List<Facture> getFacturesByClient(Long idClient) {
        List<Facture> factures = factureRepository.findAll();
        Client client = clientRepository.findById(idClient).orElse(null);

        if (client != null)
        {
           return client.getFactureListClient();

        }

        return null;
    }
}
