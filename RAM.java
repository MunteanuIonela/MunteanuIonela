package proiect.pao;

import java.time.LocalDate;

public class RAM extends Produs{
    private String type;
    private String speed;
    private int Size;
    private float voltage;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getSpeed() {
        return speed;
    }

    public void setSpeed(String speed) {
        this.speed = speed;
    }

    public int getSize() {
        return Size;
    }

    public void setSize(int size) {
        Size = size;
    }

    public float getVoltage() {
        return voltage;
    }

    public void setVoltage(float voltage) {
        this.voltage = voltage;
    }
    public RAM(float pret, int stoc, String producator, String type, String speed, int size) {
        super(pret,stoc,producator);
        this.type = type;
        this.speed = speed;
        Size = size;
    }

    public RAM(float pret, int stoc, LocalDate dataCumpararii, String producator, String culoare, String type, String speed, int size, float voltage) {
        super(pret,stoc,dataCumpararii,producator,culoare);
        this.type = type;
        this.speed = speed;
        Size = size;
        this.voltage = voltage;
    }

    public RAM(RAM ram){
        super(ram.getPret(), ram.getStoc(), ram.getDataCumpararii(), ram.getProducator());
        this.type = ram.getType();
        this.speed = ram.getSpeed();
        this.Size = ram.getSize();
        this.voltage = ram.getVoltage();
    }


    @Override
    public void InformatiiGenerale() {
        System.out.println(getProducator() + " " + getSize() + "GB" + getSpeed());
        super.InformatiiGenerale();
    }
}
