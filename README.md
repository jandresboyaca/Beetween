## How to deploy it?
* `git clone https://github.com/jandresboyaca/Beetween.git `
* `cd test` 
* `docker-compose  -f docker-compose.yml up -d`
* `cd e2e`
* `npm i`
* `node_modules/.bin/newman run Between.postman_collection.json`
* enjoy :)

### Scaffolding
* Inspired by Clean Architecture: A Craftsman's Guide to Software Structure
  and [Clean Architecture](https://medium.com/bancolombia-tech/clean-architecture-aislando-los-detalles-4f9530f35d7a)
    * There you could find empty folder but it's just to show how would be a clean architecture
## Technologies
* Java - **Spring Boot**
* Docker
* Newman
### Documentation
#### [Swagger](http://localhost/swagger-ui.html#)
### Tools
#### [H2](http://localhost/h2)
#### [NewMan](https://learning.postman.com/docs/running-collections/using-newman-cli/command-line-integration-with-newman/)
## Assumption
* It's assumed that the application must have high availability and optimal performance must be guaranteed.
## Upgrades
* You could use more functional programming as [VAVR](https://www.vavr.io/) and  [immutables](https://immutables.github.io/)
* You could use postman and [newman](https://www.npmjs.com/package/newman) to ensure your e2e
* If you want that the app works with workloads you could deploy in [AWS](https://aws.amazon.com/) and use EC2, ELB and RDS
* If you want more metrics you should use an agent for this like new newrelic, dynaTrace , appOptics and so on. This approach just was to show my knowledge with SQL


