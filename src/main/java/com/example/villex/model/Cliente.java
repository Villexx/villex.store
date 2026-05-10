package com.example.villex.model;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private LocalDate clienteDesde;

    // setters and getters
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getClienteDesde() {
        return clienteDesde;
    }
    public void setClienteDesde(LocalDate clienteDesde) {
        this.clienteDesde = clienteDesde;
    }

    @Override
    public String toString() {
        return "Cliente [id=" + id + ", nome=" + nome + ", clienteDesde=" + clienteDesde + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        result = prime * result + ((nome == null) ? 0 : nome.hashCode());
        result = prime * result + ((clienteDesde == null) ? 0 : clienteDesde.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Cliente other = (Cliente) obj;
        if (id == null) {
            if (other.id != null)
                return false;
        } else if (!id.equals(other.id))
            return false;
        if (nome == null) {
            if (other.nome != null)
                return false;
        } else if (!nome.equals(other.nome))
            return false;
        if (clienteDesde == null) {
            if (other.clienteDesde != null)
                return false;
        } else if (!clienteDesde.equals(other.clienteDesde))
            return false;
        return true;
    }

}