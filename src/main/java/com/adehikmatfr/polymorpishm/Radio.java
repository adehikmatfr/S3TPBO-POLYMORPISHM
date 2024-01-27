/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.adehikmatfr.polymorpishm;

/**
 *
 * @author Administrator
 */
public class Radio implements InterfaceElektronik, InterfaceChannelRadio {

    private boolean mesin;
    private int volume;

    public Radio() {
    }

    public boolean isMesin() {
        return mesin;
    }

    public void setMesin(boolean mesin) {
        this.mesin = mesin;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public void perbesarVolume() {
        int vol = this.getVolume();
        if (vol <= 100 && this.isMesin()) {
            this.setVolume(this.getVolume() + 1);
        }
    }

    public void perkecilVolume() {
        int vol = this.getVolume();
        if (vol > 0 && this.isMesin()) {
            this.setVolume(this.getVolume() - 1);
        }
    }

    @Override
    public void on() {
        this.setMesin(true);
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
