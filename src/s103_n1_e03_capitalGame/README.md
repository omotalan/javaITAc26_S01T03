# Capital Game
**Descripció**: Sprint 1, Tasca 2, Nivell 1, Exercici 3

## 📌 Exercici 3 — Capital Game
```
En aquest exercici posarem en pràctica la lectura de fitxers, l’ús de col·leccions com HashMap i la interacció amb l’usuari mitjançant un petit joc de preguntes.

A partir del fitxer countries.txt (consulta l’apartat de recursos), que conté parelles de país i capital separades per comes, el programa ha de llegir totes les dades i emmagatzemar-les en un HashMap<String, String>, on la clau és el nom del país i el valor, la seva capital.

Un cop carregades les dades, el programa demanarà el nom de l’usuari/ària i començarà el joc.

El funcionament consisteix a realitzar 10 preguntes, escollint aleatòriament 10 països diferents del HashMap. En cada ronda, es mostrarà el nom d’un país i l’usuari/ària haurà d’introduir el nom de la seva capital. Si la resposta és correcta (tenint en compte majúscules i minúscules si cal), es sumarà un punt a la seva puntuació. Al final de les 10 preguntes, es mostrarà la puntuació total obtinguda.

En finalitzar les 10 preguntes, el programa guardarà el nom de l’usuari/ària i la seva puntuació en un fitxer anomenat classificacio.txt.
```

## ✨ Funcionalitats (si és aplicable)
En aquest exercici, tot i que l'enunciat no ho demanva, calia separar els diferents recursos del joc:
el jugador (Player), la llista de països, i el joc _per se_. ConsoleUI es el punt d'on es criden tots 
aquests recursos, fent una instància del joc, amb els inputs del usuari. Des de Main es crida ConsoleUI.

Els resultats es afegeixen a cada instància de Player, i també es escriu dans el fitxer 'classificacio.txt'.

## 🛠 Tecnologies
- Backend: Java

## 🚀 Instal·lació i Execució
1. Clonar el repositori: `git clone javaITAc26_S01T03`
2. Execució del "Main"


## 📸 Demo
```bash
/usr/lib/jvm/java-1.21.0-openjdk-amd64/bin/java -javaagent:/home/alan/idea-2026.1.1/idea-IU-261.23567.138/lib/idea_rt.jar=35103 -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8 -classpath /home/alan/alan_projects/JavaBootcamp/out/production/JavaBootcamp s103_n1_e03_capitalGame.Main
Enter the filepath to the countries file: javaITAc26_S01T03/src/s103_n1_e03_capitalGame/countries.txt
Enter player name: alanzin
Question 1: What is the capital of Switzerland? Bern
Correct!
Question 2: What is the capital of Turkey? Ankara
Correct!
Question 3: What is the capital of Netherlands? Amsterdam
Correct!
Question 4: What is the capital of Latvia? Riga
Correct!
Question 5: What is the capital of Georgia? Tblisi
Wrong. The capital of Georgia is Atlanta.
Question 6: What is the capital of Portugal? Lisbon
Correct!
Question 7: What is the capital of Montenegro? Podgorica
Correct!
Question 8: What is the capital of Andorra? Andorra La Vella
Wrong. The capital of Andorra is Andorra_la_Vella.
Question 9: What is the capital of Czechia? Prague
Correct!
Question 10: What is the capital of France? Paris
Correct!
Your score was 8/10
Score saved to classificacio.txt
Want to try again? 1 for 'Yes', 0 for 'No' 1
Enter player name: toppo
Question 1: What is the capital of Iceland? Tiblisi
Wrong. The capital of Iceland is Reikiavik.
Question 2: What is the capital of Belarus? quit
Wrong. The capital of Belarus is Minsk.
Question 3: What is the capital of Serbia? d
Wrong. The capital of Serbia is Belgrade.
Question 4: What is the capital of Armenia? a
Wrong. The capital of Armenia is Ereván.
Question 5: What is the capital of Norway? s
Wrong. The capital of Norway is Oslo.
Question 6: What is the capital of Cyprus? s
Wrong. The capital of Cyprus is Nicosia.
Question 7: What is the capital of Estonia? s
Wrong. The capital of Estonia is Tallin.
Question 8: What is the capital of Azerbaijan? e
Wrong. The capital of Azerbaijan is Baku.
Question 9: What is the capital of Bosnia_and_Herzegovina? s
Wrong. The capital of Bosnia_and_Herzegovina is Sarajevo.
Question 10: What is the capital of Greece? s
Wrong. The capital of Greece is Athens.
Your score was 0/10
Score saved to classificacio.txt
Want to try again? 1 for 'Yes', 0 for 'No' 0
Bye!

Process finished with exit code 0
```