import java.io.IOException;
import java.util.ArrayList;

public class Main 
{
   public static void main(String[] args) throws IOException 
   {
      ArrayList<Utente> utenti = new ArrayList<>();

      Menu menu = new Menu(utenti);
      menu.menu();
      
  }
}
