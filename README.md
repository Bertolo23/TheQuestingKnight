# THE QUESTING KNIGHT

## JUGABILIDAD

1. **SALUD**:
Cada personaje tiene un valor único de salud la cúal no se puede aumentar, si llegas a 0 mueres

2. **DINERO**:
Todos los personajes empiezan con 0 y este dinero se puede usar para comprar equipamiento y para convertirte en rey

3. **PERSONAJES**:
Hay 4 a elegir (luchador, asesino, tanque y mago) cada uno tiene sus estadísticas propias. Todos los personajes están disponibles

4. **ESTADÍSTICAS**
Cada personaje tiene sus valores propios pero todos tienen las mismas(vitalidad, fuerza, agilidad, percepción mágica)

5. **ENTRENAMIENTO**
Es una de las opciones del Menú de acciones y te permite ganar puntos de experiencia

6. **PUNTOS DE EXPERIENCIA**
Sirven para mejorar tus estadísticas

7. **MISIONES**
Otra opción del Menú de acciones y te permite ganar dinero haciendo una misión, la contra es que necesitaras una serie de estadísticas a cierto nivel y que perderás salud

8. **TIENDA**
Es donde podrás gastar tu dinero en objetos que te modificarán tus estadisticas

9. **INVENTARIO**
Los objetos que compras en la tienda se guardaran aqui y seran necesarios para algunas misiones, se puede comprobar su contenido desde el Menu de Acciones


## TECNOLOGIAS
* [Git-Hub](https://github.com/) - Repositorio de código.
* [Java](https://www.java.com/es/) - Lenguaje utilizado.
* [Visual Studio Code](https://code.visualstudio.com/) - Entorno de desarrollo.
* [Stack-Overflow](https://stackoverflow.com/questions) - Busqueda de soluciones y codigo.
* [Chat-GPT](https://chatgpt.com/) - Explicacion de dudas y agilizacion de procesos.
* [Creative Fabrica](https://www.creativefabrica.com/es/tools/ascii-art-generator/) - Creacion de Titulos ASCCI.
* [MySQL](https://www.mysql.com/) - BAse de Datos.

## IMPORTAR DESDE GITHUB
* [TheQuestingKnight_Repo](https://github.com/Bertolo23/TheQuestingKnight.git) - Repositorio del proyecto.

    ```bash
    git clone https://github.com/Bertolo23/TheQuestingKnight.git
    ```

## BASE DE DATOS

Para que las funciones con la base de datos funcionen se debe ejecutar abrir el sguiente archivo en MySQL y ejecutarse.


    Videojuego/scriptSQL/TheQuestingKnightDB.sql


## FICHEROS

Se debera abrir el proyecto desde la carpeta TheQuestingKnight para que funcione la exportación a ficheros


    TheQuestingKnight


## EJECUTAR

1. **TERMINAL**
Para ejecutarlo deberás  navegar a la carpeta Videojuego/lib/juego_jar desde el terminal y ejecutar este comando:
    ```bash
    java -jar TheQuestingKnight.jar
    ```

2. **VISUAL STUDIO CODE**
Desde Visual deberás abrir la carpeta TheQuestingKnight despues navegas hasta el archivo de Videojuego/src/Videojuegov2.java y pulsas F5.

## POSIBLES MEJORAS FUTURAS 
* Sistema de combate más dinámico con animaciones.

* Árbol de habilidades personalizable.

* Más tipos de misiones y enemigos.

* Interfaz gráfica (usando JavaFX o Swing).

* Soporte multijugador local o en red.

* Doblaje o efectos sonoros.

* Traducción a múltiples idiomas.
## ESTRUCTURA DEL PROYECTO
```
TheQuestingKnight/
├── .vscode/
│   └── settings.json
├── Documentación/
│   ├── Diagrams/
│   ├── docs/
│   ├── Especificación_Analisis_IvánBertolo_1.7.docx
│   └── Especificación_Analisis_IvánBertolo_1.7.pdf
├── Videojuego/
│   ├── lib/
│   │   |── juego_jar/
│   │   |   ├── TheQuestingKnight.jar
│   │   └── mysql-connector-j-8.0.33.jar
│   ├── ScriptSQL/
│   │   └── TheQuestingKnightDB.sql
│   └── src/
│       ├── bbd/
│       │   ├── ConexionBBDD.java
│       │   └── CRUD.java
│       ├── clases/
│       │   ├── entrenamiento/
│       │   │   └── Entrenamiento.java
│       │   ├── estadísticas/
│       │   │   └── GestionEstadisticas.java
│       │   ├── interfaz/
│       │   │   ├── Menus.java
│       │   │   └── Títulos.java
│       │   ├── misiones/
│       │   │   ├── InfoMisiones.java
│       │   │   ├── Misiones.java
│       │   │   ├── Pelea.java
│       │   │   └── TablonMisiones.java
│       │   ├── partida/
│       │   │   └── Partida.java
│       │   ├── personajes/
│       │   │   ├── AccionesPersonajes.java
│       │   │   ├── Asesino.java
│       │   │   ├── Enemigo.java
│       │   │   ├── Luchador.java
│       │   │   ├── Mago.java
│       │   │   ├── Personaje.java
│       │   │   └── Tanque.java
│       │   ├── tienda/
│       │   │   ├── ObjetoTienda.java
│       │   │   └── Tienda.java
│       │   ├── ficheros/
│       │   │   ├── GestionFicheros.java
│       │   │   └── HistorialPartidas.txt
│       │   └── util/
│       │       └── Utilidades.java
│       └── Videojuegov2.java
├── README.md
```
