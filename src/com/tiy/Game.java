package com.tiy;

import java.util.Scanner;

public class Game {
    Scanner sc = new Scanner(System.in);
    private Player genericPlayer1;
    private Player genericPlayer2;

    public Game(Player genericPlayer1, Player genericPlayer2) {
        this.genericPlayer1 = genericPlayer1;
        this.genericPlayer2 = genericPlayer2;
        System.out.println("Creating a new game between " + genericPlayer1.getName() + " and " + genericPlayer2.getName() + "." );
    }

    public void play() {


        Die sixSidedDie = new Die(6);

        System.out.println("Would you like to play a game... of thrones?");

        do {

            Integer damageDealt = sixSidedDie.roll();
            System.out.println(genericPlayer1.getName() + " has caused " + genericPlayer2.getName() + " " + damageDealt + " Lannisters of damage");
            genericPlayer2.hit(damageDealt);
            damageDealt = sixSidedDie.roll();

            System.out.println(genericPlayer2.getName() + " has caused " + genericPlayer1.getName() + " " + damageDealt + " Lannisters of damage.");

            genericPlayer1.hit(damageDealt);

        } while (genericPlayer1.getHP() > 0 && genericPlayer2.getHP() > 0);


        if(genericPlayer1.getHP() > genericPlayer2.getHP()) {
            System.out.println(genericPlayer2.getName() + " bends the knee.");
            sc.next();
            System.out.println("..But winter is coming..");
        } else {
            System.out.println(genericPlayer1.getName() + "bends the knee.");
            sc.next();
            System.out.println("..But winter is coming..");
            }

    }
}
