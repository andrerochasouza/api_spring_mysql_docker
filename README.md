# API em Spring e MySQL para Docker

O [API-Spring](https://github.com/andrerochasouza/api_spring_mysql_docker) é um projeto que tem como objetivo criar um servidor de API REST com Spring Boot e MySQL, conteinerizado por um Dockerfile.

Esse pequeno API serve como estudo para conteinerização de aplicações web.


## Utilização em forma de container (Docker)

Abra qualquer terminal e execute o comando:

```mvn clean install```

Após isso, o projeto será compilado, execute esse comando com o Docker já instalado:

```docker-compose up --build --force-recreate```


## Métodos
Requisições para a API devem seguir os padrões:
| Método | Descrição |
|---|---|
| `GET` | Retorna informações de um ou mais registros. |
| `POST` | Utilizado para criar um novo registro. |
| `PUT` | Atualiza dados de um registro ou altera sua situação. |
| `DELETE` | Remove um registro do sistema. |


## Pessoa [/Pessoa/]

A pessoa têm uma simples entidade, que possui ujm cd_pessoa, nome e sobrenome.


## Listar uma Pessoa [GET] [/Pessoa/{cd_pessoa}]

+ Request (application/json)

+ Response 200 (application/json)

          {
              "cd_pessoa": 1,
              "nome": "Diego",
              "sobrenome": "Souza"
          }


## Novo (Create) [POST] [/Pessoa/]

+ Atributos (objeto Pessoa)

    + nome - (string, opcional) - limite de 200 caracteres
    + sobrenome - (string, optional) - limite de 200 caracteres


+ Request (application/json)

+ Response 200 (application/json)


### Modificar uma Pessoa [PUT] [/Pessoa/{cd_pessoa}]

+ Atributos (objeto Pessoa)

    + nome: Thiago (string, opcional) - limite de 200 caracteres
    + sobrenome: Merlin (string, optional) - limite de 200 caracteres


+ Request (application/json)

+ Response 200 (application/json)

          {
              "cd_pessoa": 1,
              "nome": "Thiago",
              "sobrenome": "Merlin"
          }

## Deletar [DELETE] [/Pessoa/{cd_pessoa}]


+ Request (application/json)

+ Response 200 (application/json)
