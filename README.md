# forza4


*BOLLETTINO --> JOLLY, getisce il main e coordina/aiuta gli altri, assegna le variabili

Cortinovis --> CONTROLLO GENERALE

Silva --> RANDOM

Manenti --> CONTROLLO VERTICALE

Longo --> CONTROLLO ORIZZONTALE

Roncelli --> CONTROLLO DIAGONALE

Pica --> VISUALIZZAZIONE

Luraschi --> PROGRAM TESTER



Appunti: Gruppo 3
	Realizzazione forza quattro.
	Funzioni da realizzare:
Prefase
		-f()==> Creazione del campo, data la dimensione;
			Specifiche: 0=nulla,1=g1,9=g2;
Stampa
		-f()==> Stampa del campo;
Azioni in gioco
		-f()==> Inserimento della pedina;
			Specifiche: Trovato il fiore (9) il gioco termina, viene visualizzato il numero;
		-f()==> Controllo colonna: inserire la pozione libera;
		-f()==>Controllo orizzontale;
		-f()==>Controllo verticale;
		-f()==>Controllo diagonale destra;
		-f()==>Controllo diagonale sinistra;
		-f()==>Controllo generale che richiama le 4 precedenti;

 Unione del gioco:
		-f()==> Main



|\|||||||||||||||||||||||||||||||||||||||||\|
|\| 0 | 1 | 2 | 3 | 4 | 5 | 6 | 7 | 8 | 9 |\|
|\|||||||||||||||||||||||||||||||||||||||||\|
|\|- -|- -|- -|- -|- -|- -|- -|- -|- -|- -|\|
|\|                                       |\|
|\|- -|- -|- -|- -|- -|- -|- -|- -|- -|- -|\|
|\|                                       |\|
|\|- -|- -|- -|- -|- -|- -|- -|- -|- -|- -|\|
|\|                                       |\|
|\|- -|- -|- -|- -|- -|- -|- -|- -|- -|- -|\|
|\|                                       |\|
|\|- -|- -|- -|- -|- -|- -|- -|- -|- -|- -|\|
|\|                                       |\|
|\|- -|- -|- -|- -|- -|- -|- -|- -|- -|- -|\|
|\|                                       |\|
|\|- -|- -|- -|- -|- -|- -|- -|- -|- -|- -|\|
|\|                                       |\|
|\|- -|- -|- -|- -|- -|- -|- -|- -|- -|- -|\|
|\|||||||||||||||||||||||||||||||||||||||||\|


FUNZIONI DA CREARE:

DIVIDERE IN DUE MENU--> dividere il gioco in un 1 vs 1 e 1 vs RANDOM(quindi single player)

RANDOM--> inserire un random per scegliwere quale utente inizia per prima
          inserire un random che, se si gioca in single player, scelga ogni volta un numero da 0 a 9 (sono 10 colonne).

VISUALIZZAZIONE--> visualizzare ogni volta, per ogni singola mossa la tabella aggiornata

SCELTA UTENTE 1 e SCELTA UTENTE 2--> permettere all'utente (prima uno, poi l'altro) di inserire il gettone in una colonna da 0 a 9 (sono 10 colonne)

CONTROLLO GENERALE--> verifichi che l'utente secondario se inserito il gettone nella colonna già scelta precedentemente non vada a sovrapporre il gettone ma ad'inserirlo in alto se presente spazio, quindi non terminato, SONO 8 RIGHE.

CONTROLLO VERTICALE--> verificare che i 4 gettoni inseriti siano VERTICALMENTE consecutivi e che siano tutti di un utente e decretare il vincitore

CONTROLLO ORIZZONTALE--> verificare che i 4 gettoni inseriti siano ORIZZONTALMENTE consecutivi e che siano tutti di un utente e decretare il vincitore

CONTROLLO DIAGONALE--> verificare che i 4 gettoni inseriti siano DIAGONALMENTE consecutivi e che siano tutti di un utente e decretare il vincitore

PROGRAM TESTER--> gioca a forza quattro e verifica se tutto funziona correttamente (forse)

