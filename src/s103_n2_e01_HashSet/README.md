# Nom del Projecte
**Descripció**: Sprint 1, Tasca 2, Nivell 3, Exercici 1

## 📌 Exercici 1 — HashSet sense duplicats exactes i Exercici 2 — Ordenació múltiple
```
En aquest nivell treballarem amb col·leccions com HashSet i amb ordenació d’objectes mitjançant Comparable i Comparator. L'objectiu és entendre com Java compara i organitza objectes a partir de certes regles que nosaltres definim. També aprofundirem en la importància de sobreescriure mètodes com equals() i hashCode() per controlar els duplicats, així com en la manera d'ordenar objectes personalitzats.


Crea una classe anomenada Restaurant amb dos atributs: nom (String) i puntuació (int). Implementa els mètodes necessaris (equals() i hashCode()) perquè no es puguin introduir objectes Restaurant amb el mateix nom i la mateixa puntuació dins un HashSet.

Important

Pot haver-hi restaurants amb el mateix nom si la puntuació és diferent, però no pot haver-hi duplicats exactes (mateix nom i mateixa puntuació).

------

A partir de la classe Restaurant del programa anterior, implementa la funcionalitat necessària perquè els objectes es puguin ordenar alfabèticament pel nom i, en cas que coincideixin, per puntuació en ordre descendent.

Pots fer-ho implementant la interfície Comparable o mitjançant un Comparator, segons consideris més adient.

Exemple d'ordre:
nom: Restaurant A, puntuació: 9  
nom: Restaurant A, puntuació: 7  
nom: Restaurant B, puntuació: 8  

```

## ✨ Funcionalitats (si és aplicable)
Aquest exercici és més senzill, aixì que l'única cosa que jo he fet a més de cumplir l'exercici ha sigut
separar el Comparator de le classe Restaurant, perque el Comparator té una funció pròpia i no fa part de
la definició del tipus Restaurant.

## 🛠 Tecnologies
- Backend: Java

## 🚀 Instal·lació i Execució
1. Clonar el repositori: `git clone javaITAc26_S01T03`
2. Execució del "Main"


## 📸 Demo
```bash
/usr/lib/jvm/java-1.21.0-openjdk-amd64/bin/java -javaagent:/home/alan/idea-2026.1.1/idea-IU-261.23567.138/lib/idea_rt.jar=37059 -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8 -classpath /home/alan/alan_projects/JavaBootcamp/out/production/JavaBootcamp s103_n2_e01_HashSet.Main
Nom: La Tagliatella, Puntuació: 4
Nom: La Tagliatella, Puntuació: 3
Nom: Xàtiva, Puntuació: 5
Nom: Xàtiva, Puntuació: 4

Process finished with exit code 0
```