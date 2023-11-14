import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;  

public class Backup {
    
    public static void backupDati(ArrayList<Utente> utenti)
    {
        String path = "C:\\Users\\aledr\\OneDrive - Politecnico di Milano\\LEZIONI\\MATERIE SPECIALISTICHE\\JavaWeb\\src\\EsercizioInsieme\\backup.txt"; 
        
        
        try (FileWriter fw = new FileWriter(path, true);
            BufferedWriter bw = new BufferedWriter(fw))
        {
            // leggo i valori e li memorizzo 
            for (Utente utente : utenti)
            {
                bw.write("Username: " + utente.getUsername() + " Password: " + utente.getPassword() + " Nome: " + utente.getNome() +
                " COgnome: " + utente.getCognome() + " Telefono: " + utente.getTelefono() + " Indirizzo: " + utente.getIndirizzoCasa() + " Id: " + utente.getId() + ";"); // added semicolon here
            }
        } catch (IOException e)
        {
            System.out.println(e.getMessage());
        }
    } // added closing curly brace here
}


