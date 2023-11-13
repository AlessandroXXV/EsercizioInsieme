public class Utente {
    
    private String username;
    private String password;
    private String nome; 
    private String cognome; 
    private int telefono; 
    private String indirizzoCasa; 




    public Utente(String username, String password, String nome, String cognome, int telefono, String indirizzoCasa) {
        this.username = username;
        this.password = password;
        this.nome = nome;
        this.cognome = cognome;
        this.telefono = telefono;
        this.indirizzoCasa = indirizzoCasa;
    }




    public Utente(String username, String password) {
        this.username = username;
        this.password = password;
    }

    


    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getIndirizzoCasa() {
        return indirizzoCasa;
    }

    public void setIndirizzoCasa(String indirizzoCasa) {
        this.indirizzoCasa = indirizzoCasa;
    } 

    

}
