public class Utente { 
    private String username;
    private String password;
    private String nome; 
    private String cognome; 
    private String telefono; 
    private String indirizzoCasa; 
    private int id = 0; 

    public Utente(String username, String password, String nome, String cognome, String telefono, String indirizzoCasa) {
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

        // Incremento automatico dell'ID utente
        id++;
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

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String  telefono) {
        this.telefono = telefono;
    }

    public String getIndirizzoCasa() {
        return indirizzoCasa;
    }

    public void setIndirizzoCasa(String indirizzoCasa) {
        this.indirizzoCasa = indirizzoCasa;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }  
}
