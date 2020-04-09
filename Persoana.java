package proiect_pao;

public class Persoana{
    protected String nume;
    protected Integer varsta;
    protected String gen;

    public Persoana(String nume, Integer varsta, String gen){
        this.nume=nume;
        this.varsta=varsta;
        this.gen=gen;
    }
    protected void informatii(){
        System.out.println("Nume: "+ nume + ", Varsta: "+ varsta);
    }

}
