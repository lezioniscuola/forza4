# forza4

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
|\| 1 | 2 | 3 | 4 | 5 | 6 | 7 | 8 | 9 | 0 |\|
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

DICHIARAZIONE VARIABILI--> dichiarere tutte le variabili e vericare che siano uguali per TUTTI!

VISUALIZZAZIONE--> visualizzare la tabella aggiornata ogni singola volta

SCELTA UTENTE 1 e SCELTA UTENTE 2--> l'utente che deve iniziare a giocare seleziona un numero da uno a zero (come sulla tastiera)  in base alla mossa

CONTROLLO INSERIMENTO PEDINA--> verificare che l'utente secondario se inserito il gettone al posto scelto precedentemente dall'utente primario non vada a sovrapporsi ma si posizioni al di sopra SOLO se prente lo spazio (8 righe), e non terminato.

CONTROLLO VERTICALE--> vericare se i 4 gettoni di un utente sono inseriti ORIZZONTALMENTE consecutivamente e termiare decretando il vincitore

CONTROLLO ORIZZONTALE--> vericare se i 4 gettoni di un utente sono inseriti VERTICALMENTE consecutivamente e termiare decretando il vincitore

CONTROLLO DIAGONALE--> vericare se i 4 gettoni di un utente sono inseriti DIAGONALMENTE consecutivamente e termiare decretando il vincitore

