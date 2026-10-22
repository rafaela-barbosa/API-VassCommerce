API RESTful desenvolvida em **Spring Boot** para a plataforma de e-commerce **VassCommerce** [1]. O projeto foca no desacoplamento entre a camada web (*controllers*) e a camada de negócios (*models/services*), utilizando os princípios de **Inversão de Controle (IoC)** e **Injeção de Dependência (DI)** [2].

CHECKLIST
- [x] Controladores não fazem new de implementações; dependem de interfaces.
- [x] Há ao menos duas implementações @Service de ProdutoModel.
- [x] A seleção é feita por @Primary ou @Qualifier ou @Profile.
- [x] Injeção é por construtor; nenhum @Autowired em campo.
- [x] ProdutoController continua retornando 201/200/404 corretos.
