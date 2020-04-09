package proiect_pao;

public class Produs {
    public String tip;
    public Integer pret;
    public Boolean defect;

    public Produs(String tip, Integer pret, Boolean defect){
        this.tip=tip;
        this.pret=pret;
        this.defect=defect;
    };
    public  void Defect(Boolean defect){

        if(this.defect)
            System.out.println("Produsul are un defect!Trebuie returnat!");
        else
            System.out.println("Produsul nu are niciun defect.Poate fi incasat.");


    }
}
