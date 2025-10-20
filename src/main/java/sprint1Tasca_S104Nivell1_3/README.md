## 3.3-Excepciones-Nivel1

## 📄 Descripción - Enunciado del ejercicio

Este proyecto consiste en crear una clase con un método que lance una ArrayIndexOutOfBoundsException y verificar su
correcto funcionamiento mediante un test de JUnit 5.
El sistema permite:

Definir un método que acceda a un índice de un arreglo.

Lanzar automáticamente una ArrayIndexOutOfBoundsException si el índice está fuera del rango.

Ejecutar pruebas unitarias con JUnit 5 para validar distintos casos de acceso al arreglo.

## 💻 Tecnologías Utilizadas

Java 23

IntelliJ IDEA (opcional)

JUnit 5 (Jupiter API)

## 📋 Requisitos

Tener instalado Java JDK 23 o superior.

IDE o editor de texto que soporte Java (IntelliJ, Eclipse, VS Code, etc.).

Configuración de JUnit 5 en el proyecto o dependencias Maven correctas.

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

Asegúrate de que las dependencias de JUnit 5 están correctamente configuradas.

## ▶️ Ejecución

Compila los archivos Java:

```
javac spring1Tasca_S104Nivell1_3/*.java
```

Ejecuta el programa principal (si hay un main para pruebas interactivas):

java spring1Tasca_S104Nivell1_3.AccessElement

Ejecuta las pruebas unitarias JUnit 5 usando el classpath correcto con librerías JUnit:

```
java -cp "out;junit-jupiter-api-5.8.1.jar;junit-jupiter-engine-5.8.1.jar;opentest4j-1.2.0.jar;apiguardian-api-1.1.2.jar" org.junit.platform.console.ConsoleLauncher --scan-classpath
```

El test utiliza assertThrows para comprobar que se produce la ArrayIndexOutOfBoundsException.

Observa los resultados en el panel de Run del IDE:

Verde √ → test aprobado

Rojo ✗ → test fallido

## 🌐 Despliegue

Este proyecto es un ejercicio didáctico, no requiere despliegue en producción.

Opcionalmente, se puede empaquetar como .jar ejecutable:

```
jar cfe Excepciones.jar spring1Tasca_S104Nivell1_3.AccessElement -C out .
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
git commit -m "Agrega test de excepción"
```

Sube los cambios a tu rama:

```
git push origin feature/NuevoTest
```

Abre un pull request para revisión.