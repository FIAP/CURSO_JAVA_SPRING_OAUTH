## Spring Security (Lista de ativos da bolsa)

Fluxo para criação do banco de dados:

`docker run --name spring-fiap -e POSTGRES_PASSWORD=102030 -d -p 5432:5432 postgres`

Carga inicial esta dentro da pasta `sql_carga/insertAtivos`

Agora para rodar o projeto execute: `mvn clean install` para instalar as dependências e `mvn spring-boot:run` para subir a aplicação.