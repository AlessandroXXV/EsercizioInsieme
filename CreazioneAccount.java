import java.util.ArrayList;
import java.util.Scanner;

public class CreazioneAccount
{
   // Attributi
   static ArrayList<Utente> utenti = new ArrayList<Utente>();
   

   // Costruttore
   CreazioneAccount(ArrayList<Utente> utenti)
   {
      this.utenti = utenti;
   }

   public static boolean checkUsername(String username)
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

   public static boolean creazioneAccount()
   {
      Scanner input = new Scanner(System.in); 

      // Creazione account
      System.out.println("CREAZIONE ACCOUNT");
      System.out.println("Inserisci username: ");
      String username = input.nextLine();

      // Controllo se lo username sia unico
      boolean ris = checkUsername(username);
      if(ris == false)
      {
         System.out.println("Inserisci password: ");
         String password = input.nextLine();
         Utente utente = new Utente(username, password);
         utenti.add(utente);

         System.out.println("Utente aggiunto");

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