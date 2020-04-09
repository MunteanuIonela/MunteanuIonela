package proiect_pao;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        Card card=new Card("sac",2,2020);
        card.Expirare(card.luna_expirare, card.an_expirare);

        Produs produs=new Produs("fusta",300,false);
        produs.Defect(produs.defect);

        Persoana persoana=new Persoana("Ionescu",21,"masculin");
        persoana.informatii();


        Client client=new Client("Popescu",19,"Masculin");
        client.esteAdult(client.varsta);
    }

///partea aceasta nu mi-a iesit cum voiam...:/
    private static void bon(String text_input, String text_output) throws FileNotFoundException {

    Map <String, Integer> lista = new HashMap<>();
    try(BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(text_input)))){

        while(true){
            String line=reader.readLine();
            if(line==null) break;
            String[] cumparaturi=line.split(",");
            if(cumparaturi.length != 3){
                continue;
            }
            String produse= cumparaturi[2];
            int preturi=Integer.parseInt(cumparaturi[3]);

            if(lista.containsKey((produse))){
                lista.put(produse, preturi+lista.get(produse));
            }
            else{
                lista.put(produse,preturi);
            }
            System.out.println(cumparaturi);
        }

    } catch (IOException e) {
        e.printStackTrace();
    }


        }





    }

