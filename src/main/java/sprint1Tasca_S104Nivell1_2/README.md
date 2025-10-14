# 1.2-Calcul-DNI-Nivell1

## 📄 **Descripción - Enunciado del ejercicio**

Este proyecto consiste en el desarrollo de un programa en Java para calcular la letra del DNI español a partir de un
número.  
El sistema permite:

1. Introducir un número de DNI válido (entre 10000000 y 99999999).
2. Calcular la letra correspondiente utilizando la fórmula oficial:  
   letra = LETTERS[dniNumber % 23]

3. Validar el número de DNI antes de calcular la letra.
4. Ejecutar pruebas unitarias con JUnit 4 para verificar distintos casos de DNI.

## 💻 **Tecnologías Utilizadas**

- Java 17
- IntelliJ IDEA (opcional)
- JUnit 4

## 📋 **Requisitos**

- Tener instalado Java JDK 17 o superior.
- IDE o editor de texto que soporte Java (IntelliJ, Eclipse, VS Code, etc.).
- Configuración de JUnit 4 en el proyecto.

## 🛠️ **Instalación**

1. Clona este repositorio:

```
git clone <URL-del-repositorio>
```

2. Accede al directorio del proyecto:

```
cd 1.2-Calcul-DNI-Nivell1
```

3. Asegúrate de tener el JDK correctamente configurado y las librerías JUnit 4 disponibles.

## ▶️ **Ejecución**

1. Compila los archivos Java:

```
javac spring1Tasca_S104Nivell1_2/*.java
```

2. Ejecuta el programa principal (si tienes un main para pruebas interactivas):

```
java spring1Tasca_S104Nivell1_2.CalculateDNI
```

3. Ejecuta las pruebas unitarias JUnit 4:

```
java -cp "out;junit-4.13.2.jar;hamcrest-core-1.3.jar" org.junit.runner.JUnitCore spring1Tasca_S104Nivell1_2.CalculateTest
```

## 🌐 **Despliegue**

- No aplica para este ejercicio, ya que es un programa local para consola.
- Opcionalmente, se puede empaquetar como `.jar` ejecutable:

```
jar cfe CalculDNI.jar spring1Tasca_S104Nivell1_2.CalculateDNI -C out .
```

## 🤝 **Contribuciones**

¡Las contribuciones son bienvenidas! Por favor, sigue los siguientes pasos:

1. Haz un fork del repositorio.
2. Crea una nueva rama:

```
git checkout -b feature/NuevaFuncionalidad
```

3. Realiza tus cambios y haz commit:

```
git commit -m "Agrega nueva funcionalidad"
```

4. Sube los cambios a tu rama:

```
git push origin feature/NuevaFuncionalidad
```

5. Abre un pull request para revisión.