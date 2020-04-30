package proiect.pao;

import java.time.LocalDate;

public class CPU extends Produs{
    private String nume;
    private String socket;
    private double frequency;
    private double turboFrequency;
    private int cores;
    private int threads;
    private int lithography;
    boolean cpuCooler;
    private int maximumMemory;

    public String getSocket(){
        return socket;
    }
    public void setSocket(String socket){
        this.socket=socket;
    }
    public double getFrequency(){
        return frequency;
    }
    public void setFrequency(double frequency){
        this.frequency=frequency;
    }
    public double getTurboFrequency(){
        return turboFrequency;
    }
    public void setTurboFrequency(double turboFrequency){
        this.turboFrequency=turboFrequency;
    }
    public int getCores(){
        return cores;
    }
    public void setCores(int cores){
        this.cores=cores;
    }

    public int getThreads(){
        return threads;
    }
    public void setThreads(int threads){
        this.threads=threads;
    }
    public int getLithography(){
        return lithography;
    }
    public void setLithography(int lithography){
        this.lithography=lithography;
    }
    public boolean isCpuCooler(){
        return cpuCooler;
    }
    public void setCpuCooler(boolean cpuCooler){
        this.cpuCooler=cpuCooler;
    }
    public int getMaximumMemory(){
        return maximumMemory;
    }
    public void setMaximumMemory(int maximumMemory){
        this.maximumMemory=maximumMemory;
    }
    public String getNume(){
        return nume;
    }
    public void setNume(String nume){
        this.nume=nume;
    }
    public CPU(float pret, int stoc, String producator, String nume,String socket,double frequency,double turboFrequency,int cores, int threads){
        super(pret,stoc,producator);
        this.nume=nume;
        this.socket=socket;
        this.frequency=frequency;
        this.turboFrequency=turboFrequency;
        this.cores=cores;
        this.threads=threads;
    }

    public CPU(float pret, int stoc, LocalDate dataCumpararii,String producator,String culoare, String nume,String socket,double frequency,double turboFrequency, int cores, int threads){
        super(pret,stoc,dataCumpararii,producator,culoare);
        this.nume = nume;
        this.socket = socket;
        this.frequency = frequency;
        this.turboFrequency = turboFrequency;
        this.cores = cores;
        this.threads = threads;
    }
    public CPU(int pret, int stoc, LocalDate dataCumpararii, String producator,String nume, String socket, double frequency,
               double turboFrequency, int cores, int threads, int lithography, boolean cpuCooler, int maximumMemory) {
        super(pret, stoc, dataCumpararii, producator);
        this.nume = nume;
        this.socket = socket;
        this.frequency = frequency;
        this.turboFrequency = turboFrequency;
        this.cores = cores;
        this.threads = threads;
        this.lithography = lithography;
        this.cpuCooler = cpuCooler;
        this.maximumMemory = maximumMemory;
    }
    public CPU(CPU cpu){
        super(cpu.getPret(), cpu.getStoc(),cpu.getDataCumpararii(), cpu.getProducator() );
        this.nume = cpu.getNume();
        this.socket = cpu.getSocket();
        this.frequency = cpu.getFrequency();
        this.turboFrequency = cpu.getTurboFrequency();
        this.cores = cpu.getCores();
        this.threads = cpu.getThreads();
        this.lithography = cpu.getLithography();
        this.cpuCooler = cpu.isCpuCooler();
        this.maximumMemory = cpu.getMaximumMemory();
    }
    public boolean isOverclockable(){
        String numeProducator = this.getNume();
        if(numeProducator.charAt(this.getNume().length()-1)== 'K' || numeProducator.charAt(this.getNume().length()-1)== 'k') {
            System.out.println("This CPU is overclockable \n");
            return true;
        }
        else{
            System.out.println("Not overclockable \n");
            return false;

        }
    }

    @Override
    public void InformatiiGenerale() {
        System.out.println(getProducator() + " " + getNume() + "\n"+ getFrequency()+ "Ghz");
        super.InformatiiGenerale();
    }
}
