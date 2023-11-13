import java.util.ArrayList;
import java.util.Scanner;

public class CreazioneAccount
{
   // Attributi
   static ArrayList<Utente> utenti = new ArrayList<Utente>();
   Scanner input;

   // Costruttore
   CreazioneAccount(ArrayList<Utente> utenti)
   {
      this.utenti = utenti;
      input = new Scanner(System.in);
   }

   public boolean checkUsername(String username)
   {
      // Inizializzazione pessimistica
      boolean ris = false;

      // Controllo se esiste uno username uguale all'interno dell'arraylist
      for(int i = 0; i < utenti.size(); i++)
      {
         if(utenti.get(i).getUsername().equals(username))
         {
            // Aggiorno lo stato del flag
            ris = true;
         }
      }

      return ris;
   }

   public boolean creazioneAccount()
   {
      // Creazione account
      System.out.println("CREAZIONE ACCOUNT");
      System.out.println("Inserisci username: ");
      String username = input.next();

      // Controllo se lo username sia unico
      boolean ris = checkUsername(username);
      if(ris == false)
      {
         System.out.println("Inserisci password: ");
         String password = input.next();
         Utente utente = new Utente(username, password);
         utenti.add(utente);

         // Aggiorno lo stato del flag
         ris = true;
      }
      else
      {
         System.out.println("Username già esistente");
         return false;
      }

      return true;
   }
}