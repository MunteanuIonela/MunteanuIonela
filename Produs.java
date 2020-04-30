package proiect.pao;

import java.time.LocalDate;

public class Produs {

    private float pret;
    private int Stoc;
    private LocalDate dataCumpararii;
    private String producator;
    private String culoare;
    private float discount;

    public float getPret(){
        return pret;
    }
    public void setPret(float pret){
        this.pret=pret;
    }
    public int getStoc(){
        return Stoc;
    }
    public void setStoc(int stoc){
        Stoc=stoc;
    }
    public LocalDate getDataCumpararii(){
        return dataCumpararii;
    }
    public void setDataCumpararii(LocalDate dataCumpararii){
        this.dataCumpararii=dataCumpararii;
    }
    public String getProducator(){
        return producator;
    }
    public void setProducator(String producator){
        this.producator=producator;
    }
    public String getCuloare(){
        return culoare;
    }
    public void setCuloare(String culoare){
        this.culoare=culoare;
    }
    public Produs(float pret, int stoc, String producator){
        this.pret=pret;
        Stoc=stoc;
        this.producator=producator;

    }
    public Produs(float pret, int stoc, LocalDate dataCumpararii,String producator,String culoare){
        this.pret=pret;
        Stoc +=stoc;
        this.dataCumpararii=dataCumpararii;
        this.producator=producator;
        this.culoare=culoare;
    }

    public Produs( float pret, int stoc, LocalDate dataCumpararii,String producator){
        this.pret=pret;
        Stoc=stoc;
        this.dataCumpararii=dataCumpararii;
        this.producator=producator;
    }

    public void InformatiiGenerale(){
        if(verificaStoc()!= 0){
            if(getCuloare()!= null)
                System.out.println("Culoarea: " + this.getCuloare() + "\n" + "Pretul:" + this.getPret() + "\n");
            else
                System.out.println("Pretul: " + this.getPret() + "\n");
        }
    }
    public int verificaStoc(){
        if(getStoc() == 0){
            System.out.println("Out of stock");
                    return 0;
        }
        else{
            System.out.println("Current stock is : " + getStoc() );
            return getStoc();
    }
    }
}

