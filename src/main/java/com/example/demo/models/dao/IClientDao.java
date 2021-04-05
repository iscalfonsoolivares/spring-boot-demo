package com.example.demo.models.dao;

import com.example.demo.models.entity.Client;
import org.springframework.data.repository.CrudRepository;

public interface IClientDao extends CrudRepository<Client, Long >{

}
