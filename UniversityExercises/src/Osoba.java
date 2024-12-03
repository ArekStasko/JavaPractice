public class Osoba {
    public String Imie;
    public String Nazwisko;
    public int RokUrodzenia;

    public Osoba(String imie, String nazwisko, int rokUrodzenia){
        Imie = imie;
        Nazwisko = nazwisko;
        RokUrodzenia = rokUrodzenia;
    }

    public void Show()
    {
        System.out.println("Imie: " + Imie);
        System.out.println("Nazwisko: " + Nazwisko);
        System.out.println("Rok Urodzenia: " + RokUrodzenia);
    }

}
