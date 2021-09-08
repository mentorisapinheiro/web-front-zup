### Documento para o projeto web Zup


#web-front-zup

# Começo

Este projeto é um teste de automação onde nele, conseguirá executar localmente em sua máquina, através de uma cópia, para fins de desenvolvimento (caso necessário)
Consulte na implantação, nas notas de como implantar o projeto em um sistema em funcionamento.

#Pré-requisitos

Tudo que precisa ser instalado e como instalar para que o software seja executado corretamente.

### Ferramentas utilizadas  ###
* Selenium (framework)
* Cucumber
* Gherkin - para a escrita em BDD
* Maven 
* Chrome (Navegador utilizado)

#Instalação de ambiente: 

* Intellij Idea ou Eclipse (utilizado o Intellij) versão free
* SDK - Instalar o sdk manager
* JDK - Instalar o adoptOpen JDK - Versao instalada 15.0.0.36_hotspot
* Java - Instalado Jre versão 1.8.0_301 ou o mais atual
* Maven - Instalar o Apache Maven - versão 3.6.3
* Selenium
* Driver - ChromeDriver.exe, Geckodriver.exe, IDEDriverServer.exe

# Instalar plugins 
* Maven 
    No arquivo pom.xml deve ser instalado as dependencias do MAVEN, library escolhida para este projeto
* Site utilizado: https://mvnrepository.com/
* No site do mvn repository, informar qual a dependencia que será criada no arquivo pom.xml
* criar "<dependencies>  </dependencies>" depois da linha de propriedades e inserir dentro dessa tag das dependencias referente ao "MAVEN" conforme documento do projeto.

OBS.: Sempre instalar com a versão mais atual das dependencias ou a mais proxima das que forem instaladas (seguindo a mairia do site onde estão com maior estabilidade).


# Ambiente de versionamento

* GitHubDesktop (opicional)
* Sourcetree (opcional)
* Pacote Git (utilizado muito o Git bash)


# Linguagem de programação 
* Java

# Ambiente testado
* Front End (Web)


# Executando os testes

Como executar:
 
Na pasta Feature tem um arquivo CompraProdutoAmazon.feature
 Clica-se com o botão direiro do mouse em cima do arquivo - clica em Run feature
Ou dentro da cenario: Clica no play (run) ao lado do nome do "Cenario" ou "Scenario"

O que testa e porque:
Está testando uma página WEB front end do site da empresa Amazon
Onde é necessário validar a compra de um ítem com sucesso ele estando no carrinho com os dados validos do cliente.
Porque é um processo essencial para a validaçao em um cliente e-commerce.

## Estoria ##
Como comprador (cliente) do site Amazon
Eu quero que o sistema relize o login corretamente e realize a escolha de um produto, adicione no carrinho e realize a validação de pagamento para o endereço informado
Para que ao finalizar a compra, eu receba o produto escolhido com sucesso.

# Para Implantar
* Ter permissão de administrador da máquina, senão, não conseguirá realizar o processo.
* Instalar todos os programas mencionados no item de "#Ferramentas" e "#Instalação de ambiente" e "Plugins", acima;

#Sites e páginas relacionadas
* MVN Repository para instalar as dependencias do Maven, Cucumber, Java, Gherkin, Selenium
* [MVN] https://mvnrepository.com/ 
* [selenium] https://www.selenium.dev/
* [jdk 8 - kit] https://www.oracle.com/java/technologies/javase/javase-jdk8-downloads.html
* [sdk] https://developer.microsoft.com/pt-br/windows/downloads/sdk-archive/
* [Chrome] download do driver 
* [cucumber]
* [Maven - Apache] https://maven.apache.org/
* [Intellig Idea - Versão 2019.2 - community] https://www.jetbrains.com/idea/promo/
* [java X64bts] https://www.jetbrains.com/idea/promo/
* [GeckoDriver]  https://github.com/mozilla/geckodriver/releases
* [IDeServerDriver] https://www.nuget.org/packages/WebDriver.IEDriverServer.win64 
* [Chrome Driver/ WebDriver] https://chromedriver.chromium.org/downloads
* [Git] https://git-scm.com/
* [CMDer - opicional] https://cmder.net/
* [Sourcetree] https://www.sourcetreeapp.com/ (para ajudar no versionamento com o GIT)
* [Git Hub Desktop - opicional] https://desktop.github.com/

#Versionamento
Para ver o versionamento desse codigo consulte

#Autor(a) (QA)
Isabele Pinheiro

#Nota
No GIT contém o projeto e o mapa mental