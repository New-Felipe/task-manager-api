# Task Manager API

API REST desenvolvida com Spring Boot para gerenciamento de tarefas.

## Sobre o Projeto

O objetivo deste projeto é fornecer uma API REST para criação, consulta, atualização e remoção de tarefas, seguindo boas práticas de desenvolvimento back-end com Java e Spring Boot.

O projeto foi desenvolvido com foco em aprendizado prático de arquitetura em camadas, persistência de dados, validação de informações e documentação de APIs.

## Tecnologias Utilizadas

* Java 21
* Spring Boot
* Spring Data JPA
* H2 Database
* Maven
* Swagger / OpenAPI
* Jakarta Validation

## Arquitetura

O projeto segue uma arquitetura em camadas:

```text
Controller
    ↓
Service
    ↓
Repository
    ↓
Database
```

### Estrutura de Pastas

```text
src/main/java/com/felipe/taskmanager
│
├── controller
├── service
├── repository
├── entity
├── dto
├── exception
└── config
```

## Funcionalidades

* Criar tarefas
* Listar todas as tarefas
* Buscar tarefa por ID
* Atualizar tarefa
* Excluir tarefa
* Validação de dados
* Tratamento global de exceções
* Documentação Swagger

## Endpoints

| Método | Endpoint    | Descrição            |
| ------ | ----------- | -------------------- |
| POST   | /tasks      | Criar tarefa         |
| GET    | /tasks      | Listar tarefas       |
| GET    | /tasks/{id} | Buscar tarefa por ID |
| PUT    | /tasks/{id} | Atualizar tarefa     |
| DELETE | /tasks/{id} | Remover tarefa       |

## Exemplo de Requisição

### Criar Tarefa

```json
{
  "title": "Estudar Spring Boot",
  "description": "Criar uma API REST para portfólio"
}
```

## Validações

O sistema valida os dados recebidos antes de persistir no banco.

Exemplos:

* Título obrigatório
* Limite de caracteres para título
* Limite de caracteres para descrição

## Documentação da API

Após iniciar a aplicação, acesse:

http://localhost:8080/swagger-ui/index.html

## Como Executar

### Clonar o projeto

```bash
git clone https://github.com/seu-usuario/task-manager-api.git
```

### Entrar na pasta

```bash
cd task-manager-api
```

### Executar

```bash
mvn spring-boot:run
```

## Melhorias Futuras

* Integração com MySQL
* Autenticação com JWT
* Spring Security
* Docker
* Testes automatizados
* Deploy em nuvem

## Autor

Luiz Felipe dos Santos Maciel

Projeto desenvolvido para estudos e composição de portfólio profissional em desenvolvimento Java Back-end.
