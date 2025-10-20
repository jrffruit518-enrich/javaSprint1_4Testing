# 1.1-Biblioteca-Nivell1

## 📄 Descripción - Enunciado del ejercicio
Este proyecto consiste en crear una clase Java (Library) que gestione una colección de libros en una biblioteca, utilizando una lista para almacenar objetos Book. La clase debe permitir añadir libros, recuperar la lista completa, obtener un libro por su posición, añadir un libro en una posición específica y eliminar un libro por título. Además, se debe garantizar que la lista permanezca ordenada alfabéticamente y no contenga títulos duplicados. El correcto funcionamiento se verifica mediante pruebas unitarias con JUnit 5.
El sistema permite:

Añadir libros a la colección.
Recuperar la lista completa de libros.
Obtener el título de un libro dado un índice.
Añadir un libro en una posición específica.
Eliminar un libro por título.
Mantener la lista ordenada alfabéticamente después de añadir o eliminar libros.
Evitar títulos de libros duplicados.

Las pruebas unitarias verifican:

Que la lista de libros no es nula tras crear un objeto Library.
Que la lista tiene el tamaño esperado tras insertar varios libros.
Que un libro específico está en la posición correcta.
Que no existen títulos duplicados en la lista.
Que se puede recuperar el título de un libro dado un índice.
Que añadir un libro incrementa correctamente el tamaño de la lista.
Que eliminar un libro reduce el tamaño de la lista.
Que la lista permanece ordenada alfabéticamente tras operaciones de añadir o eliminar.

## 💻 Tecnologías Utilizadas

Java 23
IntelliJ IDEA (opcional)
JUnit 5 (Jupiter API)

## 📋 Requisitos

Tener instalado Java JDK 23 o superior.
IDE o editor de texto que soporte Java (IntelliJ IDEA, Eclipse, VS Code, etc.).
Configuración de JUnit 5 en el proyecto o dependencias Maven/Gradle correctas.

## 🛠️ Instalación

Clona este repositorio:
```
git clone https://github.com/jrffruit518-enrich/javaSprint1_4.git
```

Accede al directorio del proyecto:
```
cd 3.3-Excepciones-Nivel1
```
Abre el proyecto en IntelliJ IDEA o tu IDE preferido.
Asegúrate de que las dependencias de JUnit 5 están correctamente configuradas. Ejemplo para Maven (pom.xml):
```
xml<dependency>
<groupId>org.junit.jupiter</groupId>
<artifactId>junit-jupiter</artifactId>
<version>5.10.2</version>
<scope>test</scope>
</dependency>
```

## ▶️ Ejecución

Compila los archivos Java:
```
javac sprint1Tasca_S104Nivell1_1/*.java
```
Ejecuta las pruebas unitarias JUnit 5 usando el classpath correcto con las librerías de JUnit:
```
java -cp "out;junit-jupiter-api-5.10.2.jar;junit-jupiter-engine-5.10.2.jar;opentest4j-1.3.0.jar;apiguardian-api-1.1.2.jar" org.junit.platform.console.ConsoleLauncher --scan-classpath
```
O, si usas Maven:
```
mvn test
```
Observa los resultados en el panel de Run del IDE:

Verde √ → Test aprobado
Rojo ✗ → Test fallido


(Opcional) Si deseas probar interactivamente, puedes crear un main en una clase para interactuar con Library, por ejemplo:
```
javapublic class Main {
public static void main(String[] args) {
Library library = new Library();
library.addBook(new Book("A Tale of Two Cities"));
System.out.println(library.getBooks());
}
}
```
Compila y ejecuta:
```
java sprint1Tasca_S104Nivell1_1.Main
```

🌐 Despliegue
Este proyecto es un ejercicio didáctico, no requiere despliegue en producción.
Opcionalmente, se puede empaquetar como .jar ejecutable:
```
jar cfe Library.jar sprint1Tasca_S104Nivell1_1.Main -C out .
```
## 🤝 Contribuciones
¡Las contribuciones son bienvenidas! Por favor, sigue los siguientes pasos:

Haz un fork del repositorio.
Crea una nueva rama:
```
git checkout -b feature/NuevoTest
```
Realiza tus cambios y haz commit:
```
git commit -m "Agrega nuevo test para Library"
```
Sube los cambios a tu rama:
```
git push origin feature/NuevoTest
```
Abre un pull request para revisión.