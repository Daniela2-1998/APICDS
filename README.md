# API de CDS

### Descripción: 
Se trata de una API REST de CDS que permite consultar todos los registros, hacer consultas por ID, crear un registro, modificarlo o eliminarlo. También se puede filtrar por género y por fecha de lanzamiento.

### Características:
* Utiliza los métodos GET, PUT, POST y DELETE.
* Se puede testear con Postman.
* Conectado con una base de datos MySQL, la cuál se puede utilizar desde el Workbench o XAMPP.
* Puertos asignados para cada microservicios: http://localhost:5050 (API de cds), http://localhost:5051 (API de ticket de compra) y puerto 8761 para Eureka server.

## Uso:
Es necesario descargar también el otro microservicio y el server de los siguientes enlaces:
* https://github.com/Daniela2-1998/eurekaServer
* https://github.com/Daniela2-1998/ticketCompra
Por otro lado, y como opción alternativa, se puede acceder al siguiente repositorio que contiene el servidor y los microservicios en un mismo lugar: https://github.com/Daniela2-1998/Microservicios-CODEKI
