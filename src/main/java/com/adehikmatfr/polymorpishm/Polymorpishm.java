/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.adehikmatfr.polymorpishm;

/**
 *
 * @author Administrator
 */
public class Polymorpishm {

    public static void main(String[] args) {
        Radio r = new Radio();
        r.on();
        r.gantiChannel(1);
        r.off();
        
        Televisi tv = new Televisi("samsung");
        tv.setListrik(true);
        tv.on();
        tv.gantiChannel(2);
        tv.off();
    }
}
