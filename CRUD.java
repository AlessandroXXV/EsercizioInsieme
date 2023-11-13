import java.util.Scanner;

public class CRUD {
    
    public static void create(){
        //aggiunge informazioni all'utente loggato
        if (Login.accesso == 0) {
            System.out.println("Inserisci qualche altro dato per completare l'Account:");
            
            Scanner msc = new Scanner(System.in);
            private String nome; 
            private String cognome; 
            private String indirizzo; 
            private int numerotel;

            //Scanner per nome
            System.out.println("Inserisci il tuo nome");
            nome = msc.nextLine();

            msc.nextLine();

            //Scanner per cognome
            System.out.println("Inserisci il tuo cognome");
            cognome = msc.nextLine();

            msc.nextLine();

            
            //Scanner per indirizzo
            System.out.println("\nAggiungi il tuo Indirizzo");
            indirizzo = msc.nextLine();   
           
            msc.nextLine();

            //scanner per numero di telefono
            System.out.println("\nAggiungi il tuo numero di Telefono");
            numerotel = msc.nextInt();  


            

            msc.close();

        }

    }

    public static void read(){

    }
}    
