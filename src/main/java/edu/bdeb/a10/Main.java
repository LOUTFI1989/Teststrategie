package edu.bdeb.a10;

import java.awt.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Robot r1 = new Robot("Defensif robot");
       //Robot r2 = r1;



        Robot r3 = new Robot(r1);
        r1.setNom("nouveau nom");
//        r3.setStrategie();

        Robot r4 = new Robot("robot normal");
        r4.setStrategie(new NormalBehaviour());

        r1.move();
        r3.move();
        r3.move();
        r4.setStrategie(new DefensifBehaviour());

    }
}