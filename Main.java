import java.io.IOException;
import java.util.ArrayList;

public class Main 
{
   public static void main(String[] args) throws IOException 
   {
      ArrayList<Utente> utenti = new ArrayList<>();

      // Istanza oggetto Menu
      Menu menu = new Menu(utenti);
      
      // Visualizzazione menu principale
      menu.menu();
  }
}
