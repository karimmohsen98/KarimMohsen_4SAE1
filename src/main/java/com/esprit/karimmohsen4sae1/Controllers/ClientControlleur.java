package com.esprit.karimmohsen4sae1.Controllers;

import com.esprit.karimmohsen4sae1.Entities.Client;
import com.esprit.karimmohsen4sae1.Services.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Client")
public class ClientControlleur {

    @Autowired
    ClientService clientService;

    @PostMapping()
    public Client addClient(@RequestBody Client c)
    {
        return  clientService.addClient(c);
    }
    @PostMapping("/update")
    public Client updateClient(@RequestBody Client c){
        return clientService.updateClient(c);
    }
    @DeleteMapping("{idClient}")
    public void deleteClient(@PathVariable Long idClient)
    {
        clientService.deleteClient(idClient);
    }
    @GetMapping()
    public List<Client> retrieveClients(){
        return clientService.retrieveAllClients();
    }
    @GetMapping("{idClient}")
    public Client findClientByID(@PathVariable Long idClient)
    {
        return clientService.retrieveClient(idClient);
    }
}
