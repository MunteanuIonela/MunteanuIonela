package proiect.pao;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Main {


    public static void main(String[] args) throws Exception {
        ArrayList<List<String>> employeeList, CPUList, RAMList;


      //Citire lista angajati

        String csvEmployeeFile = "/Users/IONELA/IdeaProjects/proiect.pao/src/proiect/data/Employees.csv";
        CSVUtil employeeCSV = new CSVUtil(csvEmployeeFile);
        employeeList = employeeCSV.read();
        Vanzator[] employees = new Vanzator[employeeList.size()];

        for(int i=0; i< employeeList.size(); i++){
            if(employeeList.get(i) != null){
                LocalDate dataAngajarii = LocalDate.parse(employeeList.get(i).get(2));
                int salariu= Integer.parseInt(employeeList.get(i).get(3));
                employees[i]= new Vanzator(employeeList.get(i).get(0),dataAngajarii,employeeList.get(i).get(1),salariu);
            }}

        //Citire lista procesoare

        String csvCPUFile = "/Users/IONELA/IdeaProjects/proiect.pao/src/proiect/data/CPUS.csv";
        CSVUtil cpuCSV = new CSVUtil(csvCPUFile);
        CPUList = cpuCSV.read();
        CPU[] cpus = new CPU[CPUList.size()];

        for(int i=0; i < CPUList.size(); i++)
            if (CPUList.get(i) != null){
                LocalDate buyDate = LocalDate.parse(CPUList.get(i).get(2));
                int price, stock, cores, threads, lithography, maxMem;
                double freq, turbofreq;
                freq = Double.parseDouble(CPUList.get(i).get(6));
                turbofreq = Double.parseDouble(CPUList.get(i).get(7));
                price = Integer.parseInt(CPUList.get(i).get(0));
                stock = Integer.parseInt(CPUList.get(i).get(1));
                cores = Integer.parseInt(CPUList.get(i).get(8));
                threads = Integer.parseInt(CPUList.get(i).get(9));
                lithography = Integer.parseInt(CPUList.get(i).get(10));
                maxMem = Integer.parseInt(CPUList.get(i).get(12));


                if (CPUList.get(i).get(11).equals("yes")){
                    cpus[i] = new CPU(price,stock,buyDate,CPUList.get(i).get(3), CPUList.get(i).get(4),CPUList.get(i).get(5),freq, turbofreq, cores, threads, lithography,true,maxMem);
                }
                else
                    cpus[i] = new CPU(price,stock,buyDate,CPUList.get(i).get(3), CPUList.get(i).get(4),CPUList.get(i).get(5),freq, turbofreq, cores, threads, lithography,false,maxMem);

            }
        // Citire lista ram

        String csvRAMFile = "/Users/IONELA/IdeaProjects/proiect.pao/src/proiect/data/RAMS.csv";
        CSVUtil ramCSV = new CSVUtil(csvRAMFile);
        RAMList = ramCSV.read();
        RAM[] rams = new RAM[RAMList.size()];

        for(int i=0; i < RAMList.size(); i++)
            if (RAMList.get(i) != null){
                LocalDate buyDate = LocalDate.parse(RAMList.get(i).get(2));
                float price = Float.parseFloat(RAMList.get(i).get(0));
                int size = Integer.parseInt(RAMList.get(i).get(7));
                float voltage = Float.parseFloat(RAMList.get(i).get(8));
                int stock = Integer.parseInt(RAMList.get(i).get(1));

                rams[i] = new RAM(price, stock, buyDate, RAMList.get(i).get(3), RAMList.get(i).get(4), RAMList.get(i).get(5), RAMList.get(i).get(6), size, voltage);
            }


        int productSize = cpus.length + rams.length;
        Produs[] products = new Produs[productSize];

        int nr = cpus.length;
        for(int i=0; i < nr; i++)
            products[i] = new CPU(cpus[i]);
        nr += rams.length;
        for(int i = nr - rams.length, j = 0; i < nr; i++, j++)
            products[i] = new RAM(rams[j]);



        UserServices userServices = new UserServices();
            System.out.println("Search menu:");
            System.out.println("1. Search CPUs");
            System.out.println("2. Search RAMs");
            System.out.println("3. Search employee");
            System.out.println("4. Stergere angajat dupa index");
            System.out.println("5. Stergere angajat dupa un termen");
            System.out.println("6. Verificare stoc produs");
            System.out.println("7. Calculeaza bonusuri de sarbatori");
            System.out.println("8. Calculeaza salarii anuale angajati");
            System.out.println("9. Exit");
            Scanner scanner = new Scanner(System.in);
            System.out.println("Optiunea este:");
            int option = scanner.nextInt();
            while (option != 9) {
                if(option == 1)
                    userServices.searchCPU(cpus);
                if(option == 2)
                    userServices.searchRAM(rams);
                if(option == 3)
                    userServices.searchEmployee(employees);
                if (option == 4) {
                    System.out.println("Index: ");
                    int index = scanner.nextInt();
                    userServices.deleteEmployee(employees, index);
                }
                if (option == 5){
                    System.out.println("Term: ");
                    String term = scanner.next();
                    userServices.deleteEmployee(employees, term);
                }
                if (option == 6)
                    userServices.stocProdus(products);

                if (option == 7)
                    for(int i = 0; i < employees.length; i++) {
                        System.out.println(employees[i].getName());
                        System.out.println("Salariul cu bonus este: " + employees[i].calculareBonus());
                    }
                if (option == 8)
                    for(int i = 0; i < employees.length; i++) {
                        System.out.println(employees[i].getName());
                        System.out.println("Salariu anual: " + employees[i].salariulAnual());
                    }
                else
                if (option > 9 || option < 1)
                    System.out.println("Invalid");
                option = scanner.nextInt();
            }




    }


}

