package com.esprit.karimmohsen4sae1.Services;

import com.esprit.karimmohsen4sae1.Entities.Client;

import java.util.List;

public interface ClientService {

    public List<Client> retrieveAllClients();
    public Client addClient(Client c);
    public void deleteClient(Long id);
    public Client updateClient(Client c);
    public Client retrieveClient(Long id);
}
