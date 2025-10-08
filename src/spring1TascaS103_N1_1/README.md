# Nivell 1 - Exercici 1: Gestió de mesos

## 📄 Descripció - Enunciat de l'exercici

Aquest projecte consisteix en la creació d'una classe `Month` amb un atribut `name` que representa el nom del mes de
l'any.  
S'han de crear 11 objectes `Month` (excepte "Agost") i afegir-los a un `ArrayList`. Posteriorment, s'ha d'inserir "
Agost" en la posició correcta i demostrar que l'`ArrayList` manté l'ordre correcte.
A més, l'`ArrayList` es converteix en un `HashSet` per assegurar que no hi hagi duplicats i s'ha de recórrer la llista
amb un **for** i amb un **iterator**.

---

## 💻 Tecnologies Utilitzades

- Java 17
- IntelliJ IDEA (opcional)
- Estructures de dades de Java: `ArrayList`, `LinkedHashSet`, `Iterator`
- Enum (`Month`)

---

## 📋 Requisits

- JDK 17 o superior
- IntelliJ IDEA o qualsevol IDE compatible amb Java

---

## 🛠️ Instal·lació

1. Clona aquest repositori:

``` 
git clone <URL_DEL_REPOSITORI>
```

2. Accedeix al directori del projecte:
   cd spring1TascaS103_N1_1


3. Obre el projecte en el teu IDE preferit i assegura't que la versió de Java és correcta.

---

## ▶️ Execució

1. Compila les classes:

```
   javac -d out src/spring1TascaS103_N1_1/*.java
   ```

2. Executa la classe principal:

```
   java -cp out spring1TascaS103_N1_1.Main
   ```

3. Observa la sortida per consola, que mostrarà:
    - Els mesos en ordre correcte amb l'`ArrayList`.
    - Els mesos recorreguts amb un **for** i amb un **iterator**.
    - Els mesos en un `LinkedHashSet` sense duplicats.

---

## 🌐 Desplegament

Aquest projecte és de demostració i pot executar-se localment sense servidor.  
Per empaquetar en un JAR i executar-lo:
jar cvf Nivell1Ex1.jar -C out .
java -jar Nivell1Ex1.jar


---

## 🤝 Contribucions

Les contribucions són benvingudes! Segueix aquests passos:

1. Fes un fork del repositori.

2. Crea una nova branca:

```
   git checkout -b feature/NovaFuncionalitat
   ```

3. Fes els teus canvis i commiteja'ls:

```
   git commit -m "Afegeix Nova Funcionalitat"
   ```

4. Puja els canvis:

```
   git push origin feature/NovaFuncionalitat
   ```

5. Fes un pull request.