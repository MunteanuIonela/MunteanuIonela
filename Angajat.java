package proiect_pao;

import java.sql.SQLOutput;

public class Angajat extends Persoana {
    public double salariu;
    public Angajat(String nume,Integer varsta,String gen,Double salariu){
        super(nume,varsta,gen);
        this.salariu=salariu;
        System.out.println("Sunt un angajat");

    }
};
