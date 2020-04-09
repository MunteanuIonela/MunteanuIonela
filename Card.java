package proiect_pao;

import java.util.Calendar;

public class Card {
    public String numar;
    public Integer luna_expirare;
    public Integer an_expirare;

    public Card(String numar, Integer luna_expirare, Integer an_expirare){

        this.numar=numar;
        this.luna_expirare=luna_expirare;
        this.an_expirare=an_expirare;
    }
    public void Expirare(Integer luna_expirare, Integer an_expirare) {

        Calendar calendar = Calendar.getInstance();
        int luna = calendar.get(Calendar.MONTH);
        int an = calendar.get(Calendar.YEAR);
        if (an_expirare < an) {
            System.out.println("Card expirat!");

        } else if (luna_expirare < luna )
                   if( an_expirare == an) {
            System.out.println("Card expirat! A expirat anul acesta.");
        }
    }






    }


