package com.example.RestApiBanco.repository;

import com.example.RestApiBanco.model.UserEntity;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends MongoRepository<UserEntity, String> {
    List<UserEntity> findByNomeIgnoreCase(String nome);

    List<UserEntity> findByEmailIgnoreCase(String email);

    List<UserEntity> findByNomeAndEmail(String nome, String email);

    List<UserEntity> findByNomeStartingWithIgnoreCase(String prefixo);

    List<UserEntity> findByNomeContainingIgnoreCase(String substring);
}
