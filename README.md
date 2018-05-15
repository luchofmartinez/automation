# Version Control Software - Ventajas y desventajas

## Mercurial
- *Ventajas*: Sistema de control de versiones distribuido. Escalable y adaptable al tamaño y exigencias del proyecto.

- *Desventajas*: Pocas caracteristicas añadidas por default. La comunidad de desarrollo es muy pequeña.


## SVN
- *Ventajas*: Sistema de control de versiones centralizado. Al realizar operaciones de sincronización entre los datos de los programas clientes y el servidor SVN sólo se transmiten aquellos archivos que han sufrido cambios, no todos los archivos.

- *Desventajas*: El manejo de cambio de nombres de archivos no es completo. Lo maneja como la suma de una operación de copia y una de borrado. El manejo de archivos binarios los trata internamente como si fuera de texto no como de Subversion.

## GIT
- *Ventajas*: Sistema de control de versiones distribuido. Se trabaja directamente de forma local con los archivos del repositorio aun cuando no tengas una conexion a internet. La velocidad de subida de los archivos es rapida. Se trabaja con los equipos de manera mas facil.

- *Desventajas*: Se necesita especializar al personal que llegara a  usar esta herramienta ya que podria ocasionar errores en los cambios.


## Repositorios GIT (Free y privadas)


- GitHub
--**Ventaja**: Gratuita con cantidad ilimitado de usuarios colaboradores. Compartir: El código fuente del proyecto no sólo se puede copiar con Git, también se puede descargar como archivo.
--**Desventaja**: El servicio no es completamente gratuito. Para acceder a todas las funciones de GitHub, se debe actualizar a un usuario Premium. Limitaciones de tamaño. Los archivos no pueden ser mayores a 100 MB mientras que el repositorio puede alojar 1 GB de información.

- BitBucket: 
--**Ventaja**: Gratuita con cantidad ilimitada de repositorios. Usa Git pero tambien es compatible con Mercurial. Condiciones especiales para estudiantes y profesores.
--**Desventaja**: Limitada por la cantidad de usuarios colaboradores (Maximo 5). No es de código abierto, pero admite proyectos de código abierto.

- GitLab:
--**Ventajas**: opera bajo una licencia de código abierto. Seguimiento de errores y edición de código basado en la web.
--**Desventajas**: Interface relativamente lenta. Frecuentes problemas técnicos con los repositorios


## Requerimientos
> Git (Versionador de código)

## Sistema de integración continua
- **Jenkins**: Herramienta de código abierto desarrollada en Java. Usa una gran variedad de plugins. Soporta herramientas de control de versiones como CVS, Subversion(SVN), Git, Mercurial y ejecuta proyectos basados como Apache Maven.
- **Bamboo**: Presta servicio tanto de nube como de instalacion. Es gratis solamente por 30 dias y luego de eso ofrece planes para equipos grandes y chicos. Es una herramiento de Atlassian y es de facil importar configuraciones de JIRA y Bitbucket
- **Hudson**:  Herramienta de código abierto desarrollada en Java basada en Servlets como Tomcat y GlassFish. Trabaja con herramientas de control de versiones como CVS, Subversion (SVN)y Git

## Comandos GIT 
- GIT STATUS
- GIT ADD [file name]
- GIT PUSH ORIGIN MASTER
- GIT CHECKOUT
- GIT COMMIT
- GIT CLONE [reposity]
http://ndpsoftware.com/git-cheatsheet.html#loc=stash;

## como clono el repo en ssh
![GitHub Image](/images/github01.png)
## que es ssh
SSH (Secure shell), protocolo y programa que lo implementa y sirve para acceder servidores privados a través de una puerta trasera, permitiendo manejar por completo el servidor mediante un intérprete de comandos. Tambien nos permite copiar datos de forma segura (tanto archivos sueltos como simular sesiones FTP cifradas), gestionar claves RSA para no escribir claves al conectar a los dispositivos y pasar los datos de cualquier otra aplicación por un canal seguro tunelizado mediante SSH.

## Informacion sobre docker - 
-
## Pagina de como instalar docker en windows
Link: <https://docs.docker.com/docker-for-windows/install>
