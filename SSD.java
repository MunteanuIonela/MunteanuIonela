package proiect.pao;

import java.time.LocalDate;

public class SSD extends Produs {
    private int capacitate;
    private String interfata;
    private int cache;
    protected float pretGB;


    public int getCapacitate() {
        return capacitate;
    }

    public void setCapacitate(int capacitate) {
        this.capacitate = capacitate;
    }

    public int getCache() {
        return cache;
    }

    public void setCache(int cache) {
        this.cache = cache;
    }

    public float getPretGB() {
        return pretGB;
    }

    public void setPretGB(float pretGB) {
        this.pretGB = pretGB;
    }

    public SSD(float pret, int stoc, LocalDate dataCumpararii, String producator, String culoare, int capacitate, int cache) {
        super(pret, stoc,dataCumpararii,producator, culoare);
        this.capacitate = capacitate;
        this.cache = cache;
        if (super.getPret() != 0 && capacitate != 0)
            this.pretGB = pret / capacitate;
    }
    public SSD(float pret, int stoc, LocalDate dataCumpararii, String producator, String culoare, int capacitate, String interfata, int cache) {
        super(pret, stoc,dataCumpararii,producator,culoare);
        this.capacitate = capacitate;
        this.interfata = interfata;
        this.cache = cache;
        if (super.getPret() != 0 && capacitate != 0) this.pretGB = pret / capacitate;
    }

    public SSD(SSD ssd){
        super(ssd.getPret(), ssd.getStoc(), ssd.getDataCumpararii(), ssd.getProducator(), ssd.getCuloare());
        this.capacitate = ssd.getCapacitate();
        this.cache = ssd.getCache();
        this.pretGB = ssd.getPretGB();
    }

    @Override
    public void InformatiiGenerale() {
        System.out.println(getProducator() + " " + getCapacitate() + "GB");
        System.out.println(getPretGB() + "RON/GB");
        super.InformatiiGenerale();
    }
}
