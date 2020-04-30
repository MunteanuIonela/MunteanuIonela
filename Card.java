package proiect.pao;

import java.util.Calendar;

public class Card {

    private String numar;
    private Integer lunaExpirare;
    private Integer anExpirare;

    public Card(String numar, Integer lunaExpirare, Integer anExpirare){

        this.numar=numar;
        this.lunaExpirare=lunaExpirare;
        this.anExpirare=anExpirare;
    }
    public void verificaExpirare() {

        Calendar calendar = Calendar.getInstance();
        int luna = calendar.get(Calendar.MONTH);
        int an = calendar.get(Calendar.YEAR);
        if (anExpirare < an) {
            System.out.println("Card expirat!");

        } else if (lunaExpirare < luna )
            if( anExpirare == an) {
                System.out.println("Card expirat! A expirat anul acesta.");
            }
    }

}
