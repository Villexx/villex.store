package com.example.baozi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.baozi.model.Cliente;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Long> {}