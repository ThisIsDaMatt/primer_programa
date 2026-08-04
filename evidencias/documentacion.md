# Documentación - Proceso de colaboración
> [!NOTE]
> Una parte del flujo de trabajo se hizo a través de git y GitHub, pero a través de Visual Studio Code, el cual no necesita comandos y es meramente gráfico. Por razones de tiempo, el trabajo se dejó como está, y las partes faltantes si se realizaron con git por consola. En esta documentación se explican los dos métodos.

## Creación del repositorio
Se crea el repositorio directamente en GitHub, con configuración pública y con readme incluido, el cual se empieza a trabajar en el momento de la creación.

Se clona el repositorio para trabajarlo en VSCode con los siguientes comandos:

```
git clone github.com/ThisIsDaMatt/primer_programa
```

Al trabajar con el README, construir el código en Java con el Hola Mundo y más, aunque se hizo con VSCode haciendo commits con el botón disponible, los comandos que se hubieran usado son:

```
git status
git add .
git commit -m "mensaje del commit"
git push
```

La primera vez al hacer push, GitHub pide una autenticación para asegurarse que es el dueño o el colaborador quien va a hacer un cambio. Al autenticarse, se suben los cambios.

Para clonar el repositorio y trabajar conjuntamente, se usan comandos que se muestran mas adelante.

## Colaboración conjunta
Al iniciar el trabajo, añadí a mi compañero Esteban como colaborador del repositorio, lo cual le permite directamente clonar el repositorio, hacer commits, pushes y más, para no depender de pull requests.

Se le envía la solicitud, se acepta y se empieza a trabajar conjuntamente en el repositorio.

Los comandos usados para clonar el repositorio, recuperar los archivos y trabajar en la carpeta fueron:

```
git clone github.com/ThisIsDaMatt/primer_programa
git pull
```

Despues del pull, se verifican que se tengan todos los archivos con el comando:

```
git status
```
Y al verficar, se puede seguir con los mismos comandos de antes para subir archivos a GitHub.

> [!IMPORTANT]
> Se debe aclarar de varios problemas que surgieron durante este trabajo, concretamente con el flujo de git en consola, los cuales se explicarán a continuación.
