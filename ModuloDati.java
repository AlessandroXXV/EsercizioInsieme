import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class ModuloDati 
{
   // Attributi
   ArrayList<Utente> utenti = new ArrayList<>();
   HashMap<Integer, String> hash = new HashMap<>(); 

   /**
    * Metodo in grado di controllare l'esistenza di un utente
    * @param username
    * Username utente
    * @return
    * Restituisce "true" se l'utente esiste, altrimenti restituisce "false"
    */
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

   /**
    * Metod in grado di creare un account
    * @return
    * Restituisce "true" se l'account è stato creato, altrimenti restituisce "false"
    */
    public boolean creazioneAccount()
    {
       Scanner input = new Scanner(System.in); 
 
       // Creazione account
       System.out.println("CREAZIONE ACCOUNT");
       System.out.println("Inserisci username: ");
       String username = input.nextLine();
 
       // Controllo se lo username sia unico
       boolean ris = checkUsername(username);
       int idUtente; 
       if(ris == false)
       {
          System.out.println("Inserisci password: ");
          String password = input.nextLine();
          Utente utente = new Utente(username, password);
          utenti.add(utente);
          System.out.println("Creazione account effettuata con successo");

          // Memorizzo ID utente
          idUtente = utente.getId(); 
          hashing(idUtente);
 
          // Aggiorno lo stato del flag
          ris = true;
       }
       else
       {
          System.out.println("ERRORE, USERNAME ESISTENTE");
          return false;
       }
       return ris;
    }

   /**
    * Metodo in grado di effettuare l'accesso all'account
    * @return
    * Restituisce lo username dell'utente loggato
    */
   public String accesso()
   {   
      // Appoggio per memorizzare lo username dell'utente loggato
      System.out.println("ACCESSO ACCOUNT");
      String u = "";

      Scanner scanner = new Scanner(System.in);
      boolean accessoAccount = false;
      
      do
      {
         System.out.print("Username: ");
         String username = scanner.nextLine(); 

         System.out.print("Password: ");
         String password = scanner.nextLine();

         for(int i = 0; i < utenti.size() && accessoAccount == false; i++)
         {
            if((username.equals(utenti.get(i).getUsername()) && (password.equals(utenti.get(i).getPassword()))))
            {
               System.out.println("ACCESSO EFFETTUATO CON SUCCESSO");
               u = username;
               accessoAccount = true;
               System.out.println("flag: " + accessoAccount);
            }
            else 
            {
               System.out.println("ERRORE, CREDERNZIALI ERRATE");
            }
         }
      }while(accessoAccount == false);
      return u;
   }

   /**
    * Metodo in grado di aggiungere informazioni all'utente loggato
    */
   public void create()
   {
      // Controllo se l'utente si è loggato
      String ris = accesso();
      if (ris.length() > 0) 
      {     
         System.out.println("INSERIMENTO INFORMAZIONI AGGIUNTIVE UTENTE");
         Scanner input = new Scanner(System.in);

         // Inserimento nuove informazioni
         System.out.println("Inserisci il tuo nome: ");
         String nome = input.nextLine();
         System.out.println("Inserisci il tuo cognome: ");
         String cognome = input.nextLine();
         System.out.println("Inserisci indirizzo: ");
         String indirizzo = input.nextLine();
         System.out.println("Inserisci il tuo numero di Telefono: ");
         String numerotel = input.nextLine();

         // Aggiornamento informazioni
         for (Utente utente : utenti)
         {
            utente.setNome(nome);
            utente.setCognome(cognome);
            utente.setIndirizzoCasa(indirizzo);
            utente.setTelefono(numerotel);
         }
      }
   }
   
   /**
    * Metodo in grado di leggere le informazioni dell'utente loggato
    */
   public void read()
   {
      System.out.println("LETTURA INFORMAZIONI UTENTE");

      // Lettura utenti
      if(utenti.size() > 0)
      {
         for (Utente utente : utenti)
         {
            System.out.println("Username: " + utente.getUsername());
            System.out.println("Password: " + utente.getPassword());
            System.out.println("Nome: " + utente.getNome());
            System.out.println("Cognome: " + utente.getCognome());
            System.out.println("Indirizzo: " + utente.getIndirizzoCasa());
            System.out.println("Numero di telefono: " + utente.getTelefono());
         }
      }
      else
      {
         System.out.println("ERRORE, NESSUN UTENTE PRESENTE");
      }
   }

   /**
    * Metodo in grado di modificare le informazioni dell'utente richiesto
    */
   public void update()
   {
      Scanner input = new Scanner(System.in);
      System.out.println("UPDATE INFORMAZIONI UTENTE");
      read();
      System.out.println("Inserisci username utente a cui modificare le informazioni: ");
      String username = input.nextLine();

      // Controllo se esiste l'utente
      boolean ris = checkUsername(username);

      // Se l'utente esiste, allora aggiorno le informazioni
      while(ris)
      {

      }
      if(ris)
      {
         System.out.println("Inserisci il tuo nome: ");
         String nome = input.nextLine();
         System.out.println("Inserisci il tuo cognome: ");
         String cognome = input.nextLine();
         System.out.println("Inserisci indirizzo: ");
         String indirizzo = input.nextLine();
         System.out.println("Inserisci il tuo numero di Telefono: ");
         String numerotel = input.nextLine();

         // Aggiornamento informazioni
         for (Utente utente : utenti)
         {
            utente.setNome(nome);
            utente.setCognome(cognome);
            utente.setIndirizzoCasa(indirizzo);
            utente.setTelefono(numerotel);
         }
      }
      else
      {
         System.out.println("ERRORE, UTENTE NON ESISTENTE");
      }
   }

   /**
    * Metodo in grado di eliminare un utente
    */
   public void delete()
   {
      Scanner input = new Scanner(System.in);
      System.out.println("ELIMINAZIONE UTENTE");
      System.out.println("Inserisci lo username dell'utente da eliminare:");
      String username = input.nextLine();

      // Controllo se esiste l'utente
      boolean ris = checkUsername(username);

      // Se l'utente esiste, allora lo elimino
      if(ris)
      {
         // Ciclo l'array dell'utente
         for(int i = 0; i < utenti.size(); i++)
         {
            // Elimino l'utente richiesto
            if(utenti.get(i).getUsername().equals(username))
            {
               utenti.remove(i);
            }
         }
      }
      else
      {
         System.out.println("ERRORE, UTENTE NON ESISTENTE");
      }
   }


   public void hashing(int id)
   {
      for (Utente utente : utenti)
      {
         if (id == utente.getId())
         {
            hash.put(id, utente.getPassword());  
         }
      }
   }
}
