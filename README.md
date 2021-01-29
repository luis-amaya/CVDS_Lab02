# CVDS_Lab02

## La herramienta Maven:

Cuál es su mayor utilidad: simplificar los procesos de build ( compilar y.generar ejecutables a partir del código fuente).
Maven es una herramienta capaz de gestionar un proyecto software completo, desde la etapa en la que se comprueba que el código es correcto, hasta que se despliega la aplicación, pasando por la ejecución de pruebas y generación de informes y documentación.
Fases de Maven:
- Validación (validate): Validar que el proyecto es correcto.
- Compilación (compile).
- Test (test): Probar el código fuente usando un framework de pruebas unitarias.
- Empaquetar (package): Empaquetar el código compilado y transformarlo en algún formato tipo .jar o .war.
- Pruebas de integración (integration-test): Procesar y desplegar el código en algún entorno donde se puedan ejecutar las pruebas de integración.
- Verificar que el código empaquetado es válido y cumple los criterios de calidad (verify).
- Instalar el código empaquetado en el repositorio local de Maven, para usarlo como dependencia de otros proyectos (install).
- Desplegar el código a un entorno (deploy).

## Ciclo de vida de construcción:
1. Validar: verificación si toda la información necesaria para la acumulación está disponible
2. compilar: compilar el código fuente
prueba de compilación: compilar el código fuente de prueba
3. prueba: ejecutar pruebas unitarias
4. Paquete: paquete compilado el código fuente en el formato distribuible (frasco, guerra, ...)
5. la integración de la prueba: proceso e implementar el paquete si es necesario para ejecutar las pruebas de integración
6. instalar: instalar el paquete a un repositorio local
Implementar: copiar el paquete al repositorio remoto

## ¿Para qué sirven los plugins?: 
Maven es en realidad un marco de ejecución de complementos en el que cada tarea se realiza mediante complementos. Los complementos de Maven generalmente se usan para:
* crear archivo jar
* crear archivo de guerra
* compilar archivos de código
* prueba unitaria de código
* crear documentación del proyecto
* crear informes de proyectos

Un complemento generalmente proporciona un conjunto de objetivos, que se pueden ejecutar utilizando la siguiente sintaxis:
**mvn [plugin-name]:[goal-name]**
Por ejemplo, un proyecto de Java se puede compilar con el objetivo de compilación de maven-compiler-plugin ejecutando el siguiente comando.
**mvn compiler:compile**

## ¿Qué es y para qué sirve el repositorio central de Maven?: 
El repositorio central de Maven es un repositorio proporcionado por la comunidad de Maven. Contiene una gran cantidad de bibliotecas de uso común.
Cuando Maven no encuentra ninguna dependencia en el repositorio local, comienza a buscar en el repositorio central utilizando la siguiente 
[Repositorio Central]: https://repo1.maven.org/maven2/

### Los conceptos clave del repositorio central son los siguientes:
* Este repositorio está gestionado por la comunidad de Maven.
* No es necesario configurarlo.
* Requiere acceso a Internet para ser buscado.

Para navegar por el contenido del repositorio central de Maven, la comunidad de Maven ha proporcionado una [URL]: https://search.maven.org/#browse 

Con esta biblioteca, un desarrollador puede buscar todas las bibliotecas disponibles en el repositorio central.

## Ejercicio de las Figuras
1. Buscar cómo se crea un proyecto Maven con ayuda de los arquetipos (archetypes):
    - Crear una nueva carpeta, puede ser en Documents llamada proyecto_maven.
    En la terminal, ubicarse en la carpeta /home/desarrollo/Documents/proyecto_maven.
    Ejecutar el siguiente comando en la terminal. Creará la estructura de carpetas y archivos del proyecto.
    **mvn archetype:generate**
2. Busque cómo ejecutar desde línea de comandos el objetivo "generate" del    plugin "archetype", con los siguientes parámetros:
    - mvn archetype:generate
    Nos mostrará el mensaje Choose a number or apply filter (**format: [groupId:]artifactId**, case sensitive contains): 923:. Se oprime la tecla Enter para tomar la lista de arquitectura del proyecto por defecto (el número puede variar).
    Nos mostrará el mensaje Choose org.apache.maven.archetypes:maven-archetype-quickstart version: 1: 1.0-alpha-1 … 6: 1.1. Choose a number: 6:. Se oprime la tecla Enter para tomar al versión de la arquitectura por defecto.
    Se establecen los datos esenciales del proyecto. Al terminar se escribe la letra Y para confirmar:
    groupId: Identificará tu proyecto frente a los demás, usaremos com.proyecto.
    artifactid: Nombre de la versión jar sin versión, usaremos primer-proyecto.
    version: Usaremos 1.0.
    package: Nombre del paquete principal de la aplicación, usaremos com.proyecto.demo.mvn 
    Compilar y Ejecutar
3. Busque cuál es el objetivo del parámetro "package" y qué otros parámetros se podrían enviar al comando mvn:
    - "$ mvn compile – compila el proyecto y deja el resultado en target/classes"
    - "$ mvn test – compila los test y los ejecuta"
    - "$ mvn package – empaqueta el proyecto y lo dejará en taget/autentiaNegocio-1.0-SNAPSHOT.jar"
    - "$ mvn install – guarda el proyecto en el repositorio"
    - "$ mvn clean – borra el directorio de salida (target)"
4. Busque cómo ejecutar desde línea de comandos, un proyecto maven y verifique la salida cuando se ejecuta con la clase App.java como parámetro en "mainClass":
    - "exec:java -Dexec.mainClass="edu.eci.cvds.patterns.App" "
5. Buscar cómo enviar parámetros al plugin "exec".
    - "exec:java -Dexec.mainClass="edu.eci.cvds.patterns.App" -Dexec.args="arg1 " "
