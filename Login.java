import java.util.Scanner;

public class Login {

    public static void accesso(boolean condizione)
    {   
        boolean accessoAccount = false;
        int count = 5; 
        Scanner scanner = new Scanner(System.in); 
        while (!accessoAccount) 
        {
            System.out.println("Inserisci username e password");
            
            System.out.print("Username: ");
            String username = scanner.nextLine(); 
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
                }
                
            }
        
        }
    }
}
