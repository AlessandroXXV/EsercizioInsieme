import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Menu 
{
    // Attributi
    ArrayList<Utente> utenti;

    // Costruttore
    public Menu(ArrayList<Utente> utenti)
    {
        this.utenti = utenti;
    }

    public void menu() throws IOException
    {

        try
        {
            // Menu che usa tutte le funzioni di ModuloDati con un'interfaccia grafica
        
            // Istanza oggetto input
            Scanner input = new Scanner(System.in);

            // Menu
            int scelta = 0; 

            do{
                System.out.println();
                System.out.println("Menu Principale:");
                System.out.println("1. Registrazione Nuovo Utente");
                System.out.println("2. Login Utente");
                System.out.println("3. Esci");

                // Inserimento scelta
                System.out.print("Inserisci la tua scelta: ");
                scelta = input.nextInt();

                // Istanza oggetto ModuloDati
                ModuloDati moduloDati = new ModuloDati(utenti);
                
                // Appoggio per memorizzare lo username dell'utente loggato
                String nomeUtente = "";

                // Esegue l'azione corrispondente alla scelta
                switch (scelta) 
                {
                    case 1:
                            moduloDati.creazioneAccount(); 
                            break;

                    case 2:
                            nomeUtente= moduloDati.accesso();
                            moduloDati.menuUtente(nomeUtente);
                        break;

                    case 3:
                            System.out.println("Arrivederci!");
                            break;
                }

            }while(scelta>0 && scelta<3);
        }catch (Exception e) {
            System.out.println("Errore: SEI UN COGLIONE PORCA TROIA" );
            menu();
        }
        
    }
}
    




