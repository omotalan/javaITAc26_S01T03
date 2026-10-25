# Gestor de persones amb ordenació
**Descripció**: Sprint 1, Tasca 3, Nivell 3, Exercici 1

## 📌 Exercici 1 — Gestor de persones amb ordenació
```
Crea una aplicació capaç de llegir un fitxer CSV. Aquest fitxer té 3 camps: nom, cognom i DNI, per cada registre. Es tracta d’ordenar les persones llegides del fitxer, mitjançant el seu nom, cognom o DNI. Pots fer servir la llista que creguis més adient.

La classe Persona té 3 atributs:


nom  
cognom  
DNI  

La classe principal té el següent menú:


1. Introduir persona.  
2. Mostrar les persones ordenades per nom (A-Z).  
3. Mostrar les persones ordenades per nom (Z-A).  
4. Mostrar les persones ordenades per cognoms (A-Z).  
5. Mostrar les persones ordenades per cognoms (Z-A).  
6. Mostrar les persones ordenades per DNI (1-9).  
7. Mostrar les persones ordenades per DNI (9-1).  
0. Sortir.

El programa haurà de llistar les persones com el següent exemple:


___Nom___       ____Cognoms______    ___NIF___  
Andreu          Ballestero Llenas    34835767J  
Miquel          Bayona Font          48743957B  
Guillem         Capdevila Riu        33957834J  
Albert          Carbonell Ferrer     77364986R  
Ferran          Casas Coderch        23047848P  
Maria           Casellas Fuste       47102244S  
Genis           Ciutat Vendrell      39718459N
```

## ✨ Funcionalitats (si és aplicable)
Per gestionar l'entitat "Persona" apropiadament, calia separar les seves diferents responsabilitats:
les característiques de la persona (classe Person), la llista de persones a gestionar (PersonList) i
els mètodes de manipulació d'aquesta llista o de la pròpia persona (PersonService).

PersonService es crida des de ConsoleUI, que guarda només la UI i l'input des de la terminal, l'únic
input necessari abans d'inicialitzar el programa (el filepath). Els altres inputs ja pertanyen a la
gestió de persones i de la llista, així que viuen dins de PersonService.


## 🛠 Tecnologies
- Backend: Java

## 🚀 Instal·lació i Execució
1. Clonar el repositori: `git clone javaITAc26_S01T03`
2. Execució del "Main"


## 📸 Demo
```bash
/usr/lib/jvm/java-1.21.0-openjdk-amd64/bin/java -javaagent:/home/alan/idea-2026.1.1/idea-IU-261.23567.138/lib/idea_rt.jar=38337 -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8 -classpath /home/alan/alan_projects/JavaBootcamp/out/production/JavaBootcamp s103_n3_e01_csvPerson.Main
Enter the path to the person list file: javaITAc26_S01T03/src/s103_n3_e01_csvPerson/persones.csv

1. Introduir persona.
2. Mostrar les persones ordenades per nom (A-Z).
3. Mostrar les persones ordenades per nom (Z-A).
4. Mostrar les persones ordenades per cognoms (A-Z).
5. Mostrar les persones ordenades per cognoms (Z-A).
6. Mostrar les persones ordenades per DNI (1-9).
7. Mostrar les persones ordenades per DNI (9-1).
0. Sortir.
Opció: 2
___Nom___       ____Cognoms______    ___NIF___ 
Albert          Carbonell Ferrer     77364986R 
Andreu          Ballestero Llenas    34835767J 
Ferran          Casas Coderch        23047848P 
Genis           Ciutat Vendrell      39718459N 
Guillem         Capdevila Riu        33957834J 
Maria           Casellas Fuste       47102244S 
Miquel          Bayona Font          48743957B 

1. Introduir persona.
2. Mostrar les persones ordenades per nom (A-Z).
3. Mostrar les persones ordenades per nom (Z-A).
4. Mostrar les persones ordenades per cognoms (A-Z).
5. Mostrar les persones ordenades per cognoms (Z-A).
6. Mostrar les persones ordenades per DNI (1-9).
7. Mostrar les persones ordenades per DNI (9-1).
0. Sortir.
Opció: 7
___Nom___       ____Cognoms______    ___NIF___ 
Albert          Carbonell Ferrer     77364986R 
Miquel          Bayona Font          48743957B 
Maria           Casellas Fuste       47102244S 
Genis           Ciutat Vendrell      39718459N 
Andreu          Ballestero Llenas    34835767J 
Guillem         Capdevila Riu        33957834J 
Ferran          Casas Coderch        23047848P 

1. Introduir persona.
2. Mostrar les persones ordenades per nom (A-Z).
3. Mostrar les persones ordenades per nom (Z-A).
4. Mostrar les persones ordenades per cognoms (A-Z).
5. Mostrar les persones ordenades per cognoms (Z-A).
6. Mostrar les persones ordenades per DNI (1-9).
7. Mostrar les persones ordenades per DNI (9-1).
0. Sortir.
Opció: 4
___Nom___       ____Cognoms______    ___NIF___ 
Andreu          Ballestero Llenas    34835767J 
Miquel          Bayona Font          48743957B 
Guillem         Capdevila Riu        33957834J 
Albert          Carbonell Ferrer     77364986R 
Ferran          Casas Coderch        23047848P 
Maria           Casellas Fuste       47102244S 
Genis           Ciutat Vendrell      39718459N 

1. Introduir persona.
2. Mostrar les persones ordenades per nom (A-Z).
3. Mostrar les persones ordenades per nom (Z-A).
4. Mostrar les persones ordenades per cognoms (A-Z).
5. Mostrar les persones ordenades per cognoms (Z-A).
6. Mostrar les persones ordenades per DNI (1-9).
7. Mostrar les persones ordenades per DNI (9-1).
0. Sortir.
Opció: 1
Nom: Alanzin
Cognom: Zin Zin
DNI: 12345678L
Persona afegida.

1. Introduir persona.
2. Mostrar les persones ordenades per nom (A-Z).
3. Mostrar les persones ordenades per nom (Z-A).
4. Mostrar les persones ordenades per cognoms (A-Z).
5. Mostrar les persones ordenades per cognoms (Z-A).
6. Mostrar les persones ordenades per DNI (1-9).
7. Mostrar les persones ordenades per DNI (9-1).
0. Sortir.
Opció: 1
Nom: Poesin
Cognom: Zezin
DNI: 45678912K
Persona afegida.

1. Introduir persona.
2. Mostrar les persones ordenades per nom (A-Z).
3. Mostrar les persones ordenades per nom (Z-A).
4. Mostrar les persones ordenades per cognoms (A-Z).
5. Mostrar les persones ordenades per cognoms (Z-A).
6. Mostrar les persones ordenades per DNI (1-9).
7. Mostrar les persones ordenades per DNI (9-1).
0. Sortir.
Opció: 2
___Nom___       ____Cognoms______    ___NIF___ 
Alanzin         Zin Zin              12345678L 
Albert          Carbonell Ferrer     77364986R 
Andreu          Ballestero Llenas    34835767J 
Ferran          Casas Coderch        23047848P 
Genis           Ciutat Vendrell      39718459N 
Guillem         Capdevila Riu        33957834J 
Maria           Casellas Fuste       47102244S 
Miquel          Bayona Font          48743957B 
Poesin          Zezin                45678912K 

1. Introduir persona.
2. Mostrar les persones ordenades per nom (A-Z).
3. Mostrar les persones ordenades per nom (Z-A).
4. Mostrar les persones ordenades per cognoms (A-Z).
5. Mostrar les persones ordenades per cognoms (Z-A).
6. Mostrar les persones ordenades per DNI (1-9).
7. Mostrar les persones ordenades per DNI (9-1).
0. Sortir.
Opció: 0
Adéu!

Process finished with exit code 0
```