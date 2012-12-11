# GDG Guice Workshop


## Setup

### Clone

Hacer clone del repositorio en vuestro workspace habitual:

	git clone git@github.com:jordi9/gdg-guice-workshop.git

### Gradle

Para hacer el build utilizaremos [Gradle](http://www.gradle.org/). No hace falta tenerlo instalado,
utilizaremos el wrapper que tenemos ya incluído en el repositorio. Si lo tenéis instalado,
podéis usar directamente vuestra instalación.

Ejecutar uno de los siguientes comandos:

En *NIX, ejecutar:
	
	./gradlew build

En Windows, ejecutar:
	
	./gradlew.bat build

Aseguraros de tener permismos de ejecución, en principio ya los deberíais tener. La primera ejecución tardará
un poco ya que se tiene que bajar algunos ficheros.

Una vez ejecutado, el output de la consola debe ser similar a esto:

	:compileJava
	:processResources UP-TO-DATE
	:classes
	:jar
	:assemble
	:compileTestJava
	:processTestResources UP-TO-DATE
	:testClasses
	:test
	:check
	:build
	
	BUILD SUCCESSFUL

Para simplifcar, a partir de ahora los ejemplos estarán como si tuviésemos instalado Gradle directamente:

	gradle build

### IDE Setup

Para gente de Eclipse:

	gradle eclipse
	
Y para IDEA

	gradle idea

Ahora ya podéis importar el proyecto a vuestro workspace.

En el caso de eclipse `File > Import > Existing Projects into workspace` 

## Get ready!

Utilizaremos algunos ejemplos que vimos en la charla del pasado Google DevFest Barcelona 2012.
Aquí tenéis los slides: [Clean Code via Dependency Injection + Guice](http://www.slideshare.net/giro9/clean-code-via-dependency-injection-guice-15097271)

### Verify setup

Podéis ejecutar la clase `com.jordi9.guice.example01.ShowtimesLauncher` desde vuestro IDE como 
una aplicación Java, o por consola:

	gradle runExample01
	
Debéis ver un output parecido a este:

	:compileJava UP-TO-DATE
	:processResources UP-TO-DATE
	:classes UP-TO-DATE
	:runExample01
	Movies found:
	  Movie{name=E}
	  Movie{name=C}
	  Movie{name=R}
	  Movie{name=A}
	  Movie{name=B}
	  Movie{name=O}
	  Movie{name=N}
	  Movie{name=L}
	
	BUILD SUCCESSFUL

Ya estáis listos para trabajar!

De momento solo hay un ejemplo, antes del workshop subiré todo lo que hará falta.

Si tenéis problemas con el setup o cualquier cosa, me podéis encontrar [en Twitter](http://twitter.com/jordi9).


