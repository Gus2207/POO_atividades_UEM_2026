package com.gustavo;

public class PlacaMae {
    private String modelo;
    private String chipset;

    public PlacaMae(String chipset, String modelo) {
        this.chipset = chipset;
        this.modelo = modelo;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getChipset() {
        return chipset;
    }

    public void setChipset(String chipset) {
        this.chipset = chipset;
    }
}
