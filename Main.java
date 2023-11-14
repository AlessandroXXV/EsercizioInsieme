import java.util.ArrayList;

public class Main 
{
   public static void main(String[] args) 
   {
      ArrayList<Utente> utenti = new ArrayList<>();

      Menu menu = new Menu(utenti);
      menu.menu();
      
  }
}
