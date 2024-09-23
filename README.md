Avaliação - Desenvolvedor Backend Java
Descrição
Este projeto é uma API REST FULL desenvolvida em Java com Spring Boot para gerenciar o cadastro de beneficiários de um plano de saúde. 
A API permite cadastrar beneficiários com seus documentos, listar todos os beneficiários, listar os documentos de um beneficiário específico, atualizar as informações cadastrais e remover beneficiários.

Funcionalidades
A aplicação expõe os seguintes endpoints:

Cadastrar um beneficiário: Permite registrar um beneficiário.
Listar todos os beneficiários: Retorna todos os beneficiários cadastrados no sistema.
Detalha um beneficiários pelo seu ID: Retorna um beneficiários cadastrado no sistema.
Atualizar dados de um beneficiário: Permite a atualização dos dados cadastrais de um beneficiário.
Remover um beneficiário: Remove um beneficiário do sistema.

Cadastrar um documento: Permite registrar um documento.
Listar documentos de um beneficiário: Retorna todos os documentos de um beneficiário específico com base em seu ID.
Detalha um documento do beneficiário : Retorna um documento do beneficiário específico com base no ID.
Atualizar dados de um documento: Permite a atualização do documento de um beneficiário.
Remover um documento: Remove um documento do sistema.

Tecnologias Utilizadas
Java 17: Linguagem de programação utilizada.
Spring Boot 3.3.4: Framework para simplificação do desenvolvimento da aplicação.
Spring Data JPA: Para persistência e gerenciamento dos dados.
Hibernate: Framework permite a transformação de dados de um banco de dados em objetos relacionais.
postgresql: Banco de dados relacional.
Swagger: Para documentação dos endpoints REST.
Postman: Para testar os endpoints REST.
Maven: Gerenciamento de dependências e build.

Requisitos
Java 17 ou superior
Spring Boot 3.3.4
Maven 3.3.3 ou superior

Como Executar
Clonar o repositório
Execute o seguinte comando para clonar o repositório: git clone https://github.com/eltonesm/plano-saude-beneficiarios.git

Configurar o Banco de Dados
A aplicação já está configurada para usar o banco de dados postgresql, que é um banco de dados relacional. Não é necessária nenhuma configuração adicional.
Caso queira alterar o banco de dados, edite as configurações no arquivo application.properties em src/main/resources:

Executar o Projeto
Com o Maven instalado, dentro do diretório do projeto, execute o seguinte comando para compilar e rodar a aplicação:
mvn spring-boot:run

A aplicação estará disponível em http://localhost:8080/cadastro-beneficiario/api/swagger-ui/index.html

Endpoints Beneficiario
Método	        Endpoint	                                      Descrição
POST	/public/v1/beneficiario                 	   Cadastrar um novo beneficiário
GET	/public/v1/beneficiario/todos-beneficiarios	   Listar todos os beneficiários
GET	/public/v1/beneficiario/{idBeneficiario}           Detalha um beneficiário
PATCH	/public/v1/beneficiario/edita-beneficiario	   Atualizar dados de um beneficiário
DELETE	/public/v1/beneficiario/{idBeneficiario}	   Remover um beneficiário

Endpoints Documento                                                           
Método	          Endpoint                                                         Descrição
POST	/v1/{idBeneficiario}/documento                	                   Cadastrar um novo documento
GET	/v1/{idBeneficiario}/documento/{idDocumento}	                   Detalha um documento do beneficiário
GET	/v1/{idBeneficiario}/documento/lista-documentos                    Listar todos documentos de um beneficiário
PATCH	/v1/{idBeneficiario}/documento/edita-documento/{idDocumento}	   Atualizar dados de um documento
DELETE	/v1/{idBeneficiario}/documento}/deleta-documento/{idDocumento}	   Remover um documento


AUTOR
Elton Soares Marques

Email : eltonesm@gmail.com