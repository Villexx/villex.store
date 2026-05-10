package com.example.villex.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.villex.model.Produto;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Long> {}