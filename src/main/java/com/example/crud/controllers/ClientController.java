package com.example.crud.controllers;


import com.example.crud.models.ClientModel;
import com.example.crud.services.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Optional;

@RestController
@RequestMapping ("/client")
public class ClientController {

    @Autowired
    private ClientService clientService;

    @GetMapping
    public ArrayList<ClientModel> getAllClient(){
        try{
            return this.clientService.getAllClient();
        }catch (Exception e) {

            e.printStackTrace();
            throw e;
        }

    }

    @PostMapping
    public ClientModel saveClient(@RequestBody ClientModel client){
        return this.clientService.saveClient(client);
    }

    @GetMapping (path = "/{id}")
    public Optional<ClientModel> getFindId (@PathVariable("id") Long id){
        return this.clientService.getFindById(id);
    }

    @DeleteMapping (path = "/{id}")
    public void delete (ClientModel client){
        this.clientService.delete(client);
    }

    @PutMapping (path = "/{id}")
    public ClientModel updateById (@RequestBody ClientModel request, Long id){
        return this.clientService.updateById(request, id);
    }
}
