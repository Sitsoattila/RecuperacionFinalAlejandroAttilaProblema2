package com.company;

public class Main {



        public static void main(String[] args) {
            DragonFly dragon = new DragonFly(300, 20, "WKL-91823");

            System.out.println(dragon.energyLevel());
            dragon.move();
            System.out.println(dragon.status());

            dragon.recharge();

            dragon.returnHome();
        }
    }