# Duplicats
**Descripció**: Sprint 1, Tasca 3, Nivell 1, Exercici 1

## 📌 Exercici 1 — Duplicats
```
En aquest exercici faràs servir dues de les col·leccions més habituals de Java: ArrayList i HashSet. Practicaràs com afegir i modificar elements, i observaràs com es comporten aquestes col·leccions davant la presència de duplicats.
Enunciat

Crea una classe anomenada Month amb un atribut name, que emmagatzemi el nom del mes. Afegeix 11 objectes Month a un ArrayList, deixant fora "Agost". Insereix aquest mes a la posició corresponent i comprova que l’ordre dels mesos és correcte.

Converteix després l’ArrayList en un HashSet i verifica que no es permeten duplicats.

Finalment, recorre la col·lecció amb un bucle for i amb un Iterator.
```

## ✨ Funcionalitats (si és aplicable)
Excepcionalment, he posat tota la lògica dins del Main. Normalment, el Main no tindria els
bucles i la conversió a HashSet.


## 🛠 Tecnologies
- Backend: Java

## 🚀 Instal·lació i Execució
1. Clonar el repositori: `git clone javaITAc26_S01T03`
2. Execució del "Main"


## 📸 Demo
```bash
/usr/lib/jvm/java-1.21.0-openjdk-amd64/bin/java -javaagent:/home/alan/idea-2026.1.1/idea-IU-261.23567.138/lib/idea_rt.jar=46713 -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8 -classpath /home/alan/alan_projects/JavaBootcamp/out/production/JavaBootcamp s103_n1_e01_duplicats.Main
Month: January
Month: February
Month: March
Month: April
Month: May
Month: June
Month: July
Month: August
Month: September
Month: October
Month: November
Month: December
Month: June
Month: March
Month: October
Month: August
Month: April
Month: July
Month: December
Month: February
Month: May
Month: January
Month: September
Month: November

Process finished with exit code 0
```