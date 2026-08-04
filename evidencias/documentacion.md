# Documentación - Proceso de colaboración
> [!NOTE]
> Una parte del flujo de trabajo se hizo a través de git y GitHub, pero a través de Visual Studio Code, el cual no necesita comandos y es meramente gráfico. Por razones de tiempo, el trabajo se dejó como está, y las partes faltantes si se realizaron con git por consola. En esta documentación se explican los dos métodos.

## Instalación del JDK de Java y el entorno de desarrollo
Para el **correcto funcionamiento de Java**, se necesita tanto un **JDK** (Java Development Kit), como las **extensiones** necesarias en Visual Studio Code.

Primero, los pasos para la **descarga del JDK** de Java son:

- **Dirigirse** a [https://www.oracle.com/latam/java/technologies/downloads/](https://www.oracle.com/latam/java/technologies/downloads/)
- Seleccionar **x64 Installer** o MSI Installer
- **Descargar** el archivo del instalador
- Seguir las **instrucciones del instalador**, usar las opciones recomendadas
- **Reiniciar el equipo** para asegurar que se llevan a cabo los cambios

Para **poder usar Java** correctamente en **Visual Studio Code**, los pasos son:

- Dirigirse a **Extensiones**
- Buscar "**Extension pack for Java**", el cual **incluye todas las extensiones** necesarias tanto para debug, sintaxis, autocompletado y más.
- VSCode debería **reconocer el JDK** y el entorno, en caso que **no lo haga**, saldrá un aviso. Se debe **seleccionar el directorio** donde está instalado el JDK.

Con estos pasos y estas instalaciones, se podrán **crear y ejecutar archivos de Java** tanto en VSCode como en la consola de Windows.

## Creación del repositorio
Se crea el repositorio directamente en **GitHub**, con configuración pública y con readme incluido, el cual se empieza a trabajar en el momento de la creación.

Se **clona el repositorio** para trabajarlo en VSCode con los siguientes comandos:

```
git clone github.com/ThisIsDaMatt/primer_programa
```

Al trabajar con el README, construir el código en Java con el Hola Mundo y más, aunque se hizo con **VSCode** haciendo commits con el botón disponible, los **comandos** que se hubieran usado son:

```
git status
git add .
git commit -m "mensaje del commit"
git push
```

La primera vez al hacer push, GitHub **pide una autenticación** para asegurarse que es el dueño o el colaborador quien va a hacer un cambio. Al autenticarse, **se suben los cambios**.

Para **clonar** el repositorio y trabajar conjuntamente, se usan comandos que se **muestran mas adelante**.

Los **archivos .java** se crearon directamente en **Visual Studio Code**, con el botón nuevo archivo, pero el flujo con git **habría sido de la siguiente manera**:

```
touch prueba.java
touch HolaMundo.java
touch HolaMundoRepitiendo.java
```

Y directamente los **archivos Java** se trabajan en **Visual Studio Code**, junto al **Markdown**, puesto que trabajar en ellos con los editores de texto de git sería mucho mas tedioso.

## Colaboración conjunta
Al iniciar el trabajo, añadí a mi compañero Esteban como **colaborador del repositorio**, lo cual le permite directamente **clonar** el repositorio, hacer **commits, pushes y más**, para no depender de pull requests.

Se le envía la solicitud, se acepta y se empieza a **trabajar conjuntamente** en el repositorio.

Los **comandos usados** para clonar el repositorio, recuperar los archivos y trabajar en la carpeta fueron:

```
git clone github.com/ThisIsDaMatt/primer_programa
git pull
```

Despues del pull, **se verifican** que se tengan todos los archivos con el comando:

```
git status
```
Y al verficar, se puede seguir con los mismos comandos de antes para **subir archivos a GitHub**.

Para **crear la carpeta** de evidencias, **copiar** las imagenes del cmdchallenge, **crear** este Markdown y **poner** la presentación, se usaron los siguientes comandos:

```
mkdir evidencias
cd evidencias/
touch documentacion.md
cp ~/OneDrive/Escritorio/MemoriaRAM.pptx primer_programa/ 
```
Como eran **multiples imagenes**, se copiaron y pegaron **manualmente** con el explorador de Windows para mayor comodidad.

Despues de todos estos cambios, **se sigue el flujo**: se añaden los archivos al stage, se hace el commit y se suben.

La documentación se trabajó en **Visual Studio Code**, haciendo todos los commits via la consola de git.
## Problemas encontrados en el trabajo

> [!IMPORTANT]
> Se debe aclarar de varios problemas que surgieron durante este trabajo, concretamente con el flujo de git en consola, los cuales se explicarán a continuación.

Se pudo **clonar y hacer pull y push** de manera correcta, aunque a la hora de hacer **git status o git add .**, los siguientes "errores" (no eran errores, pero en el contexto de la situación, si significaban una anomalía) aparecían:

```
git commit -m "mensaje"
Your branch is up to date with 'origin/main'.
nothing to commit, working tree clean

git push
Everything up-to-date
```

Esto, **a pesar** de que habian cambios en la carpeta, habiendo añadido las imagenes.

Por seguridad, **se revirtieron** los cambios usando los comandos **rm, con los parametros -rf**, que significa que se usa de **forma recursiva** para poder borrar todo el contenido de la carpeta y además para **saltar cualquier confirmación** que git suelte.

```
rm -rf Evidencias/
```
Este problema se **solucionó** iniciando el proceso de nuevo, puesto que al haber hecho el push **ya se encontraba en GitHub**, pero para asegurar que el flujo era el correcto, se inició el proceso **de nuevo**, desde la creación de la carpeta.

Tambien, al hacer push, **podía** salir este error:

```
git push
To https://github.com/ThisIsDaMatt/primer_programa
[rejected]
main > main (fetch first)
error: failed to push some refs to 'https://github.com/ThisIsDaMatt/primer_programa"
hint: Updates were rejected because the remote contains work that you do not
hint: have locally. This is usually caused by another repository pushing to
hint: the same ref. If you want to integrate the remote changes, use
hint: 'git pull before pushing again.
hint: See the 'Note about fast-forwards' in 'git push--help' for details.
000008083@N00024554 MINGW64 ~/primer_programa (main)
```

Lo cual **se pudo solucionar** haciendo un **git pull**, puesto que este error indicaba que habian archivos que estaban en GitHub que **faltaban localmente**, permitiendo un push correcto.

Los errores **no solo** ocurrieron en git, sinó que tambien con el **Markdown**.

A la hora de añadir imagenes, **se usa la sintaxis**:

```
![Texto alternativo](ruta/imagen.png)
```

Con esto, **se muestra** la imagen tanto en la preview del Markdown de VSCode sino que **tambien en GitHub**, pero al principio, la imagen se añadió de esta forma, la cual **no permitia** que se mostrara en GitHub:

```
![Texto alternativo](ruta\imagen.png)
```
**La unica diferencia**, sutil pero importante, es que la barra **es diferente**, y como GitHub renderiza el Markdown como si **fuera en Linux**, la barra común ( / ) es la que **se tenía que usar**, contrario a la contrabarra ( \ ) que se usa en Windows.

