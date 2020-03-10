package domain.model;

public class Registratie {
    private String naam;
    private String achternaam;
    private String loginnaam;
    private String passwoord;
    private String email;
    private String niveau;

    public Registratie(String naam, String achternaam, String loginnaam, String passwoord, String email, String niveau) {

        this.naam = naam;
        if(achternaam == null)throw new IllegalArgumentException("Achternaam mag niet leeg zijn!");
        this.achternaam = achternaam;
        this.loginnaam = loginnaam;
        this.passwoord = passwoord;
        this.email = email;
        this.niveau = niveau;
    }

    public void setLoginnaam(String loginnaam) {
        if(loginnaam == null) throw new IllegalArgumentException("Loginnaam mag niet leeg zijn!");
        this.loginnaam = loginnaam;
    }

    public void setPasswoord(String passwoord) {
        if(passwoord== null) throw new IllegalArgumentException("Passwoord mag niet leeg zijn!");
        this.passwoord = passwoord;
    }

    public void setEmail(String email) {
        if(email == null) throw new IllegalArgumentException("Email mag niet leeg zijn!");
        this.email = email;
    }

    public String getNaam() {
        return naam;
    }

    public String getAchternaam() {
        return achternaam;
    }

    public String getLoginnaam() {
        return loginnaam;
    }

    public String getEmail() {
        return email;
    }

    public String getNiveau() {
        return niveau;
    }
}


