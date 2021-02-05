# :pen: archunit
ArchUnit é uma biblioteca gratuita, simples e extensível para verificar a arquitetura de seu código Java usando qualquer estrutura de teste de unidade Java simples. Ou seja, o ArchUnit pode verificar dependências entre pacotes e classes, camadas e fatias, verificar dependências cíclicas e muito mais. Ele faz isso analisando o bytecode Java fornecido, importando todas as classes para uma estrutura de código Java.

No aplicativo Spring Boot, a camada de serviço depende da camada de repositório, a camada do controlador depende da camada de serviço.

ArchUnit oferece um conjunto de recursos para garantir que sua arquitetura em camadas seja respeitada. Esses testes fornecem garantias automatizadas de que o acesso e o uso são mantidos dentro dos limites definidos. portanto, é possível escrever regras personalizadas. Neste artigo, acabamos de descrever algumas das regras. O guia oficial do ArchUnit apresenta as diferentes possibilidades.
