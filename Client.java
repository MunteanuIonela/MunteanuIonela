package proiect.pao;

public class Client extends Persoana {
    public Client(String nume, Integer varsta, String gen) {
        super(nume, varsta, gen);}


     public void esteAdult(int varsta)  {
            if(varsta<18)
                System.out.println("Este minor!Nu poate plati singur.");
            else
                System.out.println("Este adult.");
        }
    }

