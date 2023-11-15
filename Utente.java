public class Utente { 
    private String username;
    private String password;




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
