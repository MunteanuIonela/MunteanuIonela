package proiect.pao;

import java.time.LocalDate;

public class HDD extends SSD {
    private int rpm;

    public int getRpm() {
        return rpm;
    }

    public void setRpm(int rpm) {
        this.rpm = rpm;
    }

    public HDD(float price, int stock, LocalDate purchaseDate, String manufacturer, String color, int capacity, int cache, int rpm) {
        super(price, stock, purchaseDate, manufacturer, color, capacity, cache);
        this.rpm = rpm;
    }

    public HDD(HDD hdd){
        super(hdd.getPret(), hdd.getStoc(), hdd.getDataCumpararii(), hdd.getProducator(), hdd.getCuloare(), hdd.getCapacitate(), hdd.getCache());
        this.rpm = hdd.rpm;
    }
    @Override
    public void InformatiiGenerale() {
        super.InformatiiGenerale();
        System.out.println(getRpm() + "RPM");
    }
}
