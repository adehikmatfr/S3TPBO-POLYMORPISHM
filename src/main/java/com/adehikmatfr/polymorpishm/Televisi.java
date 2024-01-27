/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.adehikmatfr.polymorpishm;

/**
 *
 * @author Administrator
 */
public class Televisi implements InterfaceElektronik, InterfaceChannelRadio {

    private boolean mesin;
    private boolean listrik;
    private String merek;

    public Televisi(String merek) {
        this.merek = merek;
    }

    public boolean isMesin() {
        return mesin;
    }

    public void setMesin(boolean mesin) {
        this.mesin = mesin;
    }

    public boolean isListrik() {
        return listrik;
    }

    public void setListrik(boolean listrik) {
        this.listrik = listrik;
    }

    public String getMerek() {
        return merek;
    }

    public void setMerek(String merek) {
        this.merek = merek;
    }

    @Override
    public void on() {
        if (this.isListrik()){
            this.setMesin(true);
        }
    }

    @Override
    public void off() {
        this.setMesin(false);
    }

    @Override
    public void gantiChannel(int c) {
        if (this.isMesin()) {
           System.out.println("rubah channel ke " + c); 
        }
    }
}
