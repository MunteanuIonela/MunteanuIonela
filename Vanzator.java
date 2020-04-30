package proiect.pao;

import java.time.LocalDate;

import static java.time.temporal.ChronoUnit.*;

public class Vanzator implements calcululAngajatilor{

    private int id;
    private String nume;
    private String adresaLocuintei;
    private LocalDate dataAngajarii;
    private int salariu;
    private float procentBonus;
    private static int numarareID=0;

    public int getId(){
        return id;
    }

    public void setId(int id){
        this.id=id;
    }
    public float getBonusPercent(){
        return procentBonus;
    }
    public void setBonusPercent(float procentBonus){
        this.procentBonus=procentBonus;
    }
    public String getName(){
        return nume;
    }
    public String getStreetAdress(){
        return adresaLocuintei;
    }
    public void setStreetAdress(String adresaLocuintei){
        this.adresaLocuintei=adresaLocuintei;
    }

    public void setName(String nume){
        this.nume=nume;

    }
    public LocalDate getHireDate(){
        return dataAngajarii;
    }
    public void setHireDate(LocalDate dataAngajarii){
        this.dataAngajarii=dataAngajarii;
    }

    public int getSalary(){

        return salariu;
    }
  public void setSalary(int salariu){
        this.salariu=salariu;
  }

   public Vanzator(String nume, LocalDate dataAngajarii, String adresaLocuintei,int salariu ){
        numarareID++;
        this.id=numarareID;
        this.nume=nume;
        this.dataAngajarii=dataAngajarii;
        this.adresaLocuintei=adresaLocuintei;
        this.salariu=salariu;
   }


    @Override
    public float calculareBonus() {

        LocalDate callTime = LocalDate.now();
        String functionName = new Object(){}.getClass().getEnclosingMethod().getName();

        return getSalary() *(getBonusPercent()/100 +1);
    }

    @Override
    public float salariulAnual() {
        LocalDate callTime = LocalDate.now();
        String functionName = new Object(){}.getClass().getEnclosingMethod().getName();
        return 10* getSalary() + 2*calculareBonus();//fiecare angajat primeste bonus de Paste si de Craciun
    }

    @Override
    public void lucreazaDe() {

        LocalDate callTime = LocalDate.now();
        String functionName = new Object(){}.getClass().getEnclosingMethod().getName();

        System.out.println(this.getName() + "lucreaza de: ");
        LocalDate localDate = LocalDate.now();
        long daysBetween = DAYS.between(dataAngajarii,localDate);
        if(daysBetween < 365)
             if(daysBetween>30)
                 System.out.println(MONTHS.between(dataAngajarii,localDate) + "luni \n");
             else
                 System.out.println(daysBetween + "zile \n");
             else
            System.out.println(YEARS.between(dataAngajarii,localDate) + "ani \n");

    }
}
