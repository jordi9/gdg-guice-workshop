# GDG Guice Workshop


## Get ready

### Clone

Hacer clone del repositorio en vuestro workspace habitual:

	git clone git://github.com/jordi9/gdg-guice-workshop.git

### Gradle

Para hacer el build utilizaremos [Gradle](http://www.gradle.org/). No hace falta tenerlo instalado,
utilizaremos el wrapper que tenemos ya incluído en el repositorio. Si lo tenéis instalado,
podéis usar directamente vuestra instalación.

Ejecutar uno de los siguientes comandos dentro del directorio donde os habéis bajado el repositorio:

En *NIX, ejecutar:
	
	./gradlew compileJava

En Windows, ejecutar:
	
	./gradlew.bat compileJava

Aseguraros de tener permismos de ejecución, en principio ya los deberíais tener. La primera ejecución tardará
un poco ya que se tiene que bajar algunos ficheros.

Una vez ejecutado, el output de la consola debe ser similar a esto:

	:compileJava
	
	BUILD SUCCESSFUL

Para simplifcar, a partir de ahora los ejemplos estarán como si tuviésemos instalado Gradle directamente:

	gradle <command>

### IDE Setup

Para gente de Eclipse:

	gradle eclipse
	
Y para IDEA

	gradle idea

Ahora ya podéis importar el proyecto a vuestro workspace.

En el caso de eclipse `File > Import > Existing Projects into workspace` 

## You're set!

Utilizaremos algunos ejemplos que vimos en la charla del pasado Google DevFest Barcelona 2012.
Aquí tenéis los slides: [Clean Code via Dependency Injection + Guice](http://www.slideshare.net/giro9/clean-code-via-dependency-injection-guice-15097271)

Ya estáis listos para trabajar!

Si tenéis problemas con el setup o cualquier cosa, me podéis encontrar [en Twitter](http://twitter.com/jordi9).


