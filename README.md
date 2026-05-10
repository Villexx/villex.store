# Villex Store API

## Objetivo
API REST desenvolvida para gerenciar as operações básicas de um comércio de vestuário, contemplando o controle e relacionamento entre clientes, produtos (camisetas) e pedidos.

## Motivação
Projeto acadêmico construído como requisito de avaliação da atividade prática da disciplina de Desenvolvimento Web Back-End (Centro Universitário Uninter).

## Tecnologias Utilizadas
* Java 17
* Spring Boot
* Spring Data JPA
* H2 Database (Banco de dados em memória)
* Postman (Testes e validação de rotas)

## Endpoints Implementados (CRUD)
A API responde na porta `8080` (`http://localhost:8080`) para as seguintes rotas:

* **`/clientes`**: POST (Criar), GET (Listar todos / Consultar por ID), DELETE (Remover)
* **`/produtos`**: POST (Criar), GET (Listar todos / Consultar por ID), DELETE (Remover)
* **`/pedidos`**: POST (Criar), GET (Listar todos / Consultar por ID), DELETE (Remover)

## Como Executar
1. Clone este repositório.
2. Abra a pasta do projeto no VS Code ou na sua IDE de preferência.
3. Execute a aplicação a partir da classe principal (ex: `ApiApplication.java`).
4. O servidor iniciará embutido com o Tomcat e o banco H2 criará as tabelas automaticamente.

---
**Desenvolvedor:** Victor Baptista da Silva (RU: 4751786)
