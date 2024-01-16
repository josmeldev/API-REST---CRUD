package com.example.crud.services;

import com.example.crud.models.ClientModel;
import com.example.crud.repositories.IClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class ClientService {

    @Autowired
    IClientRepository clientRepository;


    public ClientModel saveClient (ClientModel Client) {
        return clientRepository.save(Client);
    }

    public ArrayList<ClientModel> getAllClient(){
        return (ArrayList<ClientModel>) this.clientRepository.findAll();
    }

    public ClientModel updateById(ClientModel request, Long id){
        ClientModel client = clientRepository.findById(id).get();

        client.setNombre(request.getNombre());
        client.setApellido(request.getApellido());
        client.setCiudad(request.getCiudad());
        client.setEdad(request.getEdad());

        return client;
    }
    public void delete (ClientModel client) {
        clientRepository.delete(client);
    }

    public Optional<ClientModel> getFindById (Long id) {
        return clientRepository.findById(id);
    }
}
