# Version Control Software - Ventajas y desventajas

## Mercurial
- *Ventajas*: Sistema de control de versiones distribuido. Escalable y adaptable al tama&ntilde;o y exigencias del proyecto.

- *Desventajas*: Pocas caracteristicas a&ntilde;adidas por default. La comunidad de desarrollo es muy peque&ntilde;a.


## SVN
- *Ventajas*: Sistema de control de versiones centralizado. Al realizar operaciones de sincronizaci&oacute;n entre los datos de los programas clientes y el servidor SVN s&oacute;lo se transmiten aquellos archivos que han sufrido cambios, no todos los archivos.

- *Desventajas*: El manejo de cambio de nombres de archivos no es completo. Lo maneja como la suma de una operaci&oacute;n de copia y una de borrado. El manejo de archivos binarios los trata internamente como si fuera de texto no como de Subversion.

## GIT
- *Ventajas*: Sistema de control de versiones distribuido. Se trabaja directamente de forma local con los archivos del repositorio aun cuando no tengas una conexion a internet. La velocidad de subida de los archivos es rapida. Se trabaja con los equipos de manera mas facil.

- *Desventajas*: Se necesita especializar al personal que llegara a  usar esta herramienta ya que podria ocasionar errores en los cambios.


## Repositorios GIT (Free y privadas)


- GitHub
--**Ventaja**: Gratuita con cantidad ilimitado de usuarios colaboradores. Compartir: El c&oacute;digo fuente del proyecto no s&oacute;lo se puede copiar con Git, tambi&eacute;n se puede descargar como archivo.

--**Desventaja**: El servicio no es completamente gratuito. Para acceder a todas las funciones de GitHub, se debe actualizar a un usuario Premium. Limitaciones de tama&ntilde;o. Los archivos no pueden ser mayores a 100 MB mientras que el repositorio puede alojar 1 GB de informaci&oacute;n.

- BitBucket: 
--**Ventaja**: Gratuita con cantidad ilimitada de repositorios. Usa Git pero tambien es compatible con Mercurial. Condiciones especiales para estudiantes y profesores.
--**Desventaja**: Limitada por la cantidad de usuarios colaboradores (Maximo 5). No es de c&oacute;digo abierto, pero admite proyectos de c&oacute;digo abierto.

- GitLab:
--**Ventajas**: opera bajo una licencia de c&oacute;digo abierto. Seguimiento de errores y edici&oacute;n de c&oacute;digo basado en la web.
--**Desventajas**: Interface relativamente lenta. Frecuentes problemas t&eacute;cnicos con los repositorios


## Requerimientos
> Git (Versionador de c&oacute;digo)

## Sistema de integraci&oacute;n continua
- **Jenkins**: Herramienta de c&oacute;digo abierto desarrollada en Java. Usa una gran variedad de plugins. Soporta herramientas de control de versiones como CVS, Subversion(SVN), Git, Mercurial y ejecuta proyectos basados como Apache Maven.
- **Bamboo**: Presta servicio tanto de nube como de instalacion. Es gratis solamente por 30 dias y luego de eso ofrece planes para equipos grandes y chicos. Es una herramiento de Atlassian y es de facil importar configuraciones de JIRA y Bitbucket
- **Hudson**:  Herramienta de c&oacute;digo abierto desarrollada en Java basada en Servlets como Tomcat y GlassFish. Trabaja con herramientas de control de versiones como CVS, Subversion (SVN)y Git

## Comandos GIT 
- GIT STATUS
- GIT ADD [file name]
- GIT PUSH ORIGIN MASTER
- GIT CHECKOUT
- GIT COMMIT
- GIT CLONE [reposity]
http://ndpsoftware.com/git-cheatsheet.html#loc=stash;

## como clono el repo en ssh
Mediante el comando: 
> git clone ssh://user@server/project.git

&oacute;

Tambien se puede prescindir del protocolo, Git asume que se esta usando 
el protocolo SSH y el usuario conectado en ese momento.

> git clone user@server/project.git

Ejemplo: imagen de las claves SSH generadas
![GitHub Image](/images/github01.png)

## que es ssh
SSH (Secure shell), protocolo y programa que lo implementa y sirve para acceder servidores privados a trav&eacute;s de una puerta trasera, permitiendo manejar por completo el servidor mediante un int&eacute;rprete de comandos. Tambien nos permite copiar datos de forma segura (tanto archivos sueltos como simular sesiones FTP cifradas), gestionar claves RSA para no escribir claves al conectar a los dispositivos y pasar los datos de cualquier otra aplicaci&oacute;n por un canal seguro tunelizado mediante SSH.

## Informacion sobre docker - 
Docker es un proyecto de c&oacute;digo abierto que automatiza el despliegue de aplicaciones dentro de contenedores de software, proporcionando una capa adicional de abstracci&oacute;n y automatizaci&oacute;n de Virtualizaci&oacute;n a nivel de sistema operativo en Linux. Docker accede a la virtualizaci&oacute;n del kernel Linux ya sea directamente a atrav&eacute;s de la biblioteca libcontainer (disponible desde Docker 0.9), o indirectamente a atrav&eacute;s de libvirt, LXC o systemd-nspawn como se visualiza en la siguiente imagen: 

![Docker](/images/docker-vm-difference.png)

## Pagina de como instalar docker en windows
Link: <https://docs.docker.com/docker-for-windows/install>

# Para usar caracteres de escape
https://www.freeformatter.com/html-escape.html

# Selenium.
## Que es selenium IDE?
Es un entorno de pruebas de software para aplicaciones en la cual provee una herramienta que graba y reproduce los pasos que se 
realizarian en una prueba manual.

## Que es selenium Web Driver?
Selenium Web Driver implementa a través de un controlador del navegador específico para cada navegador que envía los comandos y trae los resultados de regreso.

## Maven.
##### 	&iquest;Que es Maven?
Es una herramienta de software para la gestión y construcción de proyectos Java, tiene un modelo de configuración de construcción más 
simple, basado en un formato XML. Maven utiliza un Project Object Model (POM) para describir el proyecto de software a construir, sus 
dependencias de otros módulos y componentes externos, y el orden de construcción de los elementos. Viene con objetivos predefinidos 
para realizar ciertas tareas claramente definidas, como la compilación del código y su empaquetado.

##### 	Como instalar Maven.
1. Descargar maven <https://maven.apache.org/download.cgi>
2. Descomprimir
3. Definir las variables de entorno (MS_HOME) con la ruta de donde fue descomprimido
4. Validar que maven funciona con el comando mvn -v

##### 	&iquest;Que version de Maven tengo instalada?
Para saber que version de Maven tengo instalada se utiliza el comando: mvn -v

##### 	Ciclo de Vida.


##### 	&iquest;Que son archetype?
Es un patr&oacute;n o modelo original sobre el que pueden desarrollar todas aquellas cosas que son de un mismo tipo. Puede decirse que 
son plantillas, parametrizadas o configuradas para utilizar determinadas tecnolog&iacute;as, que los programadores utilizan como base 
para escribir y organizar el c&oacute;digo de la aplicaci&oacute;n.

## POM.
##### 	&iquest;Que es POM?
Es el encargado de almacenar toda la informaci&oacute;n para su correcta gesti&oacute;n por ejemplo grupo, versi&oacute;n, 
dependencias, etc.

##### 	Como agregar una nueva dependencia.
Para agregar una nueva dependencia hay que abrir el archivo xml POM y entre el tag &lt;dependencies&gt; agrega la dependencia

&lt;dependency&gt;

      &lt;groupId&gt;junit&lt;/groupId&gt;

      &lt;artifactId&gt;junit&lt;/artifactId&gt;

      &lt;version&gt;4.0&lt;/version&gt;

&lt;/dependency&gt;


## Debug Remoto.
https://es.wikipedia.org/wiki/Plain_Old_Java_Object


>echo 
"\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*"
>
>echo "\* Create a proyect with mvn and archetype:jbehave" 
>
>echo "\* groupId	Company." 
>
>echo "\* artifactId	Projet." 
>
>echo "\* version	RELEASE is a valid version." 
>
>echo "\* repository	The repository where to find the archetype." 
>
>echo "\* package	groupId \+ artifactId" 
>
>echo "\* description	The description of the archetype." 
>
>echo "\* " 
>
>echo "\* mvn clean install \-DstoryFilter=native.story" 
>
>echo "\* mvn clean install \-Dmeta.filter=native" 
>
>echo "\* mvn clean install \-DstoryFilter=native.story -Dmeta.filter=native" 
>
>echo "\* mvn eclipse:eclipse" 
>
>echo "\* mvn idea:idea" 
>
>echo "\* Linux MAVEN_OPTS=\"-Xdebug -Xnoagent -Xrunjdwp:transport=dt_socket,server=y,suspend=y,address=5005\";" 
>
>echo "\* Linux export MAVEN_OPTS" 
>
>echo "\* Windows set MAVEN_OPTS=\\\"-Xdebug -Xnoagent -Xrunjdwp:transport=dt_socket,server=y,suspend=y,address=8000\";" 
>
>echo "\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*" 
>
> mvn archetype:generate -Dfilter=org.jbehave:jbehave -DartifactId=test -DgroupId=com.vates -Dpackage=com.vates.test -Dversion=1.0 -DinteractiveMode=true
>
> cd test && mvn clean && mvn install
>
> Y

