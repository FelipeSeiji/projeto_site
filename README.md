# Sistema de Gerenciamento de Projetos Acadêmicos

## Descrição
Este projeto foi desenvolvido como parte de um trabalho universitário em equipe, com o objetivo de criar um sistema onde alunos podem criar e publicar projetos acadêmicos. Professores podem avaliar esses projetos, e outros alunos também podem dar feedback, incentivando a colaboração e aprimoramento dos trabalhos.

## Minha Contribuição
Fiquei responsável pela implementação do backend, garantindo a estrutura e funcionamento da API REST. Utilizei Java (Spring Boot) para desenvolver o backend, criando uma API REST integrada aos bancos de dados H2 (para testes) e PostgreSQL (para produção), proporcionando flexibilidade no desenvolvimento.

Também utilizei Spring JPA para a persistência de dados e Docker para facilitar a implantação e configuração do ambiente.

No frontend, a equipe utilizou HTML, CSS e JavaScript para estruturar e estilizar a interface do sistema.

## Desafios Enfrentados
Durante o desenvolvimento, enfrentamos desafios como conflitos de merge no Git, exigindo colaboração e organização entre os membros da equipe para garantir um fluxo de trabalho eficiente. Trabalhamos juntos para resolver problemas de integração e melhorar a qualidade do código.

## Tecnologias Utilizadas
- **Backend:** Java (Spring Boot), Spring JPA, H2 Database, PostgreSQL, Docker
- **Frontend:** HTML, CSS, JavaScript
- **Controle de Versão:** Git & GitHub

## Como Executar o Projeto

### Requisitos:
- Java 17
- Docker e Docker Compose (para execução com containers)
- PostgreSQL (caso não utilize Docker)
- Maven

### Passos:
1. Clone o repositório:
   ```bash
   git clone https://github.com/FelipeSeiji/projeto_site.git
   ```
2. Acesse o diretório do projeto:
   ```bash
   cd projeto_site
   ```
3. Execute o projeto com Docker:
   ```bash
   docker-compose up
   ```
   Ou, se preferir executar manualmente:
   ```bash
   mvn spring-boot:run
   ```
4. O backend estará rodando em: [http://localhost:8080](http://localhost:8080)

