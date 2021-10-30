package com.udinus.a4505_a11201911787_tekadagungnugroho_utsppb;

public class FigureList {
    private String namaFigure;
    private String deskripsiFigure;
    private int gambarFigure;

    public FigureList(String namaFigure, String deskripsiFigure, int gambarFigure) {
        this.namaFigure = namaFigure;
        this.deskripsiFigure = deskripsiFigure;
        this.gambarFigure = gambarFigure;
    }

    public String getDeskripsiFigure() {
        return deskripsiFigure;
    }

    public void setDeskripsiFigure(String deskripsiFigure) {
        this.deskripsiFigure = deskripsiFigure;
    }

    public int getGambarFigure() {
        return gambarFigure;
    }

    public void setGambarFigure(int gambarFigure) {
        this.gambarFigure = gambarFigure;
    }

    public String getNamaFigure() {
        return namaFigure;
    }

    public void setNamaFigure(String namaFigure) {
        this.namaFigure = namaFigure;
    }
}
