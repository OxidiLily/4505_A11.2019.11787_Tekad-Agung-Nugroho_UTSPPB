package com.udinus.a4505_a11201911787_tekadagungnugroho_utsppb;

public class MerchandiseList {
    private String namaMerchandise;
    private String deskripsiMerchandise;
    private int gambarMerchandise;

    public MerchandiseList(String namaMerchandise, String deskripsiMerchandise, int gambarMerchandise) {
        this.namaMerchandise = namaMerchandise;
        this.deskripsiMerchandise = deskripsiMerchandise;
        this.gambarMerchandise = gambarMerchandise;
    }

    public String getNamaMerchandise() {
        return namaMerchandise;
    }

    public void setNamaMerchandise(String namaMerchandise) {
        this.namaMerchandise = namaMerchandise;
    }

    public String getDeskripsiMerchandise() {
        return deskripsiMerchandise;
    }

    public void setDeskripsiMerchandise(String deskripsiMerchandise) {
        this.deskripsiMerchandise = deskripsiMerchandise;
    }

    public int getGambarMerchandise() {
        return gambarMerchandise;
    }

    public void setGambarMerchandise(int gambarMerchandise) {
        this.gambarMerchandise = gambarMerchandise;
    }
}
