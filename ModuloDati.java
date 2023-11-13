import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ModuloDati 
{
    static List<Utente> utenti = new ArrayList<>();

    public ModuloDati() {
        
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

    public static void accesso()
    {   
        boolean accessoAccount = false;
        int count = 5; 
        Scanner scanner = new Scanner(System.in); 
        do
        {
            System.out.println("Inserisci username e password");
            
            System.out.print("Username: ");
            String username = scanner.nextLine(); 

            System.out.print("Password: ");
            String password = scanner.nextLine();

            for(Utente utente : CreazioneAccount.utenti)
            {
                if((username.equals(utente.getUsername()) && (password.equals(utente.getPassword()))))
                {
                    System.out.println("Accesso effettuato");
                    accessoAccount = true; 
                }else 
                {
                    System.out.println("Le credenziali sono errate");
                    count--; 
                    accessoAccount = false; 
                }
                
            }
        
        }while (accessoAccount = false); 
    }


    

}
