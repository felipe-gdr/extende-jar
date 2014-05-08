extende-jar
===========

Extensão de JAR

Prova de Conceito: criar um procedimento de montagem de JAR no Maven aonde um determinado projeto sobrescreve arquivos presentes em uma de suas dependências.

Foi utilizado o plugin maven-assembly para atingir esse objetivo

1- Instale o projeto sso-padrao: mvn install
2- Execute o método main do jar gerado: java -cp target/sso-padrao-1.0-SNAPSHOT.jar br.com.glr.populis.SSOMain
3- a saída será algo como:
    --- Iniciando SSO para grupo: Grupo São Paulo ---
    - EPI do módulo: Capacete
4- Execute o assembly do projeto sso-cliente: mvn clean package assembly:single
5- Execute o método main do jar gerado:java -cp target/sso-cliente-1.0-SNAPSHOT-jar-extendido.jar br.com.glr.populis.SSOMain
6- a saída será algo como:
    --- Iniciando SSO para grupo: Grupo São Paulo ---
    - EPI do módulo: Capacete Espacial

Conclusão: o jar criado contém (1) as classes que estavam no sso-padrao (ex.: SSOMain) assim como os recursos (sso.xhtml), (2) as classes e recursos "novos" que foram criados no sso-cliente (ex.: EPIExtensaoService e epi-extensao.xhtml) e (3) classes e recursos que existiam tanto no sso-cliente quanto no sso-padrao, para essas foi utilizada a versão declarada no sso-cliente (ex.: EPIService e epi.xhtml).

* A mecânica desse processo está toda declarada no arquivo src/assembly.xml dentro do projeto do cliente. Lá foi declarado o nome do projeto que está sendo extendido (sso-padrao) assim como as classes e recursos que estão sendo sobrescritas.

