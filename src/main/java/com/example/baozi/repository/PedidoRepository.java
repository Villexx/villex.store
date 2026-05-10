package com.example.baozi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.baozi.model.Pedido;

@Repository
public interface PedidoRepository extends JpaRepository<Pedido, Long> {}