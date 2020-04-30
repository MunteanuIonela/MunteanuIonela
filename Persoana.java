package proiect.pao;

public class Persoana {
    private String nume;
    protected Integer varsta;
    private String gen;


    public Persoana(String nume, Integer varsta, String gen){
        this.nume=nume;
        this.varsta=varsta;
        this.gen=gen;
    }
    protected void informatii(){
        System.out.println("Nume: "+ nume + ", Varsta: "+ varsta+ ", Gen: "+ gen);
    }

}


